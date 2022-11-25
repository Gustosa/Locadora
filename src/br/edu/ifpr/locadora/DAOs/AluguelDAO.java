/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.DAOs;

import br.edu.ifpr.locadora.entities.Aluguel;
import br.edu.ifpr.locadora.entities.Filme;
import br.edu.ifpr.locadora.entities.Usuario;
import br.edu.ifpr.locadora.factories.ConnectionFactory;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class AluguelDAO {
    public void alugar(Aluguel aluguel) throws SQLException{
        String sql = "INSERT INTO ALUGUEL (DATA_INICIO, DATA_FIM, USUARIO_LOGIN, FILME_ID, VALOR) VALUES ( ?, ?, ?, ?, ?)";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setDate(1, aluguel.getData_inicio());
        stmt.setDate(2, aluguel.getData_fim());
        stmt.setString(3, aluguel.getUsuario().getLogin());
        stmt.setInt(4, aluguel.getFilme().getId());
        stmt.setBigDecimal(5, aluguel.getFilme().getValor());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }
    
    public ArrayList<Aluguel> selecionarAluguel() throws SQLException{
        ArrayList<Aluguel> retorno = new ArrayList<>();
        String sql = "SELECT U.LOGIN, F.ID, A.ID, A.DATA_INICIO, A.DATA_FIM, A.USUARIO_LOGIN, A.FILME_ID, A.VALOR "
                + "FROM ALUGUEL AS A "
                + "INNER JOIN USUARIO AS U ON A.USUARIO_LOGIN = U.LOGIN "
                + "INNER JOIN FILME AS F ON A.FILME_ID = F.ID";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next() == true){
            Usuario u = new Usuario();
            Filme f = new Filme();
            Aluguel a = new Aluguel();
            
            u.setLogin(rs.getString("LOGIN"));
            f.setId((rs.getInt("ID")));
            a.setId(rs.getInt("ID"));
            a.setData_inicio(rs.getDate("DATA_INICIO"));
            a.setData_fim( rs.getDate("DATA_FIM"));
            a.setUsuario(u);
            a.setFilme(f);
            a.setValor(f.getValor());
            
            retorno.add(a);
        }
        
        return retorno;
    }

}

