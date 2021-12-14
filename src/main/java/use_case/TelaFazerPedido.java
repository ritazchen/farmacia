package use_case;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaFazerPedido extends javax.swing.JFrame {

    private ControladorFarmacia controller;
    private List<Fornecedor> fornecedores;
 
    public TelaFazerPedido(ControladorFarmacia controller) {
        this.controller = controller;
        this.fornecedores = this.controller.getFornecedores();
        
        initComponents();

        String[] fornecedoresNome = new String[this.fornecedores.size()+1];
        fornecedoresNome[0] = "Escolha o fornecedor...";
        for(int i = 0; i < this.fornecedores.size(); i++) {
            fornecedoresNome[i+1] = this.fornecedores.get(i).getNome();
        }
        campoFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(fornecedoresNome));
        campoProdutoSelecionado.setEditable(false);
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVoltar = new javax.swing.JButton();
        labelFornecedor = new javax.swing.JLabel();
        campoFornecedor = new javax.swing.JComboBox<>();
        labelProdutos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        labelProdutoSelecionado = new javax.swing.JLabel();
        campoProdutoSelecionado = new javax.swing.JTextField();
        labelQuantidade = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JSpinner();
        labelProdutosSelecionados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutosSelecionados = new javax.swing.JTable();
        botaoRemoverItensSelecionados = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botaoAdicionarAoCarrinho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fazer Pedido");

        botaoVoltar.setBackground(new java.awt.Color(18, 17, 73));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("VOLTAR");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelFornecedor.setText("FORNECEDOR");

        campoFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o fornecedor..." }));
        campoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFornecedorActionPerformed(evt);
            }
        });

        labelProdutos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelProdutos.setText("PRODUTOS");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.getTableHeader().setResizingAllowed(false);
        tabelaProdutos.getTableHeader().setReorderingAllowed(false);
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        labelProdutoSelecionado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelProdutoSelecionado.setText("PRODUTO SELECIONADO");

        labelQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelQuantidade.setText("QUANTIDADE");

        campoQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        labelProdutosSelecionados.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelProdutosSelecionados.setText("CARRINHO");

        tabelaProdutosSelecionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "QUANTIDADE", "REMOVER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaProdutosSelecionados.setFocusable(false);
        tabelaProdutosSelecionados.getTableHeader().setResizingAllowed(false);
        tabelaProdutosSelecionados.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaProdutosSelecionados);

        botaoRemoverItensSelecionados.setBackground(new java.awt.Color(255, 49, 79));
        botaoRemoverItensSelecionados.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        botaoRemoverItensSelecionados.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverItensSelecionados.setText("REMOVER ITENS SELECIONADOS");
        botaoRemoverItensSelecionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverItensSelecionadosActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 49, 79));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("FAZER PEDIDO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFazerPedido(evt);
            }
        });

        botaoAdicionarAoCarrinho.setBackground(new java.awt.Color(255, 49, 79));
        botaoAdicionarAoCarrinho.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoAdicionarAoCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionarAoCarrinho.setText("ADICIONAR AO CARRINHO");
        botaoAdicionarAoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarAoCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1106, 1106, 1106))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFornecedor)
                            .addComponent(campoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoAdicionarAoCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(labelQuantidade)
                            .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProdutoSelecionado)
                            .addComponent(campoProdutoSelecionado)
                            .addComponent(campoQuantidade)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelProdutosSelecionados)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoRemoverItensSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(botaoVoltar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(botaoRemoverItensSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProdutosSelecionados)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(labelProdutoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoProdutoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAdicionarAoCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.controller.iniciarTelaInicial();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void campoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFornecedorActionPerformed
        limpaCampos();
        
        DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
        model.setRowCount(0);

        Fornecedor fornecedor = buscaFornecedor((String)campoFornecedor.getSelectedItem());
        if(fornecedor == null)
            return;     
       
        for(int i=0; i < fornecedor.getFabricantes().size(); i++) {
            for(int j=0; j < fornecedor.getFabricantes().get(i).getProdutos().size(); j++) {
                model.addRow(new Object[]{fornecedor.getFabricantes().get(i).getProdutos().get(j).getNome()});
            }
        }
    }//GEN-LAST:event_campoFornecedorActionPerformed

    private Fornecedor buscaFornecedor(String fornecedor) {
        for(int i = 0; i < this.fornecedores.size(); i++)
        {
            if(this.fornecedores.get(i).getNome() == fornecedor) {
                return this.fornecedores.get(i);
            }
        }
        return null;
    }

    private void botaoRemoverItensSelecionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverItensSelecionadosActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaProdutosSelecionados.getModel();
        for(int i=0;i < tabelaProdutosSelecionados.getRowCount();i++){
            if((boolean)tabelaProdutosSelecionados.getValueAt(i, 2)) {
                model.removeRow(i);
                i--;
            }
        }
    }//GEN-LAST:event_botaoRemoverItensSelecionadosActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        campoQuantidade.setValue(0);
        
        DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
        String produtoSelecionado = (String) model.getValueAt(tabelaProdutos.getSelectedRow(), 0);
        
        campoProdutoSelecionado.setText(produtoSelecionado);
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void botaoAdicionarAoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarAoCarrinhoActionPerformed
        if(!"".equals(campoProdutoSelecionado.getText()) && (int)campoQuantidade.getValue() != 0) {
            DefaultTableModel model = (DefaultTableModel) tabelaProdutosSelecionados.getModel();
            model.addRow(new Object[]{campoProdutoSelecionado.getText(), (int)campoQuantidade.getValue(), false});
            campoQuantidade.setValue(0);
        }
    }//GEN-LAST:event_botaoAdicionarAoCarrinhoActionPerformed

    private void botaoFazerPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFazerPedido
        // TODO add your handling code here:
        this.controller.iniciarTelaInicial();
    }//GEN-LAST:event_botaoFazerPedido

    private void limpaCampos() {
        campoProdutoSelecionado.setText("");
        campoQuantidade.setValue(0);
        DefaultTableModel model = (DefaultTableModel) tabelaProdutosSelecionados.getModel();
        model.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarAoCarrinho;
    private javax.swing.JButton botaoRemoverItensSelecionados;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> campoFornecedor;
    private javax.swing.JTextField campoProdutoSelecionado;
    private javax.swing.JSpinner campoQuantidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFornecedor;
    private javax.swing.JLabel labelProdutoSelecionado;
    private javax.swing.JLabel labelProdutos;
    private javax.swing.JLabel labelProdutosSelecionados;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTable tabelaProdutosSelecionados;
    // End of variables declaration//GEN-END:variables
}
