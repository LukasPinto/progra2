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
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblCarroceria = new javax.swing.JLabel();
        txtCarroceria = new javax.swing.JTextField();
        optCamioneta = new javax.swing.JRadioButton();
        optAuto = new javax.swing.JRadioButton();
        optMoto = new javax.swing.JRadioButton();
        optCamion = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        lblTrabajador = new javax.swing.JLabel();
        optTrabajadorNo = new javax.swing.JRadioButton();
        optTrabajadorSi = new javax.swing.JRadioButton();
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

        lblMarca.setText("Marca:");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        lblModelo.setText("Modelo:");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        lblCarroceria.setText("Carroceria");

        txtCarroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarroceriaActionPerformed(evt);
            }
        });

        buttonGroup1.add(optCamioneta);
        optCamioneta.setText("Camioneta");
        optCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCamionetaActionPerformed(evt);
            }
        });

        buttonGroup1.add(optAuto);
        optAuto.setSelected(true);
        optAuto.setText("Auto");
        optAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optAutoMouseClicked(evt);
            }
        });
        optAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAutoActionPerformed(evt);
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

        lblTrabajador.setText("Trabajador:");

        buttonGroup2.add(optTrabajadorNo);
        optTrabajadorNo.setSelected(true);
        optTrabajadorNo.setText("No");

        buttonGroup2.add(optTrabajadorSi);
        optTrabajadorSi.setText("Si");
        optTrabajadorSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optTrabajadorSiActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lblIngresar)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMarca)
                                    .addComponent(lblModelo)
                                    .addComponent(lblCarroceria))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(txtModelo))
                                    .addComponent(txtCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRetirar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTrabajador)
                                    .addComponent(optCamioneta))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(optAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(optMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(optCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(optTrabajadorSi)
                                        .addGap(39, 39, 39)
                                        .addComponent(optTrabajadorNo)))
                                .addGap(0, 55, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresar)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarroceria)
                    .addComponent(txtCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optCamioneta)
                    .addComponent(optAuto)
                    .addComponent(optMoto)
                    .addComponent(optCamion))
                .addGap(18, 18, 18)
                .addComponent(lblTrabajador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optTrabajadorNo)
                    .addComponent(optTrabajadorSi))
                .addGap(18, 18, 18)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloKeyTyped

    private void optCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCamionetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optCamionetaActionPerformed

    private void optAutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optAutoMouseClicked
        optAuto.setSelected(true);
        optMoto.setSelected(false);
        optCamion.setSelected(false);
    }//GEN-LAST:event_optAutoMouseClicked

    private void optAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optAutoActionPerformed

    private void optMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optMotoMouseClicked
        optAuto.setSelected(false);
        optMoto.setSelected(true);
        optCamion.setSelected(false);
    }//GEN-LAST:event_optMotoMouseClicked

    private void optMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optMotoActionPerformed

    private void txtCarroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarroceriaActionPerformed

    private void optCamionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optCamionMouseClicked
        optAuto.setSelected(false);
        optMoto.setSelected(false);
        optCamion.setSelected(true);
    }//GEN-LAST:event_optCamionMouseClicked

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void optCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCamionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optCamionActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        Pattern pat = Pattern.compile("[A-Z]{2}[1-9]{1}[0-9]{3}");
        Pattern pat2 = Pattern.compile("[B-Z]{4}[0-9]{2}");
        Matcher mat = pat.matcher(txtPatente.getText().toUpperCase());
        Matcher mat2 = pat2.matcher(txtPatente.getText().toUpperCase());
        String patente = txtPatente.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String carroceria = txtCarroceria.getText();
        if ((mat.find() || mat2.find()) && patente != "" && marca != "" && modelo != "" && carroceria != "") {
            Auto aux1=new Auto(carroceria, patente, marca, modelo, true);
            Camion aux2=new Camion(carroceria, patente, marca, modelo, false);
            Moto aux3 = new Moto(carroceria, patente, marca, modelo, true);
            if(!(RegistroEstacionamiento.validarAutoCamioneta(aux1) || RegistroEstacionamiento.validarMoto(aux3) || RegistroEstacionamiento.validarCamion(aux2))){
                JOptionPane.showMessageDialog(this, "Este vehiculo no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtPatente.setBorder(BorderFactory.createBevelBorder(WIDTH, Color.RED, Color.RED, Color.RED, Color.RED));
            }
            else if (optAuto.isSelected()) {
                if (optTrabajadorNo.isSelected()) {
                    Auto auto = new Auto(carroceria, patente, marca, modelo, false);
                    try {
                        //System.out.println(RegistroEstacionamiento.retirarAutoCamioneta(auto));

                        RegistroEstacionamiento.generarBoletaAutoCamionetas(auto);
                        System.out.println("Hola");
                    } catch (IOException ex) {
                        Logger.getLogger(Retiro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Auto auto = new Auto(carroceria, patente, marca, modelo, true);

                    try {
                        //System.out.println(RegistroEstacionamiento.retirarAutoCamioneta(auto));

                        RegistroEstacionamiento.generarBoletaAutoCamionetas(auto);
                        System.out.println("Hola");
                    } catch (IOException ex) {
                        Logger.getLogger(Retiro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (RegistroEstacionamiento.retirarAutoCamioneta(auto)) {
                        System.out.println("Retirado");
                    }
                }
            } else if (optCamioneta.isSelected()) {
                if (optTrabajadorNo.isSelected()) {
                    Camioneta camioneta = new Camioneta(carroceria, patente, marca, modelo, false);
                    try {
                        RegistroEstacionamiento.generarBoletaAutoCamionetas(camioneta);
                        System.out.println("Hola");
                    } catch (IOException ex) {
                        Logger.getLogger(Retiro.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    Camioneta camioneta = new Camioneta(carroceria, patente, marca, modelo, false);
                    try {
                        RegistroEstacionamiento.generarBoletaAutoCamionetas(camioneta);
                        System.out.println("Hola");
                    } catch (IOException ex) {
                        Logger.getLogger(Retiro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else if (optMoto.isSelected()) {
                if (optTrabajadorNo.isSelected()) {
                    Moto moto = new Moto(carroceria, patente, marca, modelo, false);
                    try {
                        RegistroEstacionamiento.generarBoletaMotos(moto);
                        System.out.println("Hola");
                    } catch (IOException ex) {
                        Logger.getLogger(Retiro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Moto moto = new Moto(carroceria, patente, marca, modelo, false);
                    try {
                        RegistroEstacionamiento.generarBoletaMotos(moto);
                        System.out.println("Hola");
                    } catch (IOException ex) {
                        Logger.getLogger(Retiro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else if (optCamion.isSelected()) {
                if (optTrabajadorNo.isSelected()) {
                    Camion camion = new Camion(carroceria, patente, marca, modelo, false);
                    try {
                        RegistroEstacionamiento.generarBoletaCamion(camion);
                        System.out.println("Hola");
                    } catch (IOException ex) {
                        Logger.getLogger(Retiro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Camion camion = new Camion(carroceria, patente, marca, modelo, false);
                    try {
                        RegistroEstacionamiento.generarBoletaCamion(camion);
                        System.out.println("Hola");
                    } catch (IOException ex) {
                        Logger.getLogger(Retiro.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Complete los campos necesarios.\nrevise el formato de la patente", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtPatente.setBorder(BorderFactory.createBevelBorder(WIDTH, Color.RED, Color.RED, Color.RED, Color.RED));

        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void optTrabajadorSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optTrabajadorSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optTrabajadorSiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCarroceria;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrabajador;
    private javax.swing.JRadioButton optAuto;
    private javax.swing.JRadioButton optCamion;
    private javax.swing.JRadioButton optCamioneta;
    private javax.swing.JRadioButton optMoto;
    private javax.swing.JRadioButton optTrabajadorNo;
    private javax.swing.JRadioButton optTrabajadorSi;
    private javax.swing.JTextField txtCarroceria;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
