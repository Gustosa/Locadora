/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.entities;

import java.math.BigDecimal;


/**
 *
 * @author fabri
 */
public class Filme {
    
    int id;
    String nome;
    long data;
    String genero;
    int avaliacao;
    BigDecimal preco;

    public Filme(String nome, String genero, BigDecimal preco, long data, int avaliacoes) {
    }

    public Filme() {
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getData_lancamento() {
        return data;
    }

    public void setData_lancamento(long data_lancamento) {
        this.data = data_lancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void getDate() {    
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
     public BigDecimal getPreco() {
         return preco;
    }
}