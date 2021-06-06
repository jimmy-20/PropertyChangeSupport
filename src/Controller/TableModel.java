/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Pojo.Persona;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class TableModel extends AbstractTableModel implements PropertyChangeListener{
    private List<Persona> list;
    private String[] header;

    public TableModel(List<Persona> list, String[] header) {
        this.list = list;
        this.header = header;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return list.get(i).toArray()[i1];
    }

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        if (pce.getNewValue() != null){
            add((Persona) pce.getNewValue());
        }else{
            delete((int) pce.getOldValue());
        }
        fireTableDataChanged();
    }
    
    public void add(Persona p){
        list.add(p);
    }
    
    public void delete(int row){
        list.remove(row);
    }

    @Override
    public String getColumnName(int i) {
        return header[i];
    }
    
    public List<Persona> getTable(){
        return list;
    }
    
    public Persona getRow(int row){
        return list.get(row);
    }
    
    
    
    
    
}
