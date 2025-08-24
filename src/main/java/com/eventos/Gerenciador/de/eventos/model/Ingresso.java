package com.eventos.Gerenciador.de.eventos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Ingresso {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ingresso;

    @NotNull(message = "o valor não pode ser nulo")
    @DecimalMin(value = "0.01", message = "o valor deve ser maior que 0")
    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal valor;

    @NotNull(message = "o evento é obrigatório")
    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;

    @OneToMany(mappedBy = "ingresso", cascade = CascadeType.ALL)
    private List<Venda> vendas = new ArrayList<>();

    public Ingresso(Integer id_ingresso, BigDecimal valor, List<Venda> vendas, Evento evento) {
        this.id_ingresso = id_ingresso;
        this.valor = valor;
        this.vendas = vendas;
        this.evento = evento;
    }

    public Ingresso() {}

    public Integer getId_ingresso() {
        return id_ingresso;
    }

    public void setId_ingresso(Integer id_ingresso) {
        this.id_ingresso = id_ingresso;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}
