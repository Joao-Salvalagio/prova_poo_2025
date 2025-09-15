package com.prova.poo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_Aluno")
public class EstudanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome_Aluno")
    private String nome;
    @Column(name = "Email_Aluno")
    private String email;
    @Column(name = "Idade_Aluno")
    private Integer idade;

    public EstudanteModel() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
