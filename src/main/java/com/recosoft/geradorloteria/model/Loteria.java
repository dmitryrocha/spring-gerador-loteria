package com.recosoft.geradorloteria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loteria {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int qtdNumeros;
    private int menorNumero;
    private int maiorNumero;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdNumeros() {
        return qtdNumeros;
    }

    public void setQtdNumeros(int qtdNumeros) {
        this.qtdNumeros = qtdNumeros;
    }

    public int getMenorNumero() {
        return menorNumero;
    }

    public void setMenorNumero(int menorNumero) {
        this.menorNumero = menorNumero;
    }

    public int getMaiorNumero() {
        return maiorNumero;
    }

    public void setMaiorNumero(int maiorNumero) {
        this.maiorNumero = maiorNumero;
    }
}
