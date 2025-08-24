package com.eventos.Gerenciador.de.eventos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

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
    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 1, max = 40, message = "o nome deve ter entre 1 e 40 caracteres")
    private String nome;

    @Column
    @NotBlank(message = "telefone é obrigatório")
    @Size(max = 20, message = "telefone tem no maximo 20 digitos seloko q telefone eh esse meu patrao")
    private String telefone;

    @Column
    @NotBlank(message = "email é obrigatório meu chapa")
    @Email(message = "o email é inválido")
    private String email;

    @NotBlank(message = "Senha é obrigatória")
    @Size(min = 4, max = 100, message = "A senha deve ter entre 4 e 100 caracteres")
    @Column(nullable = false)
    private String senha;

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }


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
