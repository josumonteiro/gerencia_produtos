/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.josue.gerenciaprods;

import br.senac.josue.gerenciaprods.Classes.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author josue.minacio
 */
public class Cadastrar extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Cadastrar() {
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

        jPanelCadastroProd = new javax.swing.JPanel();
        jLabelIdProd = new javax.swing.JLabel();
        jLabelNomeProd = new javax.swing.JLabel();
        jLabelDescProd = new javax.swing.JLabel();
        jLabelValCompraProd = new javax.swing.JLabel();
        jLabelValVendaProd = new javax.swing.JLabel();
        jLabelCategProd = new javax.swing.JLabel();
        jTextFieldNomeProd = new javax.swing.JTextField();
        jTextFieldDescProd = new javax.swing.JTextField();
        jTextFieldCategProd = new javax.swing.JTextField();
        jTextFieldIdProd = new javax.swing.JTextField();
        jFormattedTextFieldValCompraProd = new javax.swing.JFormattedTextField();
        jFormattedTextFieldValVendaProd = new javax.swing.JFormattedTextField();
        jButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCadastroProd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastro Produto"));

        jLabelIdProd.setText("ID");

        jLabelNomeProd.setText("Nome");

        jLabelDescProd.setText("Descrição");

        jLabelValCompraProd.setText("ValorCompra");

        jLabelValVendaProd.setText("ValorVenda");

        jLabelCategProd.setText("Categoria");

        jTextFieldNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeProdActionPerformed(evt);
            }
        });

        jTextFieldDescProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescProdActionPerformed(evt);
            }
        });

        jTextFieldCategProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategProdActionPerformed(evt);
            }
        });

        jTextFieldIdProd.setEditable(false);
        jTextFieldIdProd.setEnabled(false);

        jFormattedTextFieldValCompraProd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jFormattedTextFieldValVendaProd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout jPanelCadastroProdLayout = new javax.swing.GroupLayout(jPanelCadastroProd);
        jPanelCadastroProd.setLayout(jPanelCadastroProdLayout);
        jPanelCadastroProdLayout.setHorizontalGroup(
            jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCadastroProdLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeProd)
                            .addComponent(jLabelIdProd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroProdLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValVendaProd)
                            .addComponent(jLabelCategProd))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCategProd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastroProdLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldValVendaProd)
                                .addGap(1, 1, 1))))
                    .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroProdLayout.createSequentialGroup()
                            .addComponent(jLabelValCompraProd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFormattedTextFieldValCompraProd))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroProdLayout.createSequentialGroup()
                            .addComponent(jLabelDescProd)
                            .addGap(25, 25, 25)
                            .addComponent(jTextFieldDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(215, 215, 215))
        );
        jPanelCadastroProdLayout.setVerticalGroup(
            jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroProdLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdProd)
                            .addComponent(jTextFieldIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNomeProd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescProd)
                            .addComponent(jTextFieldDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValCompraProd))
                    .addComponent(jFormattedTextFieldValCompraProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelValVendaProd)
                    .addComponent(jFormattedTextFieldValVendaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategProd))
                .addGap(41, 41, 41))
        );

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jPanelCadastroProd, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastroProd, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeProdActionPerformed

    private void jTextFieldDescProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescProdActionPerformed

    private void jTextFieldCategProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategProdActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        Produto produto = new Produto();

        produto.setNome((String) jTextFieldNomeProd.getText());
        produto.setDescricao((String) jTextFieldDescProd.getText());
        produto.setCategoria((String) jTextFieldCategProd.getText());

        //
        Double valCompra = null;
        try {
            Number num = (Number) jFormattedTextFieldValCompraProd.getValue();
            valCompra = num.doubleValue();
        } catch (Exception e) {

        }
        produto.setValorCompra(valCompra);

        //
        Double valVenda = null;
        try {
            Number num = (Number) jFormattedTextFieldValVendaProd.getValue();
            valVenda = num.doubleValue();
        } catch (Exception e) {

        }
        produto.setValorCompra(valVenda);

        //
        try {
            //Chama o serviço para cadastro do cliente
            ServicoProduto.cadastrarProduto(produto);
        } catch (Exception e) {
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JFormattedTextField jFormattedTextFieldValCompraProd;
    private javax.swing.JFormattedTextField jFormattedTextFieldValVendaProd;
    private javax.swing.JLabel jLabelCategProd;
    private javax.swing.JLabel jLabelDescProd;
    private javax.swing.JLabel jLabelIdProd;
    private javax.swing.JLabel jLabelNomeProd;
    private javax.swing.JLabel jLabelValCompraProd;
    private javax.swing.JLabel jLabelValVendaProd;
    private javax.swing.JPanel jPanelCadastroProd;
    private javax.swing.JTextField jTextFieldCategProd;
    private javax.swing.JTextField jTextFieldDescProd;
    private javax.swing.JTextField jTextFieldIdProd;
    private javax.swing.JTextField jTextFieldNomeProd;
    // End of variables declaration//GEN-END:variables
}
