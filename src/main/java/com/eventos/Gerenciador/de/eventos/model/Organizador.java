package com.eventos.Gerenciador.de.eventos.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "organizador")
public class Organizador{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_organizador;

    @Column
    private String nome;

    @Column
    private String telefone;

    @Column
    private String email;

    @OneToMany(mappedBy = "organizador", cascade = CascadeType.ALL)
    private List<Evento> eventos = new ArrayList<>();

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId_organizador() {
        return id_organizador;
    }

    public void setId_organizador(Integer id_organizador) {
        this.id_organizador = id_organizador;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Organizador(Integer id_organizador, String nome, String email, String telefone) {
        this.id_organizador = id_organizador;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Organizador(){}
}
