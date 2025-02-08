package com.Kings.AulaSpring.controller.ninjas;

import com.Kings.AulaSpring.controller.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//transofrma a classe em uma entidade para o banco de dados
@Table(name = "tb_cadastro")
@NoArgsConstructor // Criar construtor vazio automático
@AllArgsConstructor
@Data // Cria todos os getters e setters

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key
    private MissoesModel missoes;


}
