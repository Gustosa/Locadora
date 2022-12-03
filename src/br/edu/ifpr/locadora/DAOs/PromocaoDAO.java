package br.edu.ifpr.locadora.DAOs;

import br.edu.ifpr.locadora.entities.Filme;
import br.edu.ifpr.locadora.entities.Promocao;
import br.edu.ifpr.locadora.factories.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

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
        String sql = "INSERT INTO PROMOCAO (FILME_ID, DESCONTO, DATA_INICIO, DATA_FIM) VALUES (?, ?, ?, ?)";
        
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
    
    public Promocao selecionarPromocao() throws SQLException{
        Promocao promocao = new Promocao();
        String sql = "SELECT F.ID AS FILME_ID, F.NOME, F.VALOR, P.ID, P.DESCONTO "
                + "FROM PROMOCAO AS P "
                + "INNER JOIN FILME AS F ON P.FILME_ID = F.ID "
                + "WHERE CURRENT DATE >= DATA_INICIO AND CURRENT DATE <= DATA_FIM";
        
        Connection con = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = con.prepareStatement(sql);
                
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next() == true){
            Filme f = new Filme();
            Promocao p = new Promocao();
            
            f.setId(rs.getInt("FILME_ID"));
            f.setNome(rs.getString("NOME"));
            f.setValor(rs.getBigDecimal("VALOR"));
            p.setId(rs.getInt("ID"));
            p.setFilme(f);
            p.setDesconto(rs.getInt("DESCONTO"));
            
            promocao = p;
        }
        
        return promocao;
    }
}
