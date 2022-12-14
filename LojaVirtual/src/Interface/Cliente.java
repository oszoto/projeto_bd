/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class Cliente extends javax.swing.JFrame {
    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
        listarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtClienteCPF = new javax.swing.JTextField();
        txtClienteNome = new javax.swing.JTextField();
        txtClienteDataNasc = new javax.swing.JTextField();
        lblClienteCPF = new javax.swing.JLabel();
        lblClienteNome = new javax.swing.JLabel();
        lblClienteDataNasc = new javax.swing.JLabel();
        btnClienteAdd = new javax.swing.JButton();
        btnClienteAtt = new javax.swing.JToggleButton();
        btnClienteDel = new javax.swing.JToggleButton();
        pnlCliente = new javax.swing.JPanel();
        scrCliente = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnVoltarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtClienteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCPFActionPerformed(evt);
            }
        });

        lblClienteCPF.setText("CPF:");

        lblClienteNome.setText("Nome:");

        lblClienteDataNasc.setText("Data de nascimento:");

        btnClienteAdd.setText("Adicionar");
        btnClienteAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAddActionPerformed(evt);
            }
        });

        btnClienteAtt.setText("Atualizar");
        btnClienteAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAttActionPerformed(evt);
            }
        });

        btnClienteDel.setText("Deletar");
        btnClienteDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteDelActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "DataNasc", "Sacola"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrCliente.setViewportView(tblCliente);

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrCliente)
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        btnVoltarCliente.setText("Voltar");
        btnVoltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtClienteNome, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtClienteCPF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClienteDataNasc)
                        .addGap(18, 18, 18)
                        .addComponent(txtClienteDataNasc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClienteDel)
                        .addGap(18, 18, 18)
                        .addComponent(btnClienteAtt)
                        .addGap(18, 18, 18)
                        .addComponent(btnClienteAdd))
                    .addComponent(pnlCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteCPF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteNome)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteDataNasc)
                    .addComponent(txtClienteDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClienteAdd)
                    .addComponent(btnClienteAtt)
                    .addComponent(btnClienteDel)
                    .addComponent(btnVoltarCliente))
                .addGap(18, 18, 18)
                .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteCPFActionPerformed

    private void btnClienteAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAddActionPerformed
        ClienteDTO cliente = new ClienteDTO();
        cliente.setCpf(txtClienteCPF.getText());
        cliente.setNome(txtClienteNome.getText());
        cliente.setDataNasc(txtClienteDataNasc.getText());
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.addCliente(cliente);
        listarClientes();
    }//GEN-LAST:event_btnClienteAddActionPerformed

    private void btnClienteDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteDelActionPerformed
        ClienteDTO cliente = new ClienteDTO();
        cliente.setCpf(txtClienteCPF.getText());
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.delCliente(cliente);
        listarClientes();
    }//GEN-LAST:event_btnClienteDelActionPerformed

    private void btnClienteAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAttActionPerformed
        ClienteDTO cliente = new ClienteDTO();
        cliente.setCpf(txtClienteCPF.getText());
        cliente.setNome(txtClienteNome.getText());
        cliente.setDataNasc(txtClienteDataNasc.getText());
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.attCliente(cliente);
        listarClientes();
    }//GEN-LAST:event_btnClienteAttActionPerformed

    private void btnVoltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarClienteActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarClienteActionPerformed

    private void listarClientes(){
        try{
            ClienteDAO clienteDAO = new ClienteDAO();
            DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
            model.setNumRows(0);
            ArrayList<ClienteDTO> clientes = clienteDAO.selClientes();
            for (int n = 0; n < clientes.size(); n++){
                model.addRow(new Object[]{
                    clientes.get(n).getCpf(),
                    clientes.get(n).getNome(),
                    clientes.get(n).getDataNasc(),
                    clientes.get(n).getSacola()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Clientes " + erro.getMessage());
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClienteAdd;
    private javax.swing.JToggleButton btnClienteAtt;
    private javax.swing.JToggleButton btnClienteDel;
    private javax.swing.JButton btnVoltarCliente;
    private javax.swing.JLabel lblClienteCPF;
    private javax.swing.JLabel lblClienteDataNasc;
    private javax.swing.JLabel lblClienteNome;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JScrollPane scrCliente;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteDataNasc;
    private javax.swing.JTextField txtClienteNome;
    // End of variables declaration//GEN-END:variables
}
