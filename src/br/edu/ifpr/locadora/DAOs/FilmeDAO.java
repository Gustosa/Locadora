/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.DAOs;

import br.edu.ifpr.locadora.entities.Filme;
import br.edu.ifpr.locadora.factories.ConnectionFactory;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author fabri
 */
public class FilmeDAO {
    public void cadastrarFilme(Filme filme) throws SQLException{
        String sql = "INSERT INTO FILME (NOME, GENERO, DATA_LANCAMENTO, AVALIACAO, VALOR) VALUES (?, ?, ?, ?, ?)";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, filme.getNome());
        stmt.setString(2, filme.getGenero());
        stmt.setInt(3, filme.getData_lancamento());
        stmt.setInt(4, filme.getAvaliacao());
        stmt.setBigDecimal(5, filme.getValor());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }
    
     public ArrayList<Filme> selecionarFilme() throws SQLException{
        ArrayList<Filme> retorno = new ArrayList<>();
        String sql = "SELECT ID, NOME, DATA_LANCAMENTO, GENERO, AVALIACAO, VALOR FROM FILME";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next() == true){
            Filme f = new Filme();
            f.setId(rs.getInt("ID"));
            f.setNome(rs.getString("NOME"));
            f.setData_lancamento(rs.getInt("DATA_LANCAMENTO"));
            f.setGenero(rs.getString("GENERO"));
            f.setAvaliacao(rs.getInt("AVALIACAO"));
            f.setValor(rs.getBigDecimal("VALOR"));
            
            retorno.add(f);
        }
        
        return retorno;
    }
     
     public void alterarFilme(Filme filme) throws SQLException{
        String sql = "UPDATE FILME SET NOME = ?, DATA_LANCAMENTO = ?, GENERO = ?, AVALIACAO = ?, VALOR = ? WHERE ID = ?";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, filme.getNome());
        stmt.setInt(2, filme.getData_lancamento());
        stmt.setString(3, filme.getGenero());
        stmt.setInt(4, filme.getAvaliacao());
        stmt.setBigDecimal(5, filme.getValor());
        stmt.setInt(6, filme.getId());

        stmt.execute();
        
        stmt.close();
        con.close();
    }
     
    public void removerFilme(Filme filme) throws SQLException{
        String sql = "DELETE FROM FILME WHERE ID = ?";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, filme.getId());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }
}
