/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FornecedorDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author gabri
 */
public class FornecedorDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FornecedorDTO> fornecedores = new ArrayList();
    
    public void addFornecedor(FornecedorDTO objFornecedorDTO){
        String sql = "INSERT INTO FORNECEDOR (cnpj, nome) VALUES (?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFornecedorDTO.getCnpj());
            pstm.setString(2, objFornecedorDTO.getNome());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Fornecedor adicionado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO Create " + erro.getMessage());
        }
    }
    
    public void attFornecedor(FornecedorDTO objFornecedorDTO) {
        String sql = "UPDATE FORNECEDOR SET nome = ? WHERE cnpj = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFornecedorDTO.getNome());
            pstm.setString(2, objFornecedorDTO.getCnpj());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Fornecedor atualizado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO Update " + erro.getMessage());
        }
    }
    
    public void delFornecedor(FornecedorDTO objFornecedorDTO) {
        String sql = "DELETE FROM FORNECEDOR WHERE cnpj = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFornecedorDTO.getCnpj());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Fornecedor deletado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO Delete " + erro.getMessage());
        }
    }
    
    public ArrayList<FornecedorDTO> selFornecedores() {
        String sql = "SELECT * FROM FORNECEDOR";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                FornecedorDTO fornecedor = new FornecedorDTO();
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedores.add(fornecedor);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO Read " + erro.getMessage());
        }
        return fornecedores;
    }
}
