package com.eventos.Gerenciador.de.eventos.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "participante")
public class Participante {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_participante;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String telefone;

    @OneToMany(mappedBy = "participante", cascade = CascadeType.ALL)
    private List<Venda> vendas = new ArrayList<>();

    public Participante(Integer id_participante, String nome, String telefone, String email, List<Venda> vendas) {
        this.id_participante = id_participante;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.vendas = vendas;
    }

    public Participante() {
    }

    public Integer getId_participante() {
        return id_participante;
    }

    public void setId_participante(Integer id_participante) {
        this.id_participante = id_participante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}
