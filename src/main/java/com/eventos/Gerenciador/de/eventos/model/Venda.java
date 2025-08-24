package com.eventos.Gerenciador.de.eventos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_venda;

    @ManyToOne
    @JoinColumn(name = "id_participante")
    private Participante participante;

    @ManyToOne
    @JoinColumn(name = "id_ingresso")
    private Ingresso ingresso;

    public Venda(Integer id_venda, Participante participante, Ingresso ingresso) {
        this.id_venda = id_venda;
        this.participante = participante;
        this.ingresso = ingresso;
    }

    public Venda() {
    }

    public Integer getId_venda() {
        return id_venda;
    }

    public void setId_venda(Integer id_venda) {
        this.id_venda = id_venda;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }
}
