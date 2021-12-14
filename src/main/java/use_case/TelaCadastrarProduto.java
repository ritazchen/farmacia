/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package use_case;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phfar
 */
public class TelaCadastrarProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrarProduto
     */

    public TelaCadastrarProduto() {
        initComponents();
        labelPrincipioAtivo.setVisible(false);
        campoPrincipioAtivo.setVisible(false);
        labelDose.setVisible(false);
        campoDose.setVisible(false);
        labelTarja.setVisible(false);
        campoTarja.setVisible(false);
        painelTabela.setVisible(false);
        botaoAdicionarPrincipioAtivo.setVisible(false);
        teste();
        
        String[] categoriasNome = new String[categorias.size()+1];
        categoriasNome[0] = "Escolha a categoria...";
        for(int i = 0; i < categorias.size(); i++) {
            categoriasNome[i+1] = categorias.get(i).getNome();
        }
        campoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(categoriasNome));
        
        String[] fabricantesNome = new String[fabricantes.size()+1];
        fabricantesNome[0] = "Escolha o fabricante...";
        for(int i = 0; i < fabricantes.size(); i++) {
            fabricantesNome[i+1] = fabricantes.get(i).getNome();
        }
        campoFabricante.setModel(new javax.swing.DefaultComboBoxModel<>(fabricantesNome));
        
        String[] tarjasNome = new String[tarjas.size()+1];
        tarjasNome[0] = "Escolha a tarja...";
        for(int i = 0; i < tarjas.size(); i++) {
            tarjasNome[i+1] = tarjas.get(i).getNome();
        }
        campoTarja.setModel(new javax.swing.DefaultComboBoxModel<>(tarjasNome));
        
        String[] principiosAtivosNome = new String[principiosAtivos.size()+1];
        principiosAtivosNome[0] = "Escolha o(s) princípio(s) ativo(s)...";
        for(int i = 0; i < principiosAtivos.size(); i++) {
            principiosAtivosNome[i+1] = principiosAtivos.get(i).getNome();
        }
        campoPrincipioAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(principiosAtivosNome));
    }
    
    public void teste(){
        categorias = new ArrayList<CategoriaProduto>();
    	categoria1 = new CategoriaProduto("Medicamentos", "Descrição de Categoria de Produto 1");        
        categoria2 = new CategoriaProduto("Higiene e Cuidados Pessoais", "Descrição de Categoria de Produto 2");
        categoria3 = new CategoriaProduto("Saúde e Bem-estar", "Descrição de Categoria de Produto 3");
        categoria4 = new CategoriaProduto("Beleza e Dermocosméticos", "Descrição de Categoria de Produto 4");
        categoria5 = new CategoriaProduto("Conveniência", "Descrição de Categoria de Produto 5");
        categoria6 = new CategoriaProduto("Mundo Infantil", "Descrição de Categoria de Produto 6");
        categoria7 = new CategoriaProduto("Outros", "Descrição de Categoria de Produto 7");
        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        categorias.add(categoria5);
        categorias.add(categoria6);
        categorias.add(categoria7);
        
        fabricantes = new ArrayList<Fabricante>();
        fabricante1 = new Fabricante("Sanofi");
        fabricante2 = new Fabricante("EMS");
        fabricante3 = new Fabricante("Braida");
        fabricantes.add(fabricante1);
        fabricantes.add(fabricante2);
        fabricantes.add(fabricante3);
        
        tarjas = new ArrayList<Tarja>();
        tarja1 = new Tarja("Livre Comercialização", false);
        tarja2 = new Tarja("Tarja Vermelha sem retenção de receita", false);
        tarja3 = new Tarja("Tarja Vermelha com retenção de receita", true);
        tarja4 = new Tarja("Tarja Preta", true);
        tarjas.add(tarja1);
        tarjas.add(tarja2);
        tarjas.add(tarja3);
        tarjas.add(tarja4);
        
        principiosAtivos = new ArrayList<PrincipioAtivo>();
        principioAtivo1 = new PrincipioAtivo("PrincipioAtivo 1");
        principioAtivo2 = new PrincipioAtivo("PrincipioAtivo 2");
        principioAtivo3 = new PrincipioAtivo("PrincipioAtivo 3");
        principioAtivo4 = new PrincipioAtivo("PrincipioAtivo 4");
        principiosAtivos.add(principioAtivo1);
        principiosAtivos.add(principioAtivo2);
        principiosAtivos.add(principioAtivo3);
        principiosAtivos.add(principioAtivo4);
        
        produtos = new ArrayList<Produto>();
        produto1 = new Produto("Shampoo", "Descrição do produto 1", 13.0, categoria2, fabricante3);  
        produto2 = new Produto("Repelente", "Descrição do produto 2", 20.50, categoria3, fabricante3); 
        produto3 = new Produto("Serum Vitamina C", "Descrição do produto 3", 120.99, categoria4, fabricante3); 
        produto4 = new Produto("Fralda", "Descrição do produto 4", 20.58, categoria6, fabricante3); 
        produto5 = new Produto("Adoçante", "Descrição do produto 5", 8.50, categoria5, fabricante3); 
//        med1 = new Medicamento("BraiDorflex", "Remédio para dor", 21.99, categoria1, fabricante1, "Analgésico", tarja1, listaPrincipioAtivo1);;
//        med2 = new Medicamento("Ivermectina", "Remédio para piolho", 15.00, categoria1, fabricante2, "Tipo 2", tarja2, listaPrincipioAtivo1);
//        med3 = new Medicamento("Rivotril", "Remédio antidepressivo", 30.00, categoria1, fabricante3, "Antidepressivo", tarja4, listaPrincipioAtivo2);
//        med4 = new Medicamento("Azitromicina", "Remédio 4", 30.00, categoria1, fabricante3, "Tipo 3", tarja3, listaPrincipioAtivo2);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
//        produtos.add(med1);
//        produtos.add(med2);
//        produtos.add(med3);
//        produtos.add(med4);
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
        campoNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        botaoAdicionarProdutoAoEstoque = new javax.swing.JButton();
        labelCategoria = new javax.swing.JLabel();
        labelPrecoDeVenda = new javax.swing.JLabel();
        campoPrecoDeVenda = new javax.swing.JTextField();
        campoCategoria = new javax.swing.JComboBox<>();
        campoPrincipioAtivo = new javax.swing.JComboBox<>();
        labelDose = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        labelFabricante = new javax.swing.JLabel();
        labelQuantidade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        campoQuantidade = new javax.swing.JSpinner();
        labelPrincipioAtivo = new javax.swing.JLabel();
        campoDose = new javax.swing.JTextField();
        labelTarja = new javax.swing.JLabel();
        campoTarja = new javax.swing.JComboBox<>();
        painelTabela = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPrincipiosAtivos = new javax.swing.JTable();
        botaoRemoverPrincipiosAtivos = new javax.swing.JButton();
        botaoAdicionarPrincipioAtivo = new javax.swing.JButton();
        campoFabricante = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setBackground(new java.awt.Color(255, 255, 255));
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

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelNome.setText("NOME");

        botaoAdicionarProdutoAoEstoque.setBackground(new java.awt.Color(255, 49, 79));
        botaoAdicionarProdutoAoEstoque.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoAdicionarProdutoAoEstoque.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionarProdutoAoEstoque.setText("ADICIONAR PRODUTO AO ESTOQUE");
        botaoAdicionarProdutoAoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarProdutoAoEstoqueActionPerformed(evt);
            }
        });

        labelCategoria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelCategoria.setText("CATEGORIA");

        labelPrecoDeVenda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelPrecoDeVenda.setText("PREÇO DE VENDA");

        campoPrecoDeVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoPrecoDeVenda.setText("0.00");

        campoCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a categoria...", "Higiene Pessoal", "Medicamento", "Alimentos", "Vestimenta", "Artigos Pessoais" }));
        campoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCategoriaActionPerformed(evt);
            }
        });

        campoPrincipioAtivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoPrincipioAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o(s) princípio(s) ativo(s)...", "Item 1", "Item 2", "Item 3", "Item 4" }));
        campoPrincipioAtivo.setLightWeightPopupEnabled(false);
        campoPrincipioAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrincipioAtivoActionPerformed(evt);
            }
        });

        labelDose.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelDose.setText("DOSE (mg)");

        labelDescricao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelDescricao.setText("DESCRIÇÃO DO PRODUTO");

        labelFabricante.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelFabricante.setText("FABRICANTE");

        labelQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelQuantidade.setText("QUANTIDADE");

        campoDescricao.setColumns(20);
        campoDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoDescricao.setRows(5);
        jScrollPane1.setViewportView(campoDescricao);

        campoQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        labelPrincipioAtivo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelPrincipioAtivo.setText("PRINCÍPIO(S) ATIVO(S)");

        campoDose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        labelTarja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTarja.setText("TARJA");

        campoTarja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoTarja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre comercialização", "Vermelha sem retenção de receita", "Vermelha com retenção de receita", "Preta" }));

        painelTabela.setBackground(new java.awt.Color(214, 217, 223));

        tabelaPrincipiosAtivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Principio Ativo", "Dose (mg)", "Remover"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaPrincipiosAtivos.setRowSelectionAllowed(false);
        tabelaPrincipiosAtivos.getTableHeader().setResizingAllowed(false);
        tabelaPrincipiosAtivos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaPrincipiosAtivos);

        botaoRemoverPrincipiosAtivos.setBackground(new java.awt.Color(255, 49, 79));
        botaoRemoverPrincipiosAtivos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botaoRemoverPrincipiosAtivos.setForeground(new java.awt.Color(255, 255, 255));
        botaoRemoverPrincipiosAtivos.setText("REMOVER ITENS SELECIONADOS");
        botaoRemoverPrincipiosAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverPrincipiosAtivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTabelaLayout = new javax.swing.GroupLayout(painelTabela);
        painelTabela.setLayout(painelTabelaLayout);
        painelTabelaLayout.setHorizontalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTabelaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRemoverPrincipiosAtivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        painelTabelaLayout.setVerticalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoRemoverPrincipiosAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        botaoAdicionarPrincipioAtivo.setBackground(new java.awt.Color(255, 49, 79));
        botaoAdicionarPrincipioAtivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoAdicionarPrincipioAtivo.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionarPrincipioAtivo.setText("ADICIONAR");
        botaoAdicionarPrincipioAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarPrincipioAtivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCategoria)
                            .addComponent(campoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFabricante)
                                    .addComponent(campoFabricante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(labelDescricao)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAdicionarProdutoAoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTarja)
                            .addComponent(campoTarja, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelQuantidade)
                                    .addComponent(campoQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(labelPrincipioAtivo)
                                    .addComponent(campoPrincipioAtivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPrecoDeVenda)
                                    .addComponent(campoPrecoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDose)
                                            .addComponent(campoDose, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46)
                                        .addComponent(botaoAdicionarPrincipioAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botaoVoltar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFabricante))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(campoFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQuantidade)
                            .addComponent(labelPrecoDeVenda))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPrincipioAtivo)
                            .addComponent(labelDose))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDose)
                            .addComponent(campoPrincipioAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoAdicionarPrincipioAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelTarja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTarja, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoAdicionarProdutoAoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean validaCamposProduto() {
//        System.out.println(campoNome.getText
        if(campoCategoria.getSelectedItem() == "Escolha a categoria...") {
            System.out.println("Falta categoria");
            return false;
        }
        if(campoNome.getText().isEmpty()) {
            System.out.println("Falta nome");
            return false;
        }
        if(campoFabricante.getSelectedItem() == "Escolha o fabricante...") {
            System.out.println("Falta fabricante");
            return false;
        }
        if(campoDescricao.getText().isEmpty()) {
            System.out.println("Falta descricao");
            return false;
        }
        if(Double.parseDouble(campoPrecoDeVenda.getText()) <= 0.00) {
            System.out.println("Preco invalido");
            return false;
        }
        
        return true;
    }
    
    private boolean validaCamposMedicamento() {
        if(tabelaPrincipiosAtivos.getRowCount() == 0) {
            System.out.println("Falta principios ativos");
            return false;
        }
        if(campoTarja.getSelectedItem() == "Escolha a tarja...") {
            System.out.println("Falta tarja");
            return false;
        }
        return true;
    }
    
    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        TelaInicial telaInicial= new TelaInicial();
        telaInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoAdicionarProdutoAoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarProdutoAoEstoqueActionPerformed
        
        if(campoCategoria.getSelectedItem() == "Medicamentos") {
            System.out.println(produtos.get(produtos.size()-1).getNome());
            if(validaCamposProduto() && validaCamposMedicamento()) {
                //Medicamento(String nome, String descricao, double preco, CategoriaProduto categoria, Fabricante fabricante, Tarja tarja, List<ItemPrincipioAtivo> itemPrincipioAtivo){
                Medicamento med = new Medicamento(campoNome.getText(), campoDescricao.getText(), Double.parseDouble(campoPrecoDeVenda.getText()), buscaCategoria((String)campoCategoria.getSelectedItem()), buscaFabricante((String)campoFabricante.getSelectedItem()), buscaTarja((String)campoTarja.getSelectedItem()), getListaItemPrincipioAtivo() );
                produtos.add(med);
                System.out.println(((Medicamento)produtos.get(produtos.size()-1)).getItemPrincipioAtivo().size());
                
                TelaInicial telaInicial= new TelaInicial();
                telaInicial.setVisible(true);
                this.dispose();
                
            }
        }
        else {
            System.out.println(produtos.get(produtos.size()-1).getNome());
            if(validaCamposProduto()){
                Produto prod = new Produto(campoNome.getText(), campoDescricao.getText(), Double.parseDouble(campoPrecoDeVenda.getText()), buscaCategoria((String)campoCategoria.getSelectedItem()), buscaFabricante((String)campoFabricante.getSelectedItem()));
                produtos.add(prod);
                System.out.println(produtos.get(produtos.size()-1).getNome());
                
                TelaInicial telaInicial= new TelaInicial();
                telaInicial.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_botaoAdicionarProdutoAoEstoqueActionPerformed
    
    private CategoriaProduto buscaCategoria(String categoria) {
        for(int i = 0; i < categorias.size(); i++)
        {
            if(categorias.get(i).getNome() == categoria) {
                return categorias.get(i);
            }
        }
        return null;
    }
    
    private Fabricante buscaFabricante(String fabricante) {
        for(int i = 0; i < fabricantes.size(); i++)
        {
            if(fabricantes.get(i).getNome() == fabricante) {
                return fabricantes.get(i);
            }
        }
        return null;
    }
    
    private Tarja buscaTarja(String tarja) {
        for(int i = 0; i < tarjas.size(); i++)
        {
            if(tarjas.get(i).getNome() == tarja) {
                return tarjas.get(i);
            }
        }
        return null;
    }
    
    private PrincipioAtivo buscaPrincipioAtivo(String principioAtivo) {
        for(int i = 0; i < principiosAtivos.size(); i++)
        {
            if(principiosAtivos.get(i).getNome() == principioAtivo) {
                return principiosAtivos.get(i);
            }
        }
        return null;
    }
    
    private List<ItemPrincipioAtivo> getListaItemPrincipioAtivo() {
        List<ItemPrincipioAtivo> listaItemPrincipiosAtivos = new ArrayList<ItemPrincipioAtivo>();
        
        for(int i=0;i < tabelaPrincipiosAtivos.getRowCount();i++){
            ItemPrincipioAtivo itemPA = new ItemPrincipioAtivo(buscaPrincipioAtivo((String)tabelaPrincipiosAtivos.getValueAt(i,0)), (double)tabelaPrincipiosAtivos.getValueAt(i,1));
            listaItemPrincipiosAtivos.add(itemPA);
        }
        return listaItemPrincipiosAtivos;
    }
    
    private void campoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCategoriaActionPerformed
        if(campoCategoria.getSelectedItem() == "Medicamentos") {
            labelPrincipioAtivo.setVisible(true);
            campoPrincipioAtivo.setVisible(true);
            labelDose.setVisible(true);
            campoDose.setVisible(true);
            labelTarja.setVisible(true);
            campoTarja.setVisible(true);
            painelTabela.setVisible(true);
            botaoAdicionarPrincipioAtivo.setVisible(true);
        } else {
            labelPrincipioAtivo.setVisible(false);
            campoPrincipioAtivo.setVisible(false);
            labelDose.setVisible(false);
            campoDose.setVisible(false);
            labelTarja.setVisible(false);
            campoTarja.setVisible(false);
            painelTabela.setVisible(false);
            botaoAdicionarPrincipioAtivo.setVisible(false);
        }
    }//GEN-LAST:event_campoCategoriaActionPerformed

    private void campoPrincipioAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrincipioAtivoActionPerformed

    }//GEN-LAST:event_campoPrincipioAtivoActionPerformed

    private void botaoAdicionarPrincipioAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarPrincipioAtivoActionPerformed
        Object item = campoPrincipioAtivo.getSelectedItem();
        
        DefaultTableModel model = (DefaultTableModel) tabelaPrincipiosAtivos.getModel();
        if(!"Escolha o(s) princípio(s) ativo(s)...".equals(campoPrincipioAtivo.getSelectedItem()) && !campoDose.getText().isEmpty() && Double.parseDouble(campoDose.getText()) > 0) {
            double dose = Double.parseDouble(campoDose.getText());
            model.addRow(new Object[]{item, dose, false});
            campoPrincipioAtivo.removeItem(item);
            campoPrincipioAtivo.setSelectedItem((String)"Escolha o(s) princípio(s) ativo(s)...");
            campoDose.setText(""); 
        }
    }//GEN-LAST:event_botaoAdicionarPrincipioAtivoActionPerformed

    private void botaoRemoverPrincipiosAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverPrincipiosAtivosActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaPrincipiosAtivos.getModel();
        for(int i=0;i < tabelaPrincipiosAtivos.getRowCount();i++){
            if((boolean)tabelaPrincipiosAtivos.getValueAt(i, 2)) {
                Object itemPrincipioAtivo = tabelaPrincipiosAtivos.getValueAt(i, 0);
                campoPrincipioAtivo.addItem((String)itemPrincipioAtivo);
                model.removeRow(i);
                i--;
            }
        }
    }//GEN-LAST:event_botaoRemoverPrincipiosAtivosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarProduto().setVisible(true);
            }
        });
    }
    
    List<CategoriaProduto> categorias;
    CategoriaProduto categoria1;
    CategoriaProduto categoria2;
    CategoriaProduto categoria3;
    CategoriaProduto categoria4;
    CategoriaProduto categoria5;
    CategoriaProduto categoria6;
    CategoriaProduto categoria7;
    
    List<Fabricante> fabricantes;
    Fabricante fabricante1;
    Fabricante fabricante2;
    Fabricante fabricante3;
    
    List<Tarja> tarjas;
    Tarja tarja1;
    Tarja tarja2;
    Tarja tarja3;
    Tarja tarja4;
    
    List<PrincipioAtivo> principiosAtivos;
    PrincipioAtivo principioAtivo1;
    PrincipioAtivo principioAtivo2;
    PrincipioAtivo principioAtivo3;
    PrincipioAtivo principioAtivo4;
    
    List<Produto> produtos;
    Produto produto1;
    Produto produto2;
    Produto produto3;
    Produto produto4;
    Produto produto5;
    
    Medicamento med1;
    Medicamento med2;
    Medicamento med3;
    Medicamento med4;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarPrincipioAtivo;
    private javax.swing.JButton botaoAdicionarProdutoAoEstoque;
    private javax.swing.JButton botaoRemoverPrincipiosAtivos;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> campoCategoria;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoDose;
    private javax.swing.JComboBox<String> campoFabricante;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPrecoDeVenda;
    private javax.swing.JComboBox<String> campoPrincipioAtivo;
    private javax.swing.JSpinner campoQuantidade;
    private javax.swing.JComboBox<String> campoTarja;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelDose;
    private javax.swing.JLabel labelFabricante;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPrecoDeVenda;
    private javax.swing.JLabel labelPrincipioAtivo;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTarja;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JTable tabelaPrincipiosAtivos;
    // End of variables declaration//GEN-END:variables
}
