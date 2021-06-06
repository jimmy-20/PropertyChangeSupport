/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import javax.swing.JTable;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class PnlTable extends javax.swing.JPanel {

    public PnlTable() {
        initComponents();
    }

    public JTable getTblView() {
        return tblView;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Personas"));
        setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setViewportView(tblView);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblView;
    // End of variables declaration//GEN-END:variables
}
