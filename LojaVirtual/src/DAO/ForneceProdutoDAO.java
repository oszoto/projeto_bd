/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ForneceProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class ForneceProdutoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ForneceProdutoDTO> abastecimentos = new ArrayList();
    
    public void abasteceProduto(ForneceProdutoDTO objForneceProdutoDTO) {
        String sql = "INSERT INTO FORNECEDOR_PRODUTO (cnpj, cod_prod, dataHora, qtd) VALUES (?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
           
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objForneceProdutoDTO.getCnpj());
            pstm.setString(2, objForneceProdutoDTO.getCod_prod());
            pstm.setString(3, objForneceProdutoDTO.getDataHora());
            pstm.setString(4, objForneceProdutoDTO.getQtd());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Abastecimento realizado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ForneceProdutoDAO Create " + erro.getMessage());
        }
    }
    
    public ArrayList<ForneceProdutoDTO> histAbastecimento() {
        String sql = "SELECT * FROM FORNECEDOR_PRODUTO";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ForneceProdutoDTO abastecimento = new ForneceProdutoDTO();
                abastecimento.setCnpj(rs.getString("cnpj"));
                abastecimento.setCod_prod(rs.getString("cod_prod"));
                abastecimento.setDataHora(rs.getString("dataHora"));
                abastecimento.setQtd(rs.getString("qtd"));
                abastecimentos.add(abastecimento);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ForneceProdutoDAO Read " + erro.getMessage());
        }
        return abastecimentos;
    }
}
