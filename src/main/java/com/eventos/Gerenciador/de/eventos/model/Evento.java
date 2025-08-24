package com.eventos.Gerenciador.de.eventos.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_evento;

    @Column
    private String nome;

    @Column
    private String local_evento;

    @Column
    private LocalDate data_evento;

    @Column
    private String descricao;

    @Column
    private String tipo_evento;

    @ManyToOne
    @JoinColumn(name = "id_organizador")
    private Organizador organizador;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Ingresso> ingressos = new ArrayList<>();



    public Evento(){}

    public Evento(Integer id_evento, String nome, String local_evento, LocalDate data_evento, String descricao, String tipo_evento, Organizador organizador) {
        this.id_evento = id_evento;
        this.nome = nome;
        this.local_evento = local_evento;
        this.data_evento = data_evento;
        this.descricao = descricao;
        this.tipo_evento = tipo_evento;
        this.organizador = organizador;
    }

    public Integer getId_evento() {
        return id_evento;
    }

    public void setId_evento(Integer id_evento) {
        this.id_evento = id_evento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal_evento() {
        return local_evento;
    }

    public void setLocal_evento(String local_evento) {
        this.local_evento = local_evento;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }
}
