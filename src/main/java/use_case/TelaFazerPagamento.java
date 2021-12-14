/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package use_case;

import javax.swing.table.DefaultTableModel;

public class TelaFazerPagamento extends javax.swing.JFrame {
    private final TelaVenda telaVenda;
    private ControladorFarmacia controller;

    public TelaFazerPagamento(TelaVenda telaVenda, ControladorFarmacia controller) {
        this.telaVenda = telaVenda;
        initComponents();
        criaTabela();
        escondeFormularioCartao();
        campoSubtotalCompra.setText(this.telaVenda.getValorTotalDaCompra());
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVoltar = new javax.swing.JButton();
        labelFormaDePagamento = new javax.swing.JLabel();
        campoFormaDePagamento = new javax.swing.JComboBox<>();
        labelNumeroDoCartao = new javax.swing.JLabel();
        campoNumeroDoCartao = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        labelCodigoDeSeguranca = new javax.swing.JLabel();
        campoValidade = new javax.swing.JTextField();
        campoCodigoDeSeguranca = new javax.swing.JTextField();
        labelNomeImpressoNoCartao = new javax.swing.JLabel();
        campoNomeImpressoNoCartao = new javax.swing.JTextField();
        labelNumeroDeParcelas = new javax.swing.JLabel();
        campoNumeroDeParcelas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutosDaVenda = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        labelSubtotalCompra = new javax.swing.JLabel();
        campoSubtotalCompra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fazer Pagamento");
        setPreferredSize(new java.awt.Dimension(1280, 751));
        setResizable(false);

        botaoVoltar.setBackground(new java.awt.Color(18, 17, 73));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("VOLTAR");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelFormaDePagamento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelFormaDePagamento.setText("FORMA DE PAGAMENTO");

        campoFormaDePagamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoFormaDePagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a forma de pagamento...", "Dinheiro", "Cartão de Crédito", "Cartão de Débito" }));
        campoFormaDePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFormaDePagamentoActionPerformed(evt);
            }
        });

        labelNumeroDoCartao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelNumeroDoCartao.setText("NÚMERO DO CARTÃO");

        campoNumeroDoCartao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNumeroDoCartao.setText("0000 0000 0000 0000");
        campoNumeroDoCartao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNumeroDoCartaoFocusLost(evt);
            }
        });
        campoNumeroDoCartao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoNumeroDoCartaoMouseClicked(evt);
            }
        });

        labelValidade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelValidade.setText("VALIDADE (MM/AA)");

        labelCodigoDeSeguranca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelCodigoDeSeguranca.setText("CÓD. DE SEGURANÇA");

        campoValidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoValidade.setText("__/__");
        campoValidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoValidadeFocusLost(evt);
            }
        });
        campoValidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoValidadeMouseClicked(evt);
            }
        });

        campoCodigoDeSeguranca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoCodigoDeSeguranca.setText("000");
        campoCodigoDeSeguranca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCodigoDeSegurancaFocusLost(evt);
            }
        });
        campoCodigoDeSeguranca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCodigoDeSegurancaMouseClicked(evt);
            }
        });

        labelNomeImpressoNoCartao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelNomeImpressoNoCartao.setText("NOME IMPRESSO NO CARTÃO");

        campoNomeImpressoNoCartao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        labelNumeroDeParcelas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelNumeroDeParcelas.setText("NÚMERO DE PARCELAS");

        campoNumeroDeParcelas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNumeroDeParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "À vista", "Parcelamento em 2x" }));
        campoNumeroDeParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroDeParcelasActionPerformed(evt);
            }
        });

        tabelaProdutosDaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "PREÇO", "QUANTIDADE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaProdutosDaVenda.setFocusable(false);
        tabelaProdutosDaVenda.setRowSelectionAllowed(false);
        tabelaProdutosDaVenda.getTableHeader().setResizingAllowed(false);
        tabelaProdutosDaVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaProdutosDaVenda);

        jButton1.setBackground(new java.awt.Color(255, 49, 79));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RECEBER PAGAMENTO");

        labelSubtotalCompra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSubtotalCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSubtotalCompra.setText("SUBTOTAL DA COMPRA (R$)");

        campoSubtotalCompra.setEditable(false);
        campoSubtotalCompra.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        campoSubtotalCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNumeroDeParcelas)
                    .addComponent(labelNomeImpressoNoCartao)
                    .addComponent(labelNumeroDoCartao)
                    .addComponent(labelFormaDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumeroDoCartao)
                    .addComponent(campoFormaDePagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValidade)
                            .addComponent(campoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodigoDeSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCodigoDeSeguranca)))
                    .addComponent(campoNomeImpressoNoCartao)
                    .addComponent(campoNumeroDeParcelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelSubtotalCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                        .addComponent(campoSubtotalCompra))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botaoVoltar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFormaDePagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFormaDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(labelNumeroDoCartao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumeroDoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelValidade)
                            .addComponent(labelCodigoDeSeguranca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCodigoDeSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(labelNomeImpressoNoCartao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNomeImpressoNoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(labelNumeroDeParcelas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumeroDeParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(labelSubtotalCompra)
                        .addGap(5, 5, 5)
                        .addComponent(campoSubtotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.controller.setView(this.telaVenda);
        this.telaVenda.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void campoFormaDePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFormaDePagamentoActionPerformed
        if("Cartão de Crédito".equals(campoFormaDePagamento.getSelectedItem())) {
            mostraFormularioCartao();
            labelNumeroDeParcelas.setVisible(true);
            campoNumeroDeParcelas.setVisible(true);
        } else if("Cartão de Débito".equals(campoFormaDePagamento.getSelectedItem())) {
            mostraFormularioCartao();
            labelNumeroDeParcelas.setVisible(false);
            campoNumeroDeParcelas.setVisible(false);
        } else if("Dinheiro".equals(campoFormaDePagamento.getSelectedItem())){
            escondeFormularioCartao();
        } else {
            escondeFormularioCartao();
        }
    }//GEN-LAST:event_campoFormaDePagamentoActionPerformed

    private void campoNumeroDoCartaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoNumeroDoCartaoMouseClicked
        if ("0000 0000 0000 0000".equals(campoNumeroDoCartao.getText())) {
            campoNumeroDoCartao.setText("");
        }
    }//GEN-LAST:event_campoNumeroDoCartaoMouseClicked

    private void campoValidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoValidadeMouseClicked
        if ("__/__".equals(campoValidade.getText())) {
            campoValidade.setText("");
        }
    }//GEN-LAST:event_campoValidadeMouseClicked

    private void campoCodigoDeSegurancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCodigoDeSegurancaMouseClicked
        if ("000".equals(campoCodigoDeSeguranca.getText())) {
            campoCodigoDeSeguranca.setText("");
        }
    }//GEN-LAST:event_campoCodigoDeSegurancaMouseClicked

    private void campoNumeroDoCartaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNumeroDoCartaoFocusLost
        if ("".equals(campoNumeroDoCartao.getText())) {
            campoNumeroDoCartao.setText("0000 0000 0000 0000");
        }
    }//GEN-LAST:event_campoNumeroDoCartaoFocusLost

    private void campoNumeroDeParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroDeParcelasActionPerformed
        
    }//GEN-LAST:event_campoNumeroDeParcelasActionPerformed

    private void campoValidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoValidadeFocusLost
        if ("".equals(campoValidade.getText())) {
            campoValidade.setText("__/__");
        }
    }//GEN-LAST:event_campoValidadeFocusLost

    private void campoCodigoDeSegurancaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodigoDeSegurancaFocusLost
        if ("".equals(campoCodigoDeSeguranca.getText())) {
            campoCodigoDeSeguranca.setText("000");
        }
    }//GEN-LAST:event_campoCodigoDeSegurancaFocusLost
    
    private void criaTabela() {
        DefaultTableModel modelTelaPagamento = (DefaultTableModel) tabelaProdutosDaVenda.getModel();
        DefaultTableModel modelTelaVenda = (DefaultTableModel) this.telaVenda.getTabelaDeProdutos().getModel();
        for(int i=0;i<modelTelaVenda.getRowCount();i++){
            modelTelaPagamento.addRow(new Object[]{modelTelaVenda.getValueAt(i, 0), modelTelaVenda.getValueAt(i, 1), modelTelaVenda.getValueAt(i, 2), modelTelaVenda.getValueAt(i, 3)});
        }
    }
    
    private void mostraFormularioCartao() {
        labelNumeroDoCartao.setVisible(true);
        campoNumeroDoCartao.setVisible(true);
        labelValidade.setVisible(true);
        campoValidade.setVisible(true);
        labelCodigoDeSeguranca.setVisible(true);
        campoCodigoDeSeguranca.setVisible(true);
        labelNomeImpressoNoCartao.setVisible(true);
        campoNomeImpressoNoCartao.setVisible(true);
    }
    
    private void escondeFormularioCartao() {
        labelNumeroDoCartao.setVisible(false);
        campoNumeroDoCartao.setVisible(false);
        labelValidade.setVisible(false);
        campoValidade.setVisible(false);
        labelCodigoDeSeguranca.setVisible(false);
        campoCodigoDeSeguranca.setVisible(false);
        labelNomeImpressoNoCartao.setVisible(false);
        campoNomeImpressoNoCartao.setVisible(false);
        labelNumeroDeParcelas.setVisible(false);
        campoNumeroDeParcelas.setVisible(false);
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
            java.util.logging.Logger.getLogger(TelaFazerPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFazerPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFazerPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFazerPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCodigoDeSeguranca;
    private javax.swing.JComboBox<String> campoFormaDePagamento;
    private javax.swing.JTextField campoNomeImpressoNoCartao;
    private javax.swing.JComboBox<String> campoNumeroDeParcelas;
    private javax.swing.JTextField campoNumeroDoCartao;
    private javax.swing.JTextField campoSubtotalCompra;
    private javax.swing.JTextField campoValidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodigoDeSeguranca;
    private javax.swing.JLabel labelFormaDePagamento;
    private javax.swing.JLabel labelNomeImpressoNoCartao;
    private javax.swing.JLabel labelNumeroDeParcelas;
    private javax.swing.JLabel labelNumeroDoCartao;
    private javax.swing.JLabel labelSubtotalCompra;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JTable tabelaProdutosDaVenda;
    // End of variables declaration//GEN-END:variables
}
