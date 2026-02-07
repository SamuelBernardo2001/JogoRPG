package com.jogo.jogoRPG.classeAtributos.classeDTOS;

public record ClasseResponseDTO(
        Long id,
        String nome,
        String descricao,
        String rankClasse
) {}