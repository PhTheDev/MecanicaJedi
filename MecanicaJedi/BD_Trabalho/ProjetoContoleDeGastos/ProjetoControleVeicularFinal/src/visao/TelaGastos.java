/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.IServicosCRUD;
import persistencia.IVeiculoProprietarioCRUD;
import modelos.Servicos;
import modelos.VeiculoProprietario;
import modelos.Gastos;
import persistencia.IGastosCRUD;
import persistencia.GastosDAO;
import persistencia.ServicosDAO;
import persistencia.VeiculosProprietariosDAO;

/**
 *
 * @author ejmcc
 */
public class TelaGastos extends javax.swing.JFrame {
  private IServicosCRUD servicosBD = null;
  private IVeiculoProprietarioCRUD veiculoProprietarioBD = null;
  private IGastosCRUD gastosBD= null;
  /**
   * Creates new form TelaGastos
   */
  public TelaGastos() {
    initComponents();
    setLocationRelativeTo(null);
    try {
      // GASTOS
      gastosBD = new GastosDAO();
      // SERVICOS
      servicosBD = new ServicosDAO();
      ArrayList<Servicos> listaDeServicos = null;
      listaDeServicos = servicosBD.obterListaDeServicos();
      jComboBoxListaDeServicos.removeAllItems();
      for(int pos = 0; pos < listaDeServicos.size(); pos++){
        jComboBoxListaDeServicos.addItem(listaDeServicos.get(pos).toString());
      }
      // VEICULOS
      veiculoProprietarioBD = new VeiculosProprietariosDAO();
      ArrayList<VeiculoProprietario> listaDeVeiculosProprietarios = null;
      listaDeVeiculosProprietarios = veiculoProprietarioBD.obterListaDeVeiculoProprietarios();
      jComboBoxListaDeVeiculos.removeAllItems();
      for(int pos = 0; pos < listaDeVeiculosProprietarios.size(); pos++){
        jComboBoxListaDeVeiculos.addItem(listaDeVeiculosProprietarios.get(pos).toString());
      }
      mostrarGastosNaGrid();
    } catch (Exception erro) {
      JOptionPane.showMessageDialog(null, "Construtor Tela: "+erro.getMessage());
    }
  }
  private void limparTela(){
    jTextFieldIdData.setText("");
    jTextFieldIdValor.setText("");
  }
  private void mostrarGastosNaGrid(){
  try {
    ArrayList<Gastos> listaDeGastos = null;
    listaDeGastos = gastosBD.obterListaDeGastos();
    DefaultTableModel model =  (DefaultTableModel) jTableGastos.getModel();
    model.setNumRows(0); 
    if(listaDeGastos.isEmpty()) 
      throw new Exception("Lista de Gastos BD Vazia");
    for(int pos = 0; pos < listaDeGastos.size(); pos++){
      Gastos objGastos = listaDeGastos.get(pos);
      String[] linha = new String[5];
      linha[0] = objGastos.getIdentificador() + "";
      linha[1] = objGastos.getDataDoServico();
      linha[2] = objGastos.getValor() + "";
      linha[3] = objGastos.getIdServico() + "";
      linha[4] = objGastos.getIdVeiculoProprietario() + "";
      model.addRow(linha);
    }  
  } catch (Exception erro) {
      JOptionPane.showMessageDialog(rootPane, erro.getMessage());
    }    
}
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxListaDeServicos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxListaDeVeiculos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIdData = new javax.swing.JTextField();
        jTextFieldIdValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonIncluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGastos = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 50)); // NOI18N
        jLabel1.setText("GASTOS IMPERIAIS");

        jComboBoxListaDeServicos.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel2.setText("Tipo do Servico Realizado");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel3.setText("Data");

        jComboBoxListaDeVeiculos.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel4.setText("Veículo");

        jTextFieldId.setEditable(false);
        jTextFieldId.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel5.setText("Identificador");

        jTextFieldIdData.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N

        jTextFieldIdValor.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel6.setText("Valor");

        jButtonIncluir.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jButtonIncluir.setText("INCLUIR");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jTableGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "DATA", "VALOR", "SERVICO", "VEICULO"
            }
        ));
        jScrollPane1.setViewportView(jTableGastos);

        jButtonVoltar.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(153, 0, 51));
        jButtonVoltar.setText("X");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/Unlimited-Power-Palpatine-meme-6 (2).jpg"))); // NOI18N

        jLabel8.setText("PODER ILIMITADO POOHA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonIncluir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxListaDeServicos, 0, 538, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(140, 140, 140)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldIdValor)
                                        .addComponent(jTextFieldIdData)
                                        .addComponent(jComboBoxListaDeVeiculos, 0, 540, Short.MAX_VALUE)
                                        .addComponent(jTextFieldId)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(250, 250, 250)
                        .addComponent(jButtonVoltar)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxListaDeVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldIdData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldIdValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxListaDeServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
    try {
      Gastos registroDeGasto = null;
      int identificador = 0;
      String data = jTextFieldIdData.getText();
      float valor = Float.parseFloat(jTextFieldIdValor.getText());
      String aux = (String)jComboBoxListaDeVeiculos.getSelectedItem();
      //System.out.println(aux);
      String vetVeiculo[] = aux.split("-");
      //System.out.println(vetVeiculo[0]);
      int idVeiculoProprietario = Integer.parseInt(vetVeiculo[0]);
      aux = (String) jComboBoxListaDeServicos.getSelectedItem();
      String vetCategoria[] = aux.split("-");
      int idServico = Integer.parseInt(vetCategoria[0]);
      registroDeGasto = new Gastos(0,data,valor,idVeiculoProprietario,idServico);
      //System.out.println(registroDeGasto.toString());
      gastosBD.incluir(registroDeGasto);
      //Servicos objServico = new Servicos(identificador, descricao);
      //servicosBD.incluir(objServico);
      limparTela();
      mostrarGastosNaGrid();
    } catch (Exception erro) {
      JOptionPane.showMessageDialog(rootPane, "Incluir Visao: "+erro.getMessage());
    }
  }//GEN-LAST:event_jButtonIncluirActionPerformed

  private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
    // TODO add your handling code here:
    TelaPrincipal janelaPrincipal = new TelaPrincipal();
    janelaPrincipal.setVisible(true);
    dispose();

  }//GEN-LAST:event_jButtonVoltarActionPerformed

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
      java.util.logging.Logger.getLogger(TelaGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TelaGastos().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxListaDeServicos;
    private javax.swing.JComboBox<String> jComboBoxListaDeVeiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGastos;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIdData;
    private javax.swing.JTextField jTextFieldIdValor;
    // End of variables declaration//GEN-END:variables
}
