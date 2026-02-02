package com.jogo.jogoRPG.classeAtributos.classeModels;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "classes")
public class ClasseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 6, message = "Nome deve ter no mínimo 6 caracteres")
    @Column(nullable = false)
    private String nome;

    @NotBlank(message = "Descrição é obrigatória")
    @Size(min = 10, message = "Descrição deve ter no mínimo 10 caracteres")
    @Column(nullable = false)
    private String descricao;

    @NotBlank(message = "Rank é obrigatório")
    @Size(min = 1, message = "Rank deve ter no mínimo 1 caractere")
    @Column(nullable = false)
    private String rank;
}
