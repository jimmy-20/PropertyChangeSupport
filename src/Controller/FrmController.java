/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Panels.PnlData;
import Panels.PnlTable;
import Pojo.Persona;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class FrmController {
    private PnlData pnlData;
    private PnlTable pnlTable;
    private PropertyChangeSupport propertyChangeSupport;
    
    List<Persona> personas;
    String[] header = {"Nombres","Apellidos","Edad"};
    private TableModel tableModel;
    
    private Persona persona = null;
    
    public FrmController(PnlData pnlData, PnlTable pnlTable){
        this.pnlData = pnlData;
        this.pnlTable = pnlTable;
        personas = new ArrayList<>();
        initComponent();
    }

    private void initComponent() {
        tableModel = new TableModel(personas, header);
        pnlTable.getTblView().setModel(tableModel);
        
        propertyChangeSupport = new PropertyChangeSupport(this);
        propertyChangeSupport.addPropertyChangeListener(tableModel);
        
        pnlData.getBtnAgregar().addActionListener((e) ->
        {
            btnAgregarActionPerformed(e);
        });
        
        pnlData.getBtnEliminar().addActionListener(((e) ->
        {
            btnEditarActionPerformed(e);
        }));
    }

    private void btnAgregarActionPerformed(ActionEvent e) {
        String nombre = pnlData.getTxtNombre().getText();
        String apellido = pnlData.getTxtApellido().getText();
        int edad = (int) pnlData.getSpnEdad().getValue();
        
        Persona p = new Persona(nombre, apellido, edad);
        propertyChangeSupport.firePropertyChange("persona", persona, p);
    }

    private void btnEditarActionPerformed(ActionEvent e) {
        int row = pnlTable.getTblView().getSelectedRow();
                
        propertyChangeSupport.firePropertyChange("row",row, null);
        
        
            
    }
    
}
