/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DTO.ClienteDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class ClienteDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> clientes = new ArrayList();
    
    public void addCliente(ClienteDTO objClienteDTO) {
        String sql = "INSERT INTO CLIENTE (cpf, nome, dataNasc) VALUES (?,?,?)";
        conn = new ConexaoDAO().conectaBD();
           
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getCpf());
            pstm.setString(2, objClienteDTO.getNome());
            pstm.setString(3, objClienteDTO.getDataNasc());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Create " + erro.getMessage());
        }
    }
    
    public void attCliente(ClienteDTO objClienteDTO) {
        String sql = "UPDATE CLIENTE SET nome = ?, dataNasc = ? WHERE cpf = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome());
            pstm.setString(2, objClienteDTO.getDataNasc());
            pstm.setString(3, objClienteDTO.getCpf());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Update " + erro.getMessage());
        }
    }
    
    public void delCliente(ClienteDTO objClienteDTO) {
        String sql = "DELETE FROM CLIENTE WHERE cpf = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getCpf());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Delete " + erro.getMessage());
        }
    }
    
    public ArrayList<ClienteDTO> selClientes() {
        String sql = "SELECT cpf, nome, dataNasc, sacola FROM CLIENTE";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ClienteDTO cliente = new ClienteDTO();
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setDataNasc(rs.getString("dataNasc"));
                cliente.setSacola(rs.getString("sacola"));
                clientes.add(cliente);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Read " + erro.getMessage());
        }
        return clientes;
    }
}
