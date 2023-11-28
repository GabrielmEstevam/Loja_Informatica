/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto.pi.basepi.VIEW;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import projeto.pi.basepi.DAO.ProdutoDAO;
import projeto.pi.basepi.MODELS.Produto;
import projeto.pi.basepi.MODELS.ItemPedido;
import projeto.pi.basepi.MODELS.Verficacao;

/**
 *
 * @author athyla
 */
public class CadastroProduto extends javax.swing.JFrame {

    Produto produto = null;
    ItemPedido produtoPedido = null;

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlCadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCdpMarca = new javax.swing.JLabel();
        txtCdpMarca = new javax.swing.JTextField();
        lblCdpNome = new javax.swing.JLabel();
        lblCdpEstoque = new javax.swing.JLabel();
        lblCdpPreco = new javax.swing.JLabel();
        txtCdpNome = new javax.swing.JTextField();
        txtCdpEstoque = new javax.swing.JTextField();
        txtCdpPreco = new javax.swing.JFormattedTextField();
        lblApDesc = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtCodpDesc = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlCadastroProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produto");

        javax.swing.GroupLayout pnlCadastroProdutoLayout = new javax.swing.GroupLayout(pnlCadastroProduto);
        pnlCadastroProduto.setLayout(pnlCadastroProdutoLayout);
        pnlCadastroProdutoLayout.setHorizontalGroup(
            pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addGap(199, 199, 199))
        );
        pnlCadastroProdutoLayout.setVerticalGroup(
            pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        lblCdpMarca.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblCdpMarca.setText("Marca:");

        txtCdpMarca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCdpMarcaFocusLost(evt);
            }
        });
        txtCdpMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCdpMarcaMouseExited(evt);
            }
        });
        txtCdpMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdpMarcaActionPerformed(evt);
            }
        });
        txtCdpMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCdpMarcaKeyTyped(evt);
            }
        });

        lblCdpNome.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblCdpNome.setText("Nome:");

        lblCdpEstoque.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblCdpEstoque.setText("Qtd Estoque");

        lblCdpPreco.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblCdpPreco.setText("Preço:");

        txtCdpNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCdpNomeFocusLost(evt);
            }
        });
        txtCdpNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCdpNomeMouseExited(evt);
            }
        });
        txtCdpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdpNomeActionPerformed(evt);
            }
        });
        txtCdpNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCdpNomeKeyTyped(evt);
            }
        });

        txtCdpEstoque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCdpEstoqueFocusLost(evt);
            }
        });
        txtCdpEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCdpEstoqueKeyTyped(evt);
            }
        });

        txtCdpPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCdpPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdpPrecoActionPerformed(evt);
            }
        });
        txtCdpPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCdpPrecoKeyTyped(evt);
            }
        });

        lblApDesc.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblApDesc.setText("Descrição:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtCodpDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodpDescFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCdpPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCdpPreco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCdpEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCdpEstoque))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCdpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCdpNome))
                    .addComponent(txtCodpDesc)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApDesc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(211, 211, 211)
                                .addComponent(btnCadastrar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCdpMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCdpMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdpMarca)
                    .addComponent(txtCdpMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdpNome)
                    .addComponent(txtCdpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdpEstoque)
                    .addComponent(txtCdpEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCdpPreco)
                    .addComponent(txtCdpPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodpDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCdpPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdpPrecoActionPerformed
        // TODO add your handling code here:
        Verficacao v = new Verficacao();

        v.verificacaoFloat(txtCdpPreco);


    }//GEN-LAST:event_txtCdpPrecoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCdpMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCdpMarcaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCdpMarcaKeyTyped

    private void txtCdpEstoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCdpEstoqueKeyTyped
        // TODO add your handling code here:

        Verficacao v = new Verficacao();

        v.verificacaoNumeros(txtCdpEstoque);
    }//GEN-LAST:event_txtCdpEstoqueKeyTyped

    private void txtCdpNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCdpNomeKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCdpNomeKeyTyped

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:

        if (produto == null) {
            try {
                String texto = txtCdpMarca.getText();
                int marca = 0;

                if (texto.equals("amd") || texto.equals("AMD")) {
                    marca = 1;              
                }else if(texto.equals("INTEL") || texto.equals("intel")){
                    marca = 2;
                    }else if(texto.equals("corsair") || texto.equals("CORSAIR")){
                    marca = 3;
                }else if(texto.equals("gigabyte") || texto.equals("GIGABYTE")){
                    marca = 4;
                }else if(texto.equals("ASROCK") || texto.equals("asrock")){
                    marca = 5;
                }else if(texto.equals("MSI") || texto.equals("msi")){
                    marca = 6;
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Nao temos essa marca por favor inserir outra");
                }
                
                String nome = txtCdpNome.getText().toUpperCase();
                    int estoque = Integer.parseInt(txtCdpEstoque.getText());
                    String precoText = txtCdpPreco.getText().replace(",", ".");
                    double preco = Double.parseDouble(precoText);
                    String descricao = txtCodpDesc.getText();

                    Produto produto = new Produto(marca, nome, estoque, preco, descricao);

                    boolean retorno = ProdutoDAO.salvar(produto);

                    if (retorno) {
                        JOptionPane.showMessageDialog(rootPane, "Sucesso");
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro");
                    }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao converter um número. Verifique a formatação dos campos numéricos.");
                e.printStackTrace(); // Isso imprime informações detalhadas sobre a exceção no console para ajudar na depuração.
            }
        }


    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCdpPrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCdpPrecoKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_txtCdpPrecoKeyTyped

    private void txtCdpMarcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCdpMarcaMouseExited
        // TODO add your handling code here:


    }//GEN-LAST:event_txtCdpMarcaMouseExited

    private void txtCdpNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCdpNomeMouseExited
        // TODO add your handling code here:


    }//GEN-LAST:event_txtCdpNomeMouseExited

    private void txtCdpMarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCdpMarcaFocusLost
        // TODO add your handling code here:

        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCdpMarca);
    }//GEN-LAST:event_txtCdpMarcaFocusLost

    private void txtCdpNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCdpNomeFocusLost
        // TODO add your handling code here:

        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCdpNome);
    }//GEN-LAST:event_txtCdpNomeFocusLost

    private void txtCdpEstoqueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCdpEstoqueFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdpEstoqueFocusLost

    private void txtCodpDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodpDescFocusLost
        // TODO add your handling code here:

        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCodpDesc);
    }//GEN-LAST:event_txtCodpDescFocusLost

    private void txtCdpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdpNomeActionPerformed

    private void txtCdpMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdpMarcaActionPerformed
        // TODO add your handling code here:
        Verficacao v = new Verficacao();

        v.verificacaoTexto(txtCdpMarca);
    }//GEN-LAST:event_txtCdpMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblApDesc;
    private javax.swing.JLabel lblCdpEstoque;
    private javax.swing.JLabel lblCdpMarca;
    private javax.swing.JLabel lblCdpNome;
    private javax.swing.JLabel lblCdpPreco;
    private javax.swing.JPanel pnlCadastroProduto;
    private javax.swing.JTextField txtCdpEstoque;
    private javax.swing.JTextField txtCdpMarca;
    private javax.swing.JTextField txtCdpNome;
    private javax.swing.JFormattedTextField txtCdpPreco;
    private javax.swing.JTextField txtCodpDesc;
    // End of variables declaration//GEN-END:variables

    public void verificacaoNumeros(JTextField txtN) {

        String id = txtN.getText();

        if (!txtN.getText().trim().equals("")) {
            try {

                Integer.valueOf(id);

            } catch (Exception e) {
                //Escreva aqui a mensagem para o usuário
                JOptionPane.showMessageDialog(rootPane, "Campo número permite somente números!");
                txtN.setBackground(Color.red);
            }

        }

    }

}