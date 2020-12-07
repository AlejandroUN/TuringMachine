/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.MTMain;

import Entidades.MT;
import Views.Main;

/**
 *
 * @author aleja
 */
public class MTOptionsView extends javax.swing.JFrame {

    MT mt;
    /**
     * Creates new form MTOptionsView
     */
    public MTOptionsView(MT mt) {
        initComponents();
        this.mt = mt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processWithDetailsButton = new javax.swing.JButton();
        procesarListaCadenasButton = new javax.swing.JButton();
        toStringButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        procesarCadenaButton = new javax.swing.JButton();
        procesarFuncionButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        processWithDetailsButton.setText("Procesar Cadena con Detalles");
        processWithDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processWithDetailsButtonActionPerformed(evt);
            }
        });

        procesarListaCadenasButton.setText("Procesar Lista de Cadenas");
        procesarListaCadenasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarListaCadenasButtonActionPerformed(evt);
            }
        });

        toStringButton.setText("toString()");
        toStringButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toStringButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Métodos Máquina de Turing");

        jLabel2.setText("Por favor, seleccione uno de los métodos del autómata");

        procesarCadenaButton.setText("ProcesarCadena");
        procesarCadenaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarCadenaButtonActionPerformed(evt);
            }
        });

        procesarFuncionButton.setText("Procesar Funcion");
        procesarFuncionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarFuncionButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(procesarCadenaButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(procesarListaCadenasButton)
                            .addComponent(processWithDetailsButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(procesarFuncionButton)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(toStringButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(procesarCadenaButton)
                .addGap(18, 18, 18)
                .addComponent(processWithDetailsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(procesarFuncionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(procesarListaCadenasButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toStringButton)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processWithDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processWithDetailsButtonActionPerformed
        MTProcesarCadenaConDetallesView mtProcesarCadenaConDetallesView = new MTProcesarCadenaConDetallesView(mt);
        mtProcesarCadenaConDetallesView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_processWithDetailsButtonActionPerformed

    private void procesarListaCadenasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarListaCadenasButtonActionPerformed
        MTProcesarListaCadenasView mtListaCadenasView = new MTProcesarListaCadenasView(mt);
        mtListaCadenasView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_procesarListaCadenasButtonActionPerformed

    private void toStringButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toStringButtonActionPerformed
        MTToString mtToString = new MTToString(mt);
        mtToString.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toStringButtonActionPerformed

    private void procesarCadenaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarCadenaButtonActionPerformed
        MTProcesarCadenaView mtProcesarCadenaView = new MTProcesarCadenaView(mt);
        mtProcesarCadenaView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_procesarCadenaButtonActionPerformed

    private void procesarFuncionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesarFuncionButtonActionPerformed
        MTProcesarFuncion mtProcesarFuncion = new MTProcesarFuncion(mt);
        mtProcesarFuncion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_procesarFuncionButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton procesarCadenaButton;
    private javax.swing.JButton procesarFuncionButton;
    private javax.swing.JButton procesarListaCadenasButton;
    private javax.swing.JButton processWithDetailsButton;
    private javax.swing.JButton toStringButton;
    // End of variables declaration//GEN-END:variables
}