
package com.sistemas.views;

import com.sistemas.controllers.MotorController;
import java.util.logging.Level;
import java.util.logging.Logger;
import jess.JessException;

public class GimView extends javax.swing.JFrame {
    private MotorController motorController;

    public GimView() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOpciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrbSi = new javax.swing.JRadioButton();
        jrbNo = new javax.swing.JRadioButton();
        jlPregunta = new javax.swing.JLabel();
        jbSiguiente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Complemento Muscular");

        bgOpciones.add(jrbSi);
        jrbSi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbSi.setForeground(new java.awt.Color(51, 51, 51));
        jrbSi.setText("Si");
        jrbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSiActionPerformed(evt);
            }
        });

        bgOpciones.add(jrbNo);
        jrbNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbNo.setForeground(new java.awt.Color(51, 51, 51));
        jrbNo.setText("No");

        jlPregunta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlPregunta.setText("Pregunta");

        jbSiguiente.setBackground(new java.awt.Color(0, 0, 102));
        jbSiguiente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jbSiguiente.setText("Validar");
        jbSiguiente.setBorder(null);
        jbSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSiguienteMouseClicked(evt);
            }
        });
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(421, Short.MAX_VALUE)
                        .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlPregunta)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbSi)
                                .addGap(37, 37, 37)
                                .addComponent(jrbNo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jlPregunta)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbSi)
                    .addComponent(jrbNo))
                .addGap(42, 42, 42)
                .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Determinar tu Rutina");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSiguienteMouseClicked
        // TODO add your handling code here:
        try{
            if(jrbSi.isSelected() || jbSiguiente.getText().equals("Otra vez")){
                    this.motorController.afirmar("(respuesta si)");

            }else if(jrbNo.isSelected()){
                this.motorController.afirmar("(respuesta no)");
                
            }
            //this.pack();
        } catch (JessException ex) {
                Logger.getLogger(GimView.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jbSiguienteMouseClicked

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSiguienteActionPerformed

    private void jrbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSiActionPerformed

    public void setMotorController(MotorController motorController){
        this.motorController = motorController;
    }
    public void cambiarPregunta(String pregunta){
        jlPregunta.setText(pregunta);
        jrbNo.setVisible(true);
        jrbSi.setVisible(true);
        jbSiguiente.setText("Siguiente");
    }
    
    public void darRespuesta(String respuesta){
        jlPregunta.setText(respuesta);
        jrbNo.setVisible(false);
        jrbSi.setVisible(false);
        jbSiguiente.setText("Otra vez");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JLabel jlPregunta;
    private javax.swing.JRadioButton jrbNo;
    private javax.swing.JRadioButton jrbSi;
    // End of variables declaration//GEN-END:variables
}
