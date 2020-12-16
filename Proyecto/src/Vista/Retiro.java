/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.RegistroEstacionamiento;
import Modelo.Auto;
import Modelo.Camion;
import Modelo.Camioneta;
import Modelo.Moto;
import Modelo.Vehiculo;
import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Benjamin
 */
public class Retiro extends javax.swing.JFrame {

    /**
     * Creates new form Retiro
     */
    public Retiro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIngresar = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        optAutoCamioneta = new javax.swing.JRadioButton();
        optMoto = new javax.swing.JRadioButton();
        optCamion = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Retirar Vehiculo");

        lblIngresar.setText("Ingrese la Patente:");

        txtPatente.setToolTipText("");
        txtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatenteActionPerformed(evt);
            }
        });
        txtPatente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatenteKeyTyped(evt);
            }
        });

        buttonGroup1.add(optAutoCamioneta);
        optAutoCamioneta.setSelected(true);
        optAutoCamioneta.setText("Auto/Camioneta");
        optAutoCamioneta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optAutoCamionetaMouseClicked(evt);
            }
        });
        optAutoCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAutoCamionetaActionPerformed(evt);
            }
        });

        buttonGroup1.add(optMoto);
        optMoto.setText("Moto");
        optMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optMotoMouseClicked(evt);
            }
        });
        optMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optMotoActionPerformed(evt);
            }
        });

        buttonGroup1.add(optCamion);
        optCamion.setText("Camión");
        optCamion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optCamionMouseClicked(evt);
            }
        });
        optCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCamionActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("?");
        jLabel2.setToolTipText("<html>\n<p>Ejemplo de patente:</p>\n<p>BBBB10</p>\n<p>BB1010</p>\n");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetirar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(lblIngresar))
                                    .addComponent(optAutoCamioneta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(optMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(optCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 68, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresar)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optAutoCamioneta)
                    .addComponent(optMoto)
                    .addComponent(optCamion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnRetirar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatenteActionPerformed

    private void txtPatenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatenteKeyTyped
        txtPatente.setBorder(BorderFactory.createBevelBorder(WIDTH, Color.black, Color.black, Color.black, Color.black));
        char letra = evt.getKeyChar();
        if (txtPatente.getText().length() > 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPatenteKeyTyped

    private void optAutoCamionetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optAutoCamionetaMouseClicked
        optAutoCamioneta.setSelected(true);
        optMoto.setSelected(false);
        optCamion.setSelected(false);
    }//GEN-LAST:event_optAutoCamionetaMouseClicked

    private void optAutoCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAutoCamionetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optAutoCamionetaActionPerformed

    private void optMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optMotoMouseClicked
        optAutoCamioneta.setSelected(false);
        optMoto.setSelected(true);
        optCamion.setSelected(false);
    }//GEN-LAST:event_optMotoMouseClicked

    private void optMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optMotoActionPerformed

    private void optCamionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optCamionMouseClicked
        optAutoCamioneta.setSelected(false);
        optMoto.setSelected(false);
        optCamion.setSelected(true);
    }//GEN-LAST:event_optCamionMouseClicked

    private void optCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCamionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optCamionActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        Pattern pat = Pattern.compile("[A-Z]{2}[1-9]{1}[0-9]{3}");
        Pattern pat2 = Pattern.compile("[A-Z]{4}[0-9]{2}");
        Matcher mat = pat.matcher(txtPatente.getText().toUpperCase());
        Matcher mat2 = pat2.matcher(txtPatente.getText().toUpperCase());
        String patente = txtPatente.getText();
        
        if (!(mat.find() || mat2.find()) || patente == "") {
            JOptionPane.showMessageDialog(this, "Complete los campos necesarios.\nrevise el formato de la patente", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtPatente.setBorder(BorderFactory.createBevelBorder(WIDTH, Color.RED, Color.RED, Color.RED, Color.RED));

        } else {
            Vehiculo vehiculo = RegistroEstacionamiento.filtrarPatente(patente);
            Auto aux1 = new Auto("", patente, "", "", true);
            Camion aux2 = new Camion("", patente, "", "", false);
            Moto aux3 = new Moto("", patente, "","", true);
            boolean registro;
            if (!(RegistroEstacionamiento.validarAutoCamioneta(aux1) || RegistroEstacionamiento.validarMoto(aux3) || RegistroEstacionamiento.validarCamion(aux2))) {
                JOptionPane.showMessageDialog(this, "Este vehiculo no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtPatente.setBorder(BorderFactory.createBevelBorder(WIDTH, Color.RED, Color.RED, Color.RED, Color.RED));
            } else if (optAutoCamioneta.isSelected()) {
                    Auto auto = new Auto("", patente, "", "", false);
                    try {
                        //System.out.println(RegistroEstacionamiento.retirarAutoCamioneta(auto));

                        registro=RegistroEstacionamiento.generarBoletaAutoCamionetas(auto);
                        if(registro){
                            LimpiarRetiro();
                        }
                        else if(!(registro)){
                            JOptionPane.showMessageDialog(this, "Este vehiculo no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                            
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, "Este vehiculo no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
        
            }  else if (optMoto.isSelected()) {
                    Moto moto = new Moto("", patente, "", "", false);
                    try {
                        registro=RegistroEstacionamiento.generarBoletaMotos(moto);
                        if(registro){
                            LimpiarRetiro();
                        }
                        else if(!(registro)){
                            JOptionPane.showMessageDialog(this, "Este vehiculo no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, "Este vehiculo no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                
            } else if (optCamion.isSelected()) {
                    Camion camion = new Camion("", patente, "", "", false);
                    try {
                        registro=RegistroEstacionamiento.generarBoletaCamion(camion);
                        if(registro){
                            LimpiarRetiro();
                        }
                        else if(!(registro)){
                            JOptionPane.showMessageDialog(this, "Este vehiculo no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, "Este vehiculo no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
            
            }
            else{
                JOptionPane.showMessageDialog(this, "Este vehiculo no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnRetirarActionPerformed
    void LimpiarRetiro(){
        JOptionPane.showMessageDialog(this, "VEHICULO RETIRADO CORRECTAMENTE", "Retiro Completado", JOptionPane.INFORMATION_MESSAGE);
        txtPatente.setText(null);
        optCamion.setSelected(false);
        optMoto.setSelected(false);
        optAutoCamioneta.setSelected(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton optAutoCamioneta;
    private javax.swing.JRadioButton optCamion;
    private javax.swing.JRadioButton optMoto;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
