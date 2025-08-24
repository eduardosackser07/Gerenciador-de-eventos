package com.eventos.Gerenciador.de.eventos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

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
    @NotBlank(message = "nome é obrigatório")
    @Size(max = 45, message = "o nome pode ter até 45 caracteres")
    private String nome;

    @Column
    @NotBlank(message = "o email é obrigatório")
    @Size(max = 45, message = "o email pode ter até 45 caracteres")
    @Email(message = "o email nao é válido")
    private String email;

    @Column
    @NotBlank(message = "o telefone é obrigatório")
    @Size(max = 20, message = "o telefone pode ter até 20 caracteres")
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
