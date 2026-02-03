package com.jogo.jogoRPG.classeAtributos.mapper;

import com.jogo.jogoRPG.classeAtributos.classeDTOS.ClasseCreateDTO;
import com.jogo.jogoRPG.classeAtributos.classeModels.ClasseModel;

public class ClasseMapper {

    // Criando O metodo de converte DTO para Entity do CreateDTO
    public static ClasseModel toEntity(ClasseCreateDTO create){
        ClasseModel classeModel = new ClasseModel();
        classeModel.setNome(create.nome());
        classeModel.setDescricao(create.descricao());
        classeModel.setRank(create.rank());
        return classeModel;
    }
}
