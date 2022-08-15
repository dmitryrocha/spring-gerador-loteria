package com.recosoft.geradorloteria.model;

import java.time.LocalDateTime;
import java.util.List;

public class Aposta {

    private long id;
    private Loteria loteria;
    List<Integer> numerosApostados;
    LocalDateTime dataDaAposta;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Loteria getLoteria() {
        return loteria;
    }

    public void setLoteria(Loteria loteria) {
        this.loteria = loteria;
    }

    public List<Integer> getNumerosApostados() {
        return numerosApostados;
    }

    public void setNumerosApostados(List<Integer> numerosApostados) {
        this.numerosApostados = numerosApostados;
    }

    public LocalDateTime getDataDaAposta() {
        return dataDaAposta;
    }

    public void setDataDaAposta(LocalDateTime dataDaAposta) {
        this.dataDaAposta = dataDaAposta;
    }
}
