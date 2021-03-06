/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.TesteBanco;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Seguro;
import model.bean.Veiculo;
import model.bean.VeiculoAlugado;
import model.dao.AluguelDAO;
import model.dao.SeguroDAO;
import model.dao.VeiculoDAO;

/**
 *
 * @author total
 */
public class jif_seguro extends javax.swing.JInternalFrame {

    /**
     * Creates new form jif_manutencao
     */
    public boolean verifica() {

        if (jta_sinistro.getText().equals("")) {
            return false;

        }
        if (jtf_seguradora.getText().equals("")) {
            return false;
        }
        if (jft_dataVen.getText().equals("  /  /    ")) {
            return false;
        }

        if (jft_apolice.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public void ChamaModelo() {
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

    public void limpar() {
        jta_sinistro.setText("");
        jtf_idveic.setText("");
        jtf_seguradora.setText("");
        jft_dataVen.setText("");
        jft_cel.setText("");
        jft_corretor.setText("");
        jft_tel1.setText("");
        jft_tel2.setText("");
        jft_valorParcela.setText("");
        jft_valorTotal.setText("");
        jft_apolice.setText("");
        
        
    }

    public void novo(boolean op) {
        jta_sinistro.setEnabled(op);
        jtf_idveic.setEnabled(op);
        jtf_seguradora.setEnabled(op);
        jft_dataVen.setEnabled(op);
        jft_cel.setEnabled(op);
        jft_corretor.setEnabled(op);
        jft_tel1.setEnabled(op);
        jft_tel2.setEnabled(op);
        jft_valorParcela.setEnabled(op);
        jft_valorTotal.setEnabled(op);
        jft_apolice.setEnabled(op);
        
        jbn_cadastro.setEnabled(op);
        jbn_limpar.setEnabled(op);
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public jif_seguro() {
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

        jpl_seguro = new javax.swing.JPanel();
        jpl_opcoes3 = new javax.swing.JPanel();
        jbn_fechar3 = new javax.swing.JButton();
        jbn_limpar = new javax.swing.JButton();
        jbn_cadastro = new javax.swing.JButton();
        jbn_novo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_placa = new javax.swing.JTextField();
        jbn_buscar = new javax.swing.JButton();
        jtf_modelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_seguradora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jft_dataVen = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_sinistro = new javax.swing.JTextArea();
        jft_apolice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jft_tel1 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jft_corretor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jft_valorTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jft_valorParcela = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jft_tel2 = new javax.swing.JFormattedTextField();
        jft_cel = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jtf_idveic = new javax.swing.JTextField();

        jpl_seguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Seguro"));

        jpl_opcoes3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jpl_opcoes3.setToolTipText("Opções");

        jbn_fechar3.setText("Fechar");
        jbn_fechar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_fechar3ActionPerformed(evt);
            }
        });

        jbn_limpar.setText("Limpar");
        jbn_limpar.setEnabled(false);
        jbn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_limparActionPerformed(evt);
            }
        });

        jbn_cadastro.setText("Cadastrar");
        jbn_cadastro.setEnabled(false);
        jbn_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_cadastroActionPerformed(evt);
            }
        });

        jbn_novo.setText("Novo");
        jbn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpl_opcoes3Layout = new javax.swing.GroupLayout(jpl_opcoes3);
        jpl_opcoes3.setLayout(jpl_opcoes3Layout);
        jpl_opcoes3Layout.setHorizontalGroup(
            jpl_opcoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl_opcoes3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpl_opcoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbn_fechar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbn_limpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbn_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbn_cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpl_opcoes3Layout.setVerticalGroup(
            jpl_opcoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl_opcoes3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jbn_novo)
                .addGap(27, 27, 27)
                .addComponent(jbn_cadastro)
                .addGap(18, 18, 18)
                .addComponent(jbn_limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbn_fechar3)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Veiculo"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Placa:");

        jtf_placa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_placaKeyReleased(evt);
            }
        });

        jbn_buscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbn_buscar.setText("Buscar");
        jbn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_buscarActionPerformed(evt);
            }
        });

        jtf_modelo.setEditable(false);
        jtf_modelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbn_buscar)
                .addGap(18, 18, 18)
                .addComponent(jtf_modelo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jbn_buscar)
                    .addComponent(jtf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seguradora:");

        jtf_seguradora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_seguradora.setEnabled(false);
        jtf_seguradora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_seguradoraKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Apolice:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Vencimento:");

        try {
            jft_dataVen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jft_dataVen.setEnabled(false);
        jft_dataVen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jft_dataVen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jft_dataVenKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Descrição do sinistro:");

        jta_sinistro.setColumns(20);
        jta_sinistro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jta_sinistro.setRows(5);
        jta_sinistro.setEnabled(false);
        jScrollPane1.setViewportView(jta_sinistro);

        jft_apolice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jft_apolice.setEnabled(false);
        jft_apolice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jft_apoliceKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Telefone1:");

        try {
            jft_tel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jft_tel1.setEnabled(false);
        jft_tel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jft_tel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jft_tel1KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Corretor:");

        jft_corretor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jft_corretor.setEnabled(false);
        jft_corretor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jft_corretorKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Valor total:");

        jft_valorTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jft_valorTotal.setEnabled(false);
        jft_valorTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jft_valorTotalKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Valor parcela:");

        jft_valorParcela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jft_valorParcela.setEnabled(false);
        jft_valorParcela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jft_valorParcelaKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Telefone2:");

        try {
            jft_tel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jft_tel2.setEnabled(false);
        jft_tel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jft_tel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jft_tel2KeyReleased(evt);
            }
        });

        try {
            jft_cel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jft_cel.setEnabled(false);
        jft_cel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jft_cel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jft_celKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Celular:");

        javax.swing.GroupLayout jpl_seguroLayout = new javax.swing.GroupLayout(jpl_seguro);
        jpl_seguro.setLayout(jpl_seguroLayout);
        jpl_seguroLayout.setHorizontalGroup(
            jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpl_seguroLayout.createSequentialGroup()
                .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpl_seguroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jpl_seguroLayout.createSequentialGroup()
                                .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpl_seguroLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jft_cel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(jtf_idveic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpl_seguroLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_seguradora, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jft_apolice, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpl_seguroLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jft_corretor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jft_valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpl_seguroLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jft_valorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jft_dataVen, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpl_seguroLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jft_tel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jft_tel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addGap(0, 31, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpl_opcoes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpl_seguroLayout.setVerticalGroup(
            jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl_seguroLayout.createSequentialGroup()
                .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpl_seguroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpl_opcoes3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpl_seguroLayout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl_seguroLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_seguradora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jft_apolice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jft_corretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jft_valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jft_dataVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jft_valorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jft_tel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jft_tel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpl_seguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jft_cel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpl_seguroLayout.createSequentialGroup()
                                .addComponent(jtf_idveic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpl_seguro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpl_seguro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbn_fechar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_fechar3ActionPerformed

        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jbn_fechar3ActionPerformed

    private void jbn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_limparActionPerformed
       limpar();
        // TODO add your handling code here:Su
    }//GEN-LAST:event_jbn_limparActionPerformed

    private void jbn_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_cadastroActionPerformed

        Seguro s = new Seguro();
        SeguroDAO sd;

        try {
            sd = new SeguroDAO();
            s.setApolice(jft_apolice.getText());
            s.setCelular(jft_cel.getText());
            s.setCorretor(jft_corretor.getText());
            s.setDescSinistro(jta_sinistro.getText());
            s.setFoneCorretor(jft_tel1.getText());
            s.setFoneCorretor2(jft_tel2.getText());
            s.setIdVeic(Integer.parseInt(jtf_idveic.getText()));
            s.setSeguradora(jtf_seguradora.getText());
            s.setValorParcela(Float.parseFloat(jft_valorParcela.getText()));
            s.setValorTotal(Float.parseFloat(jft_valorTotal.getText()));
            s.setVencimento(jft_dataVen.getText());
            sd.inserir(s);
            limpar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jif_seguro.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpar();

    }//GEN-LAST:event_jbn_cadastroActionPerformed

    private void jbn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_novoActionPerformed

        novo(false);
        jtf_placa.setText("");
        jtf_modelo.setText("");
        //jpl_seguro.setText("");
        jtf_placa.setEditable(true);
        jbn_buscar.setEnabled(true);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jbn_novoActionPerformed

    private void jbn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_buscarActionPerformed
        Veiculo v = new Veiculo();
        v.setPlaca(jtf_placa.getText());

        int retorno = 0;

        try {
            VeiculoDAO vd = new VeiculoDAO();
            retorno = vd.BuscarVeicAlugado(v.getPlaca());
            if(retorno > 0){
                novo(true);
            jtf_placa.setEditable(false);
            jbn_buscar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Placa incorreta!!!" , "ATENÇÃO!!!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jif_cadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        //jtf_idPlaca.setText(String.valueOf(retorno));
        System.out.println("pega -> " + retorno);
        jtf_idveic.setText(String.valueOf(retorno));
        ChamaModelo();

        // TODO add your handling code here:
    }//GEN-LAST:event_jbn_buscarActionPerformed

    private void jtf_placaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_placaKeyReleased
       jtf_placa.setText(jtf_placa.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_placaKeyReleased

    private void jtf_seguradoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_seguradoraKeyReleased
     jtf_seguradora.setText(jtf_seguradora.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_seguradoraKeyReleased

    private void jft_apoliceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jft_apoliceKeyReleased
       jft_apolice.setText(jft_apolice.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jft_apoliceKeyReleased

    private void jft_corretorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jft_corretorKeyReleased
        jft_corretor.setText(jft_corretor.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jft_corretorKeyReleased

    private void jft_valorTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jft_valorTotalKeyReleased
        jft_valorTotal.setText(jft_valorTotal.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jft_valorTotalKeyReleased

    private void jft_valorParcelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jft_valorParcelaKeyReleased
        jft_valorParcela.setText(jft_valorParcela.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jft_valorParcelaKeyReleased

    private void jft_dataVenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jft_dataVenKeyReleased
       jft_dataVen.setText(jft_dataVen.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jft_dataVenKeyReleased

    private void jft_tel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jft_tel1KeyReleased
       jft_tel1.setText(jft_tel1.getText().toUpperCase());
        // TODO add your handling code here:
    }//GEN-LAST:event_jft_tel1KeyReleased

    private void jft_tel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jft_tel2KeyReleased
    jft_tel2.setText(jft_tel2.getText().toUpperCase());
// TODO add your handling code here:
    }//GEN-LAST:event_jft_tel2KeyReleased

    private void jft_celKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jft_celKeyReleased
    jft_cel.setText(jft_cel.getText().toUpperCase());
// TODO add your handling code here:
    }//GEN-LAST:event_jft_celKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbn_buscar;
    private javax.swing.JButton jbn_cadastro;
    private javax.swing.JButton jbn_fechar3;
    private javax.swing.JButton jbn_limpar;
    private javax.swing.JButton jbn_novo;
    private javax.swing.JTextField jft_apolice;
    private javax.swing.JFormattedTextField jft_cel;
    private javax.swing.JTextField jft_corretor;
    private javax.swing.JFormattedTextField jft_dataVen;
    private javax.swing.JFormattedTextField jft_tel1;
    private javax.swing.JFormattedTextField jft_tel2;
    private javax.swing.JTextField jft_valorParcela;
    private javax.swing.JTextField jft_valorTotal;
    private javax.swing.JPanel jpl_opcoes3;
    private javax.swing.JPanel jpl_seguro;
    private javax.swing.JTextArea jta_sinistro;
    private javax.swing.JTextField jtf_idveic;
    private javax.swing.JTextField jtf_modelo;
    private javax.swing.JTextField jtf_placa;
    private javax.swing.JTextField jtf_seguradora;
    // End of variables declaration//GEN-END:variables
}
