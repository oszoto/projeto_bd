/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import DAO.FornecedorDAO;
import DTO.FornecedorDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class Fornecedor extends javax.swing.JFrame {

    /**
     * Creates new form Fornecedor
     */
    public Fornecedor() {
        initComponents();
        listarFornecedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFornecedorCnpj = new javax.swing.JLabel();
        lblFornecedorNome = new javax.swing.JLabel();
        txtFornecedorCnpj = new javax.swing.JTextField();
        txtFornecedorNome = new javax.swing.JTextField();
        btnFornecedorAdd = new javax.swing.JToggleButton();
        btnFornecedorAtt = new javax.swing.JToggleButton();
        btnFornecedorDel = new javax.swing.JToggleButton();
        pnlFornecedor = new javax.swing.JPanel();
        scrFornecedor = new javax.swing.JScrollPane();
        tblFornecedor = new javax.swing.JTable();
        btnVoltarFornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFornecedorCnpj.setText("Cnpj:");

        lblFornecedorNome.setText("Nome:");

        btnFornecedorAdd.setText("Adicionar");
        btnFornecedorAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorAddActionPerformed(evt);
            }
        });

        btnFornecedorAtt.setText("Atualizar");
        btnFornecedorAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorAttActionPerformed(evt);
            }
        });

        btnFornecedorDel.setText("Deletar");
        btnFornecedorDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorDelActionPerformed(evt);
            }
        });

        tblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cnpj", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrFornecedor.setViewportView(tblFornecedor);

        javax.swing.GroupLayout pnlFornecedorLayout = new javax.swing.GroupLayout(pnlFornecedor);
        pnlFornecedor.setLayout(pnlFornecedorLayout);
        pnlFornecedorLayout.setHorizontalGroup(
            pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlFornecedorLayout.setVerticalGroup(
            pnlFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnVoltarFornecedor.setText("Voltar");
        btnVoltarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFornecedorCnpj)
                        .addGap(18, 18, 18)
                        .addComponent(txtFornecedorCnpj))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFornecedorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFornecedorNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltarFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btnFornecedorDel)
                        .addGap(18, 18, 18)
                        .addComponent(btnFornecedorAtt)
                        .addGap(18, 18, 18)
                        .addComponent(btnFornecedorAdd)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedorCnpj)
                    .addComponent(txtFornecedorCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedorNome)
                    .addComponent(txtFornecedorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFornecedorAdd)
                    .addComponent(btnFornecedorAtt)
                    .addComponent(btnFornecedorDel)
                    .addComponent(btnVoltarFornecedor))
                .addGap(18, 18, 18)
                .addComponent(pnlFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFornecedorAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorAddActionPerformed
        FornecedorDTO fornecedor = new FornecedorDTO();
        fornecedor.setCnpj(txtFornecedorCnpj.getText());
        fornecedor.setNome(txtFornecedorNome.getText());
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.addFornecedor(fornecedor);
        listarFornecedores();
    }//GEN-LAST:event_btnFornecedorAddActionPerformed

    private void btnFornecedorAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorAttActionPerformed
        FornecedorDTO fornecedor = new FornecedorDTO();
        fornecedor.setCnpj(txtFornecedorCnpj.getText());
        fornecedor.setNome(txtFornecedorNome.getText());
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.attFornecedor(fornecedor);
        listarFornecedores();
    }//GEN-LAST:event_btnFornecedorAttActionPerformed

    private void btnFornecedorDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorDelActionPerformed
        FornecedorDTO fornecedor = new FornecedorDTO();
        fornecedor.setCnpj(txtFornecedorCnpj.getText());
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.delFornecedor(fornecedor);
        listarFornecedores();
    }//GEN-LAST:event_btnFornecedorDelActionPerformed

    private void btnVoltarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarFornecedorActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarFornecedorActionPerformed

    private void listarFornecedores(){
        try{
            FornecedorDAO fornecedorDAO = new FornecedorDAO();
            DefaultTableModel model = (DefaultTableModel) tblFornecedor.getModel();
            model.setNumRows(0);
            ArrayList<FornecedorDTO> fornecedores = fornecedorDAO.selFornecedores();
            for (int n = 0; n < fornecedores.size(); n++){
                model.addRow(new Object[]{
                    fornecedores.get(n).getCnpj(),
                    fornecedores.get(n).getNome(),
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Fornecedores " + erro.getMessage());
        }
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
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnFornecedorAdd;
    private javax.swing.JToggleButton btnFornecedorAtt;
    private javax.swing.JToggleButton btnFornecedorDel;
    private javax.swing.JButton btnVoltarFornecedor;
    private javax.swing.JLabel lblFornecedorCnpj;
    private javax.swing.JLabel lblFornecedorNome;
    private javax.swing.JPanel pnlFornecedor;
    private javax.swing.JScrollPane scrFornecedor;
    private javax.swing.JTable tblFornecedor;
    private javax.swing.JTextField txtFornecedorCnpj;
    private javax.swing.JTextField txtFornecedorNome;
    // End of variables declaration//GEN-END:variables
}