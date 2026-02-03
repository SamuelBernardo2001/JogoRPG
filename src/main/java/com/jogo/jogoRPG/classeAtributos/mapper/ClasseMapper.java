package com.jogo.jogoRPG.classeAtributos.mapper;

import com.jogo.jogoRPG.classeAtributos.classeDTOS.ClasseCreateDTO;
import com.jogo.jogoRPG.classeAtributos.classeDTOS.ClasseResponseDTO;
import com.jogo.jogoRPG.classeAtributos.classeDTOS.ClasseUpdateDTO;
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

    // DTO → Entity (UPDATE)
    public static  void updateEntity(ClasseUpdateDTO update, ClasseModel model){
        model.setNome(update.nome());
        model.setDescricao(update.descricao());
        model.setRank(update.rank());
    }

    // Entity → DTO (RESPONSE)
    public static ClasseResponseDTO toDTO(ClasseModel model){
        return new ClasseResponseDTO(
                model.getId(),
                model.getNome(),
                model.getDescricao(),
                model.getRank()
        );
    }

}
