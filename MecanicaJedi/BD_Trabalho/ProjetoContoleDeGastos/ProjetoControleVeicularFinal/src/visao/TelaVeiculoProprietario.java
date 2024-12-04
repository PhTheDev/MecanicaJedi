/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import javax.swing.JOptionPane;
import modelos.VeiculoProprietario;
import ferramentas.ConexaoBD;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import persistencia.IVeiculoProprietarioCRUD;
import modelos.Servicos;
import persistencia.ServicosDAO;
import persistencia.VeiculosProprietariosDAO;

/**
 *
 * @author ejmcc
 */
public class TelaVeiculoProprietario extends javax.swing.JFrame {
  private IVeiculoProprietarioCRUD veiculoProprietarioBD = null;
  /**
   * Creates new form TelaVeiculoProprietario
   */
  public TelaVeiculoProprietario() {
    initComponents();
    setLocationRelativeTo(null);
    try {
      veiculoProprietarioBD = new VeiculosProprietariosDAO();
      mostrarVeiculosProprietariosNaGrid();
    } catch (Exception erro) {
      JOptionPane.showMessageDialog(null, "Construtor Tela: "+erro.getMessage());
    }
  }
  private void limparTela(){
    jTextFieldId.setText("");
    jTextFieldMarca.setText("");
    jTextFieldModelo.setText("");
    jTextFieldPlaca.setText("");
    jTextFieldCPF.setText("");
    jTextFieldProprietario.setText("");
  }
  private void mostrarVeiculosProprietariosNaGrid(){
  try {
    ArrayList<VeiculoProprietario> listaDeVeiculosProprietarios = null;
    listaDeVeiculosProprietarios = veiculoProprietarioBD.obterListaDeVeiculoProprietarios();
    DefaultTableModel model =  (DefaultTableModel) jTableVeiculoProprietario.getModel();
    model.setNumRows(0); 
    if(listaDeVeiculosProprietarios.isEmpty()) 
      throw new Exception("Lista de Servicos BD Vazia");
    for(int pos = 0; pos < listaDeVeiculosProprietarios.size(); pos++){
      VeiculoProprietario objVeiculoProprietario = listaDeVeiculosProprietarios.get(pos);
      String[] linha = new String[6];
      linha[0] = objVeiculoProprietario.getIdProprietario() + "";
      linha[1] = objVeiculoProprietario.getPlaca();
      linha[2] = objVeiculoProprietario.getMarca();
      linha[3] = objVeiculoProprietario.getModelo();
      linha[4] = objVeiculoProprietario.getNomeProprietario();
      linha[5] = objVeiculoProprietario.getCpf();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldPlaca = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldProprietario = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVeiculoProprietario = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setText("CADASTRO VEÍCULO/PROPRIETÁRIO");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel2.setText("IDENTIFICADOR");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel3.setText("PLACA");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel4.setText("MARCA");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel5.setText("MODELO");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel6.setText("NOME DO PROPRIETARIO");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel7.setText("CPF");

        jTextFieldId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        jTextFieldPlaca.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        jTextFieldMarca.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        jTextFieldModelo.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        jTextFieldProprietario.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        jTextFieldCPF.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        jButtonIncluir.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButtonIncluir.setText("INCLUIR");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButtonAlterar.setText("ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jTableVeiculoProprietario.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jTableVeiculoProprietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PLACA", "MARCA", "MODELO", "PROPRIETARIO", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVeiculoProprietario);
        if (jTableVeiculoProprietario.getColumnModel().getColumnCount() > 0) {
            jTableVeiculoProprietario.getColumnModel().getColumn(0).setResizable(false);
            jTableVeiculoProprietario.getColumnModel().getColumn(1).setResizable(false);
            jTableVeiculoProprietario.getColumnModel().getColumn(2).setResizable(false);
            jTableVeiculoProprietario.getColumnModel().getColumn(3).setResizable(false);
            jTableVeiculoProprietario.getColumnModel().getColumn(4).setResizable(false);
            jTableVeiculoProprietario.getColumnModel().getColumn(5).setResizable(false);
        }

        jButtonVoltar.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(204, 0, 0));
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonIncluir)
                            .addGap(30, 30, 30)
                            .addComponent(jButtonAlterar)
                            .addGap(346, 346, 346)
                            .addComponent(jButtonVoltar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldModelo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addGap(48, 48, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIncluir)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        TelaPrincipal janelaPrincipal = new TelaPrincipal();
        janelaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            int identificador = Integer.parseInt(jTextFieldId.getText());
            String placa = jTextFieldPlaca.getText();
            String marca = jTextFieldMarca.getText();
            String modelo = jTextFieldModelo.getText();
            String nomeProprietario = jTextFieldProprietario.getText();
            String cpf = jTextFieldCPF.getText();
            VeiculoProprietario objVeiculoProprietario = null;
            objVeiculoProprietario = new VeiculoProprietario(identificador,placa,marca,modelo,
                nomeProprietario,cpf);
            veiculoProprietarioBD.alterar(objVeiculoProprietario);
            limparTela();
            mostrarVeiculosProprietariosNaGrid();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, "Incluir Visao: "+erro.getMessage());
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
        try {
            int identificador = 0;
            String placa = jTextFieldPlaca.getText();
            String marca = jTextFieldMarca.getText();
            String modelo = jTextFieldModelo.getText();
            String nomeProprietario = jTextFieldProprietario.getText();
            String cpf = jTextFieldCPF.getText();
            VeiculoProprietario objVeiculoProprietario = null;
            objVeiculoProprietario = new VeiculoProprietario(identificador,placa,marca,modelo,
                nomeProprietario,cpf);
            veiculoProprietarioBD.incluir(objVeiculoProprietario);
            limparTela();
            mostrarVeiculosProprietariosNaGrid();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, "Incluir Visao: "+erro.getMessage());
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

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
      java.util.logging.Logger.getLogger(TelaVeiculoProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaVeiculoProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaVeiculoProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaVeiculoProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TelaVeiculoProprietario().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableVeiculoProprietario;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldProprietario;
    // End of variables declaration//GEN-END:variables
}
