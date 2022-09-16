/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.AlteraSacolaDTO;
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
public class AlteraSacolaDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<AlteraSacolaDTO> operacoes = new ArrayList();
    
    public void addOp(AlteraSacolaDTO objAlteraSacolaDTO){
        String sql = "INSERT INTO ALTERASACOLA (cpf, cod_prod, op, qtd) VALUES (?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAlteraSacolaDTO.getCpf());
            pstm.setString(2, objAlteraSacolaDTO.getCod_prod());
            pstm.setString(3, objAlteraSacolaDTO.getOp());
            pstm.setString(4, objAlteraSacolaDTO.getQtd());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Operação adicionada com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlteraSacolaDAO Create " + erro.getMessage());
        }
    }
    
    public ArrayList<AlteraSacolaDTO> selOps() {
        String sql = "SELECT * FROM ALTERASACOLA";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                AlteraSacolaDTO op = new AlteraSacolaDTO();
                op.setCpf(rs.getString("cpf"));
                op.setCod_prod(rs.getString("cod_prod"));
                op.setCod_op(rs.getString("cod_op"));
                op.setOp(rs.getString("op"));
                op.setQtd(rs.getString("qtd"));
                operacoes.add(op);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlteraSacolaDAO Read " + erro.getMessage());
        }
        return operacoes;
    }
}
