package com.recosoft.geradorloteria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Aposta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
