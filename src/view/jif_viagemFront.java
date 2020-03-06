/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.bean.Motorista;
import model.bean.Veiculo;
import model.dao.MotoristaDAO;
import model.dao.VeiculoDAO;

/**
 *
 * @author marcu
 */
public class jif_viagemFront extends javax.swing.JInternalFrame {

    /**
     * Creates new form jif_viagemFront
     */
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    public void ChamaModelo(){
        Veiculo v = new Veiculo();
        v.setPlaca(jtf_placa.getText());
        String retorno2 = "";
        try {
            VeiculoDAO vd = new VeiculoDAO();            
            retorno2 = vd.BuscarVeic2(v.getPlaca());
          
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jif_cadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtf_modelo.setText(retorno2);
    }
    public void ChamaNome(){
        Motorista m = new Motorista();
        m.setRegistro(jtf_cnh.getText());
        String retorno2 = "";
        try {
            MotoristaDAO md = new MotoristaDAO();
            
            retorno2 = md.BuscarMotorista2(m.getRegistro());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(jif_cadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        //jtf_idPlaca.setText(String.valueOf(retorno));
        
        jtf_motorista.setText(retorno2);
    }
    
    public jif_viagemFront() {
        
        
        initComponents();
        jtf_idveic.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtf_placa = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtf_modelo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jtf_motorista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtf_cnh = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jtf_idveic = new javax.swing.JTextField();
        jbn_avancar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Veiculo"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Placa:");

        jtf_placa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_placaKeyReleased(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Modelo:");

        jtf_modelo.setEditable(false);
        jtf_modelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Motorista"));

        jtf_motorista.setEditable(false);
        jtf_motorista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setText("Nome:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("CNH:");

        jtf_cnh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_cnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cnhActionPerformed(evt);
            }
        });
        jtf_cnh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_cnhKeyReleased(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_motorista, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_cnh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(jtf_idveic, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_cnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jtf_idveic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_motorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jbn_avancar.setText("Avançar");
        jbn_avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_avancarActionPerformed(evt);
            }
        });

        jButton4.setText("Fechar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jbn_avancar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbn_avancar)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbn_avancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_avancarActionPerformed
        jif_viagemBack viagem = new jif_viagemBack();
        if(jtf_motorista.getText().equals("") || jtf_cnh.getText().equals("") || jtf_motorista.getText().equals("") || jtf_modelo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nescessario informar CNH do motorista e a placa do veiculo para continuar");
        }else{
             ((BasicInternalFrameUI)viagem.getUI()).setNorthPane(null);
        getParent().add(viagem);
        viagem.moveToFront();
        viagem.setLocation(180, 75);
        viagem.setVisible(true);
        viagem.buscarInfo(jtf_motorista.getText(), jtf_cnh.getText(),jtf_placa.getText() , jtf_modelo.getText(), jtf_idveic.getText());
        this.dispose();
        }
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jbn_avancarActionPerformed

    private void jtf_cnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_cnhActionPerformed

    private void jtf_placaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_placaKeyReleased
        jtf_placa.setText(jtf_placa.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_placaKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Veiculo v = new Veiculo();
        v.setPlaca(jtf_placa.getText());

        int retorno = 0;
        
        try {
            VeiculoDAO vd = new VeiculoDAO();
            retorno = vd.BuscarVeicAlugado(v.getPlaca());
            
            
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jif_cadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        //jtf_idPlaca.setText(String.valueOf(retorno));
        System.out.println("pega -> " + retorno);
        jtf_idveic.setText(String.valueOf(retorno));
        ChamaModelo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Motorista m = new Motorista();
        
        m.setRegistro(jtf_cnh.getText());

        int retorno = 0;
        
        try {
            MotoristaDAO md = new MotoristaDAO();
            retorno = md.BuscarMotorista(m.getRegistro());
             
        } catch (SQLException ex) {
            Logger.getLogger(jif_cadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        //jtf_idPlaca.setText(String.valueOf(retorno));
        System.out.println("pega -> " + retorno);
        ChamaNome();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtf_cnhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_cnhKeyReleased
      jtf_cnh.setText(jtf_cnh.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_cnhKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbn_avancar;
    private javax.swing.JTextField jtf_cnh;
    private javax.swing.JTextField jtf_idveic;
    private javax.swing.JTextField jtf_modelo;
    private javax.swing.JTextField jtf_motorista;
    private javax.swing.JTextField jtf_placa;
    // End of variables declaration//GEN-END:variables
}
