package com.eventos.Gerenciador.de.eventos.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

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

    public Organizador() {

    }

    @Override
    public String toString() {
        return "Organizador{" +
                "id_organizador=" + id_organizador +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId_organizador() {
        return id_organizador;
    }

    public void setId_organizador(Integer id_organizador) {
        this.id_organizador = id_organizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
