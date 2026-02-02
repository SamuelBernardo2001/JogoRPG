package com.jogo.jogoRPG.classeAtributos.classeDTOS;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ClasseUpdateDTO(

        @NotBlank(message = "Nome é obrigatório")
        @Size(min = 6, message = "Nome deve ter no mínimo 6 caracteres")
        String nome,

        @NotBlank(message = "Descrição é obrigatória")
        @Size(min = 10, message = "Descrição deve ter no mínimo 10 caracteres")
        String descricao,

        @NotBlank(message = "Rank é obrigatório")
        @Size(min = 1, message = "Rank deve ter no mínimo 1 caractere")
        String rank
) {}
