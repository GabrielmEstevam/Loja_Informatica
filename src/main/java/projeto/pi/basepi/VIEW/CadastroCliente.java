/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto.pi.basepi.VIEW;

import java.sql.Date;
import javax.swing.JOptionPane;
import projeto.pi.basepi.DAO.ClienteDAO;
import projeto.pi.basepi.DAO.EnderecoDAO;
import projeto.pi.basepi.MODELS.Cliente;
import projeto.pi.basepi.MODELS.Endereco;
import projeto.pi.basepi.MODELS.Verficacao;

/**
 *
 * @author Athyla
 */
public class CadastroCliente extends javax.swing.JFrame {

    Cliente objAlterar = null;
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
    }
    
    public CadastroCliente(Cliente obj) {
        initComponents();

        this.objAlterar = obj;
        txtCdcCpf.setText(objAlterar.getCPF());
        txtCdcNome.setText(objAlterar.getNome());
        txtCdcEmail.setText(objAlterar.getEmail());
        txtTelefone.setText(objAlterar.getTelefone());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblCdcNome = new javax.swing.JLabel();
        txtCdcNome = new javax.swing.JTextField();
        lblCdcEmail = new javax.swing.JLabel();
        txtCdcEmail = new javax.swing.JTextField();
        lblCdcDtNascimento = new javax.swing.JLabel();
        txtDtNascimento = new javax.swing.JFormattedTextField();
        lblCdcGenero = new javax.swing.JLabel();
        cboCdcGenero = new javax.swing.JComboBox<>();
        lblCdcCpf = new javax.swing.JLabel();
        txtCdcCpf = new javax.swing.JFormattedTextField();
        btnCdcCancelar = new javax.swing.JButton();
        lblCdcDtNascimento1 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        lblCdcLogradouro = new javax.swing.JLabel();
        txtCdcLogradouro = new javax.swing.JTextField();
        lblCdcNumero = new javax.swing.JLabel();
        lblCdcCep = new javax.swing.JLabel();
        txtCdcCep = new javax.swing.JFormattedTextField();
        lblCdcBairro = new javax.swing.JLabel();
        txtCdcBairro = new javax.swing.JTextField();
        lblCdcComplemento = new javax.swing.JLabel();
        txtCdcComplemento = new javax.swing.JTextField();
        lblCdcCidade = new javax.swing.JLabel();
        txtCdcCidade = new javax.swing.JTextField();
        lblCdcUf = new javax.swing.JLabel();
        cboCdcUF = new javax.swing.JComboBox<>();
        btnCdcConfirmar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        pnlCdc = new javax.swing.JPanel();
        lblCdc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCdcNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcNome.setText("Nome*:");

        txtCdcNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCdcNomeFocusLost(evt);
            }
        });

        lblCdcEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcEmail.setText("E-mail*:");

        txtCdcEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCdcEmailFocusLost(evt);
            }
        });
        txtCdcEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdcEmailActionPerformed(evt);
            }
        });

        lblCdcDtNascimento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcDtNascimento.setText("Data de Nascimento*:");

        try {
            txtDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCdcGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcGenero.setText("Gênero*:");

        cboCdcGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Transgênero" }));
        cboCdcGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCdcGeneroActionPerformed(evt);
            }
        });

        lblCdcCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcCpf.setText("CPF*:");

        try {
            txtCdcCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCdcCancelar.setText("Cancelar");
        btnCdcCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCdcCancelarActionPerformed(evt);
            }
        });

        lblCdcDtNascimento1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcDtNascimento1.setText("Telefone*:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblCdcNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCdcNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCdcDtNascimento1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCdcCancelar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCdcDtNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCdcGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboCdcGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCdcEmail)
                            .addComponent(lblCdcCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCdcEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCdcCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcNome)
                    .addComponent(txtCdcNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcEmail)
                    .addComponent(txtCdcEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcCpf)
                    .addComponent(txtCdcCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcDtNascimento)
                    .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCdcGenero)
                    .addComponent(cboCdcGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcDtNascimento1)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnCdcCancelar)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        lblCdcLogradouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcLogradouro.setText("Logradouro*:");

        txtCdcLogradouro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCdcLogradouroFocusLost(evt);
            }
        });

        lblCdcNumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcNumero.setText("Número*:");

        lblCdcCep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcCep.setText("CEP*:");

        try {
            txtCdcCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCdcBairro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcBairro.setText("Bairro*:");

        txtCdcBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCdcBairroFocusLost(evt);
            }
        });

        lblCdcComplemento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcComplemento.setText("Complemento:");

        txtCdcComplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCdcComplementoFocusLost(evt);
            }
        });

        lblCdcCidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcCidade.setText("Cidade*:");

        txtCdcCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCdcCidadeFocusLost(evt);
            }
        });

        lblCdcUf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCdcUf.setText("UF*:");

        cboCdcUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SE", "TO", " " }));
        cboCdcUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCdcUFActionPerformed(evt);
            }
        });

        btnCdcConfirmar.setText("Confirmar Dados");
        btnCdcConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCdcConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCdcCidade)
                                .addGap(18, 18, 18)
                                .addComponent(txtCdcCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCdcUf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboCdcUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCdcLogradouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCdcLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCdcNumero)
                                    .addComponent(lblCdcBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(lblCdcCep)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCdcCep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCdcBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCdcComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCdcComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCdcConfirmar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcLogradouro)
                    .addComponent(txtCdcLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcNumero)
                    .addComponent(lblCdcCep)
                    .addComponent(txtCdcCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcBairro)
                    .addComponent(txtCdcBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcComplemento)
                    .addComponent(txtCdcComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdcCidade)
                    .addComponent(txtCdcCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCdcUf)
                    .addComponent(cboCdcUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnCdcConfirmar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço", jPanel2);

        pnlCdc.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCdc.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblCdc.setText("Cadastro de Cliente");

        javax.swing.GroupLayout pnlCdcLayout = new javax.swing.GroupLayout(pnlCdc);
        pnlCdc.setLayout(pnlCdcLayout);
        pnlCdcLayout.setHorizontalGroup(
            pnlCdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCdcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(199, 199, 199))
        );
        pnlCdcLayout.setVerticalGroup(
            pnlCdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCdcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCdc)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(pnlCdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pnlCdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCdcUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCdcUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCdcUFActionPerformed

    private void cboCdcGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCdcGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCdcGeneroActionPerformed

    private void btnCdcCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCdcCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCdcCancelarActionPerformed

    private void txtCdcNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCdcNomeFocusLost
        // TODO add your handling code here:
        
        
             
        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCdcNome);
        
    }//GEN-LAST:event_txtCdcNomeFocusLost

    private void txtCdcEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdcEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdcEmailActionPerformed

    private void txtCdcEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCdcEmailFocusLost
        // TODO add your handling code here:
                  
        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCdcEmail);
    }//GEN-LAST:event_txtCdcEmailFocusLost

    private void txtCdcLogradouroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCdcLogradouroFocusLost
        // TODO add your handling code here:
        
                  
        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCdcLogradouro);
    }//GEN-LAST:event_txtCdcLogradouroFocusLost

    private void txtCdcBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCdcBairroFocusLost
        // TODO add your handling code here:
        
                  
        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCdcBairro);
    }//GEN-LAST:event_txtCdcBairroFocusLost

    private void txtCdcComplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCdcComplementoFocusLost
        // TODO add your handling code here:
                  
        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCdcComplemento);
    }//GEN-LAST:event_txtCdcComplementoFocusLost

    private void txtCdcCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCdcCidadeFocusLost
        // TODO add your handling code here:
        
                  
        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCdcCidade);
    }//GEN-LAST:event_txtCdcCidadeFocusLost

    private void btnCdcConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCdcConfirmarActionPerformed
        // TODO add your handling code here:
               
        if(txtCdcNome.getText().equalsIgnoreCase("") ||txtDtNascimento.getText().equalsIgnoreCase("") || txtCdcLogradouro.getText().equalsIgnoreCase("") || txtCdcEmail.getText().equalsIgnoreCase("") || txtCdcCpf.getText().equalsIgnoreCase("") || txtCdcCidade.getText().equalsIgnoreCase("") || txtCdcComplemento.getText().equalsIgnoreCase("") || 
                txtCdcCep.getText().equalsIgnoreCase("") || txtCdcBairro.getText().equalsIgnoreCase("") ){
            JOptionPane.showMessageDialog(rootPane, "Preencha Todos os Campos!!");
           
        }else{
            
             String nome = txtCdcNome.getText().toUpperCase();
             String email = txtCdcEmail.getText().toUpperCase();
             String cpf = txtCdcCpf.getText();
             String dataBr = txtDtNascimento.getText();
             Date dtEua = TraduzirData(dataBr);
             String sexo = (String) cboCdcGenero.getSelectedItem();
             String telefone = txtTelefone.getText();
             
             Cliente novoCliente = new Cliente(nome, email, cpf, dtEua, sexo,telefone);
            
             
             String logadouro = txtCdcLogradouro.getText().toUpperCase();
             String cep = txtCdcCep.getText();
             String numero = txtNumero.getText();
             String complemento = txtCdcComplemento.getText().toUpperCase();
             String bairro = txtCdcBairro.getText().toUpperCase();
             String cidade = txtCdcCidade.getText().toUpperCase();
             String uf = (String) cboCdcUF.getSelectedItem();
             
             Endereco novoEndereco = new Endereco(cep, logadouro, numero, complemento, bairro, cidade, uf);
              boolean retornoC = ClienteDAO.salvar(novoCliente, novoEndereco);
            if (retornoC == true) {

                JOptionPane.showMessageDialog(rootPane, "Foi salvo cliente:)");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não salvou o cliente :(");
            }
             
     
     }

            
        
        
    }//GEN-LAST:event_btnCdcConfirmarActionPerformed
    
    public Date TraduzirData(String dtBr){
        String dia =  Character.toString(dtBr.charAt(0)) + Character.toString(dtBr.charAt(1));
        String mes = Character.toString(dtBr.charAt(3)) + Character.toString(dtBr.charAt(4));
        String ano = Character.toString(dtBr.charAt(6)) + Character.toString(dtBr.charAt(7)) +
                     Character.toString(dtBr.charAt(8)) + Character.toString(dtBr.charAt(9));
        Date data = null;
        if(Integer.parseInt(mes) > 12 || Integer.parseInt(mes) < 0){
               JOptionPane.showMessageDialog(rootPane, "Mês informado não existe");
               
        }
        else{
            String dtIso = ano+"-"+mes+"-"+dia;

            data = Date.valueOf(dtIso);

            
        }
        
        return data;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCdcCancelar;
    private javax.swing.JButton btnCdcConfirmar;
    private javax.swing.JComboBox<String> cboCdcGenero;
    private javax.swing.JComboBox<String> cboCdcUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCdc;
    private javax.swing.JLabel lblCdcBairro;
    private javax.swing.JLabel lblCdcCep;
    private javax.swing.JLabel lblCdcCidade;
    private javax.swing.JLabel lblCdcComplemento;
    private javax.swing.JLabel lblCdcCpf;
    private javax.swing.JLabel lblCdcDtNascimento;
    private javax.swing.JLabel lblCdcDtNascimento1;
    private javax.swing.JLabel lblCdcEmail;
    private javax.swing.JLabel lblCdcGenero;
    private javax.swing.JLabel lblCdcLogradouro;
    private javax.swing.JLabel lblCdcNome;
    private javax.swing.JLabel lblCdcNumero;
    private javax.swing.JLabel lblCdcUf;
    private javax.swing.JPanel pnlCdc;
    private javax.swing.JTextField txtCdcBairro;
    private javax.swing.JFormattedTextField txtCdcCep;
    private javax.swing.JTextField txtCdcCidade;
    private javax.swing.JTextField txtCdcComplemento;
    private javax.swing.JFormattedTextField txtCdcCpf;
    private javax.swing.JTextField txtCdcEmail;
    private javax.swing.JTextField txtCdcLogradouro;
    private javax.swing.JTextField txtCdcNome;
    private javax.swing.JFormattedTextField txtDtNascimento;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
