/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import DAO.PedidoDAO;
import DTO.PedidoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class Pedido extends javax.swing.JFrame {

    /**
     * Creates new form Pedido
     */
    public Pedido() {
        initComponents();
        listarPedidos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPedidoNmrCartao = new javax.swing.JLabel();
        lblPedidoCodEnd = new javax.swing.JLabel();
        lblPedidoCPF = new javax.swing.JLabel();
        lblPedidoData = new javax.swing.JLabel();
        txtPedidoNmrCartao = new javax.swing.JTextField();
        txtPedidoCodEnd = new javax.swing.JTextField();
        txtPedidoCPF = new javax.swing.JTextField();
        txtPedidoData = new javax.swing.JTextField();
        btnPedidoAdd = new javax.swing.JButton();
        btnPedidoVoltar = new javax.swing.JButton();
        pnlPedido = new javax.swing.JPanel();
        scrPedido = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPedidoNmrCartao.setText("Número do cartão:");

        lblPedidoCodEnd.setText("Cod endereço:");

        lblPedidoCPF.setText("CPF:");

        lblPedidoData.setText("Data:");

        btnPedidoAdd.setText("Fazer Pedido");
        btnPedidoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoAddActionPerformed(evt);
            }
        });

        btnPedidoVoltar.setText("Voltar");
        btnPedidoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoVoltarActionPerformed(evt);
            }
        });

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Data", "Gasto", "Cod"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrPedido.setViewportView(tblPedido);

        javax.swing.GroupLayout pnlPedidoLayout = new javax.swing.GroupLayout(pnlPedido);
        pnlPedido.setLayout(pnlPedidoLayout);
        pnlPedidoLayout.setHorizontalGroup(
            pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlPedidoLayout.setVerticalGroup(
            pnlPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPedidoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPedidoCodEnd)
                        .addGap(18, 18, 18)
                        .addComponent(txtPedidoCodEnd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPedidoNmrCartao)
                        .addGap(18, 18, 18)
                        .addComponent(txtPedidoNmrCartao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPedidoCPF)
                        .addGap(18, 18, 18)
                        .addComponent(txtPedidoCPF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPedidoData)
                        .addGap(18, 18, 18)
                        .addComponent(txtPedidoData))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPedidoVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                        .addComponent(btnPedidoAdd)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoNmrCartao)
                    .addComponent(txtPedidoNmrCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoCodEnd)
                    .addComponent(txtPedidoCodEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoCPF)
                    .addComponent(txtPedidoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPedidoData)
                    .addComponent(txtPedidoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPedidoAdd)
                    .addComponent(btnPedidoVoltar))
                .addGap(18, 18, 18)
                .addComponent(pnlPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoVoltarActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPedidoVoltarActionPerformed

    private void btnPedidoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoAddActionPerformed
        PedidoDTO pedido = new PedidoDTO();
        pedido.setCpf(txtPedidoCPF.getText());
        pedido.setCod_end(txtPedidoCodEnd.getText());
        pedido.setNumero(txtPedidoNmrCartao.getText());
        pedido.setDataPedido(txtPedidoData.getText());
        new PedidoDAO().addPedido(pedido);
        listarPedidos();
    }//GEN-LAST:event_btnPedidoAddActionPerformed

    private void listarPedidos(){
        try{
            PedidoDAO pedidoDAO = new PedidoDAO();
            DefaultTableModel model = (DefaultTableModel) tblPedido.getModel();
            model.setNumRows(0);
            ArrayList<PedidoDTO> pedidos = pedidoDAO.selPedidos();
            for (int n = 0; n < pedidos.size(); n++){
                model.addRow(new Object[]{
                    pedidos.get(n).getCpf(),
                    pedidos.get(n).getDataPedido(),
                    pedidos.get(n).getGasto(),
                    pedidos.get(n).getCod_ped()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Pedidos " + erro.getMessage());
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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPedidoAdd;
    private javax.swing.JButton btnPedidoVoltar;
    private javax.swing.JLabel lblPedidoCPF;
    private javax.swing.JLabel lblPedidoCodEnd;
    private javax.swing.JLabel lblPedidoData;
    private javax.swing.JLabel lblPedidoNmrCartao;
    private javax.swing.JPanel pnlPedido;
    private javax.swing.JScrollPane scrPedido;
    private javax.swing.JTable tblPedido;
    private javax.swing.JTextField txtPedidoCPF;
    private javax.swing.JTextField txtPedidoCodEnd;
    private javax.swing.JTextField txtPedidoData;
    private javax.swing.JTextField txtPedidoNmrCartao;
    // End of variables declaration//GEN-END:variables
}
