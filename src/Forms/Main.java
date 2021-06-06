/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controller.FrmController;
import Panels.PnlData;
import Panels.PnlTable;
import java.awt.BorderLayout;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class Main extends javax.swing.JFrame {
    private PnlData pnlData;
    private PnlTable pnlTable;
    
    private FrmController frmController;
    
    public Main() {
        initComponents();
        
        pnlData = new PnlData();
        pnlTable = new PnlTable();
        frmController = new FrmController(pnlData, pnlTable);
        
        pnlDatos.add(pnlData,BorderLayout.CENTER);
        pnlTabla.add(pnlTable,BorderLayout.CENTER);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Personas");
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.GridLayout(2, 0));

        pnlDatos.setBackground(new java.awt.Color(204, 204, 255));
        pnlDatos.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlDatos);

        pnlTabla.setBackground(new java.awt.Color(255, 222, 204));
        pnlTabla.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlTabla);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlTabla;
    // End of variables declaration//GEN-END:variables
}
