/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.DAOs;

import br.edu.ifpr.locadora.entities.Usuario;
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
public class UsuarioDAO {
    public void cadastrarUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO USUARIO (LOGIN, NOME, SENHA, ISADM) VALUES (?, ?, ?, ?)";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, usuario.getLogin());
        stmt.setString(2, usuario.getNome());
        stmt.setString(3, usuario.getSenha());
        stmt.setBoolean(4, usuario.getAdm());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }
    
    public ArrayList<Usuario> selecionarUsuario() throws SQLException{
        ArrayList<Usuario> retorno = new ArrayList<>();
        String sql = "SELECT LOGIN, NOME, SENHA FROM USUARIO";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next() == true){
            Usuario u = new Usuario();
            u.setLogin(rs.getString("LOGIN"));
            u.setNome(rs.getString("NOME"));
            u.setSenha(rs.getString("SENHA"));
            
            retorno.add(u);
        }
        
        return retorno;
    }
    
    public void alterarUsuario(Usuario u) throws SQLException{
        String sql = "UPDATE USUARIO SET LOGIN = ?, NOME = ?, SENHA = ? WHERE LOGIN = ?";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, u.getLogin());
        stmt.setString(2, u.getNome());
        stmt.setString(3, u.getSenha());
        stmt.setString(4, u.getLogin());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }
    
    public void removerUsuario(Usuario u) throws SQLException{
        String sql = "DELETE FROM USUARIO WHERE LOGIN = ?";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setString(1, u.getLogin());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }
}


