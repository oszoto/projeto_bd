/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PedidoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class PedidoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PedidoDTO> pedidos = new ArrayList();
    
    public void addPedido(PedidoDTO objPedidoDTO){
        String sql = "INSERT INTO PEDIDO (cpf, cod_end, numero, dataPedido, gasto) VALUES (?,?,?,?,recuperaGasto(?))";
        conn = new ConexaoDAO().conectaBD();
           
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objPedidoDTO.getCpf());
            pstm.setString(2, objPedidoDTO.getCod_end());
            pstm.setString(3, objPedidoDTO.getNumero());
            pstm.setString(4, objPedidoDTO.getDataPedido());
            pstm.setString(5, objPedidoDTO.getCpf());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Pedido adicionado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PedidoDAO Create " + erro.getMessage());
        }
    }
    
    public ArrayList<PedidoDTO> selPedidos(){
        String sql = "SELECT cpf, dataPedido, gasto, cod_ped FROM PEDIDO";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                PedidoDTO pedido = new PedidoDTO();
                pedido.setCpf(rs.getString("cpf"));
                pedido.setDataPedido(rs.getString("dataPedido"));
                pedido.setGasto(rs.getString("gasto"));
                pedido.setCod_ped(rs.getString("cod_ped"));
                pedidos.add(pedido);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PedidoDAO Read " + erro.getMessage());
        }
        return pedidos;
    }
}
