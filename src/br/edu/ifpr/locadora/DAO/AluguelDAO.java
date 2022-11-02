/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.DAO;

import br.edu.ifpr.locadora.entities.Aluguel;
import br.edu.ifpr.locadora.entities.Filme;
import br.edu.ifpr.locadora.entities.Usuario;
import br.edu.ifpr.locadora.factories.ConnectionFactory;
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
        String sql = "INSERT INTO ALUGUEL (ID, DATA_INICIO, DATA_FIM, USUARIO_LOGIN, FILME_ID) VALUES (?, ?, ?, ?, ?)";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, aluguel.getId());
        stmt.setDate(2, aluguel.getData_inicio());
        stmt.setDate(3, aluguel.getData_fim());
        stmt.setString(4, aluguel.getUsuario().getLogin());
        stmt.setInt(5, aluguel.getFilme().getId());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }
    
    public ArrayList<Aluguel> selecionarAluguel() throws SQLException{
        ArrayList<Aluguel> retorno = new ArrayList<>();
        String sql = "SELECT U.LOGIN, F.ID, A.ID, A.DATA_INICIO, A.DATA_FIM, A.USUARIO_LOGIN, A.FILME_ID "
                + "FROM ALUGUEL AS A "
                + "INNER JOIN USUARIO AS U ON A.USUARIO_LOGIN = U.LOGIN "
                + "INNER JOIN FILME AS F ON A.FILME_ID = F.ID";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next() == true){
            Usuario u = new Usuario();
            Filme f = new Filme();
            Aluguel l = new Aluguel();
            
            u.setLogin(rs.getString("LOGIN"));
            f.setId((rs.getInt("ID")));
            l.setId(rs.getInt("ID"));
            l.setData_inicio(rs.getDate("DATA_INICIO"));
            l.setData_fim( rs.getDate("DATA_FIM"));
            l.setUsuario(u);
            l.setFilme(f);
            
            retorno.add(l);
        }
        
        return retorno;
    }

}

