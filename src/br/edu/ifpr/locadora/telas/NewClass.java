/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.telas;

import br.edu.ifpr.locadora.DAOs.FilmeDAO;
import br.edu.ifpr.locadora.entities.Filme;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author fabri
 */
public class NewClass {

    public static void main(String[] args) throws SQLException {
        
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 7);

        //c.getTimeInMillis()
        
        System.out.println(c);
    
        ArrayList<Filme> filmes = new ArrayList();
        FilmeDAO filminho = new FilmeDAO();
        filmes = filminho.selecionarFilme();
        Random random = new Random();  
        System.out.print(filmes.get(random.nextInt(filmes.size())));

    
    //Connections.;
    
    }

}
