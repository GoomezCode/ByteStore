package org.web.bytestore.models;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Objects;

@Entity
@Table(name = "user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",  nullable = false)
    private Long id;

    @Column(name = "nome", length = 100,  nullable = false)
    private String nome;
    @Column(name = "nascimento", columnDefinition = "DATE",  nullable = false)
    private String nascimento;
    @Column(name = "email", length = 150,  nullable = false)
    private String email;
    @Column(name = "senha", length = 50,  nullable = false)
    private String senha;
    @Column(name = "cep", length = 60,  nullable = false)
    private String cep;


    public user(Long id, String nome, String nascimento, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.senha = senha;
    }

    public user() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
