/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class ProdutoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProdutoDTO> produtos = new ArrayList();
    
    public void addProduto(ProdutoDTO objProdutoDTO) {
        String sql = "INSERT INTO PRODUTO (nome, preco, cod_categ) VALUES (?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getNome());
            pstm.setString(2, objProdutoDTO.getPreco());
            pstm.setString(3, objProdutoDTO.getCod_categ());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Create" + erro.getMessage());
        }
    }
    
    public void attProduto(ProdutoDTO objProdutoDTO) {
        String sql = "UPDATE PRODUTO SET nome = ?, preco = ?, cod_categ = ? WHERE cod_prod = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getNome());
            pstm.setString(2, objProdutoDTO.getPreco());
            pstm.setString(3, objProdutoDTO.getCod_categ());
            pstm.setString(4, objProdutoDTO.getCod_prod());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Update " + erro.getMessage());
        }
    }
    
    public void delProduto(ProdutoDTO objProdutoDTO) {
        String sql = "DELETE FROM PRODUTO WHERE cod_prod = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getCod_prod());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Delete " + erro.getMessage());
        }
    }
    
    public ArrayList<ProdutoDTO> selProdutos() {
        String sql = "SELECT cod_prod, nome, preco, estoque, categ FROM PRODUTO, CATEGORIA WHERE PRODUTO.cod_categ = CATEGORIA.cod_categ";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ProdutoDTO produto = new ProdutoDTO();
                produto.setCod_prod(rs.getString("cod_prod"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getString("preco"));
                produto.setEstoque(rs.getString("estoque"));
                produto.setCateg(rs.getString("categ"));
                produtos.add(produto);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Read " + erro.getMessage());
        }
        return produtos;
    }
}
