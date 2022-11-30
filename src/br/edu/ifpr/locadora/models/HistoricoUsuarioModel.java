/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.models;

import br.edu.ifpr.locadora.DAOs.AluguelDAO;
import br.edu.ifpr.locadora.entities.Aluguel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fabri
 */
public class HistoricoUsuarioModel extends AbstractTableModel{
    
    String colunas[] = {"Filme", "Valor", "Data Inicial", "Data Final"};
    AluguelDAO dao = new AluguelDAO();
    ArrayList<Aluguel> aluguel; 
    
    public HistoricoUsuarioModel() throws SQLException{
       aluguel = dao.selecionarAluguel();
    }

    @Override
    public int getRowCount() {
        return aluguel.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        if(coluna == 0){
            return aluguel.get(linha).getFilme().getNome();
        }
        else if(coluna == 1){
            return aluguel.get(linha).getValor();
        }
        else if(coluna == 2){
            return aluguel.get(linha).getData_inicio();
        }
        else if(coluna == 3){
            return aluguel.get(linha).getData_fim();
        }
        else{
            return null;
        }
    }
    
    @Override
    public String getColumnName(int index){
        return colunas[index];
    }
}

