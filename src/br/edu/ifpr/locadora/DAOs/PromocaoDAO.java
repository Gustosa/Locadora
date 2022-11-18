package br.edu.ifpr.locadora.DAOs;

import br.edu.ifpr.locadora.entities.Promocao;
import br.edu.ifpr.locadora.factories.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabri
 */
public class PromocaoDAO {
    public void promocao(Promocao promocao) throws SQLException{
        String sql = "INSERT INTO FILME (FILME_ID, DESCONTO, DATA_INICIO, DATA_FIM) VALUES (?, ?, ?, ?)";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, promocao.getFilme().getId());
        stmt.setInt(2, promocao.getDesconto());
        stmt.setDate(3, promocao.getData_inicio());
        stmt.setDate(4, promocao.getData_fim());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }
}
