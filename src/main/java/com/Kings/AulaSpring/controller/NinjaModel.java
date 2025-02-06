package com.Kings.AulaSpring.controller;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
//transofrma a classe em uma entidade para o banco de dados
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome, email;
    int idade;

    public NinjaModel(int idade) {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
