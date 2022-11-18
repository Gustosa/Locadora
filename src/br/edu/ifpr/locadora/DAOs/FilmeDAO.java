/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.DAOs;

import br.edu.ifpr.locadora.entities.Filme;
import br.edu.ifpr.locadora.factories.ConnectionFactory;
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
        String sql = "INSERT INTO FILME (NOME, GENERO, DATA_LANCAMENTO, AVALIACAO) VALUES (?, ?, ?, ?)";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, filme.getNome());
        stmt.setString(2, filme.getGenero());
        stmt.setDate(3, filme.getData_lancamento());
        stmt.setInt(4, filme.getAvaliacao());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }
    
     public ArrayList<Filme> selecionarFilme() throws SQLException{
        ArrayList<Filme> retorno = new ArrayList<>();
        String sql = "SELECT ID, NOME, DATA_LANCAMENTO, GENERO, AVALIACAO FROM FILME";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next() == true){
            Filme f = new Filme();
            f.setId(rs.getInt("ID"));
            f.setNome(rs.getString("NOME"));
            f.setData_lancamento(rs.getDate("DATA_LANCAMENTO"));
            f.setGenero(rs.getString("GENERO"));
            f.setAvaliacao(rs.getInt("AVALIACAO"));

            
            retorno.add(f);
        }
        
        return retorno;
    }
     
     public void alterarFilme(Filme filme) throws SQLException{
        String sql = "UPDATE FILME SET NOME = ?, DATA_LANCAMENTO = ?, GENERO = ?, AVALIACAO = ? WHERE ID = ?";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, filme.getNome());
        stmt.setDate(2, filme.getData_lancamento());
        stmt.setString(3, filme.getGenero());
        stmt.setInt(4, filme.getAvaliacao());
        stmt.setInt(5, filme.getId());
        
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
