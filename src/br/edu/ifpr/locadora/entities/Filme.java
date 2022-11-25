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
    int data;
    String genero;
    int avaliacao;
    BigDecimal valor;

    public Filme(String nome, int data, String genero, int avaliacao, BigDecimal valor) {
        this.nome = nome;
        this.data = data;
        this.genero = genero;
        this.avaliacao = avaliacao;
        this.valor = valor;
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

    public int getData_lancamento() {
        return data;
    }

    public void setData_lancamento(int data_lancamento) {
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

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
     public BigDecimal getValor() {
         return valor;
    }
     
 @Override
    public String toString() {
        return getNome();
    }
}