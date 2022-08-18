package com.recosoft.geradorloteria.dto;

import com.recosoft.geradorloteria.model.Aposta;

import java.util.List;

public class JogadorCreateDto {

    private String nome;
    private String username;
    private String password;
    private List<Aposta> apostas = null;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Aposta> getApostas() {
        return apostas;
    }

    public void setApostas(List<Aposta> apostas) {
        this.apostas = apostas;
    }
}
