/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.locadora.entities;

/**
 *
 * @author fabri
 */
public class Usuario {
    
    int id;
    String login;
    String nome;
    String senha;
    boolean isAdm;

    public Usuario(String login, String nome, String senha, boolean isAdm) {
        this.login = login;
        this.nome = nome;
        this.senha = senha;
        this.isAdm = isAdm;
    }

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getIsAdm() {
        return isAdm;
    }

    public void setIsAdm(boolean isAdm) {
        this.isAdm = isAdm;
    }

    @Override
    public String toString() {
        return getNome();
    }
}