package com.recosoft.geradorloteria.dto;

public class LoteriaCreateDto {

    private String nome;
    private int qtdNumeros;
    private int menorNumero;
    private int maiorNumero;

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
