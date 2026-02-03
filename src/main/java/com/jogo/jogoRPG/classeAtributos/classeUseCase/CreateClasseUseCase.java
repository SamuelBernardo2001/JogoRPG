package com.jogo.jogoRPG.classeAtributos.classeUseCase;

import com.jogo.jogoRPG.classeAtributos.classeDTOS.ClasseCreateDTO;
import com.jogo.jogoRPG.classeAtributos.classeDTOS.ClasseResponseDTO;
import com.jogo.jogoRPG.classeAtributos.classeModels.ClasseModel;
import com.jogo.jogoRPG.classeAtributos.classeRepository.ClasseRepository;
import com.jogo.jogoRPG.classeAtributos.classeService.ClasseServiceCreate;
import com.jogo.jogoRPG.classeAtributos.mapper.ClasseMapper;
import org.springframework.stereotype.Component;

@Component
public class CreateClasseUseCase {

    private final ClasseRepository repository;
    private final ClasseServiceCreate serviceCreate;

    public CreateClasseUseCase(ClasseRepository repository, ClasseServiceCreate serviceCreate) {
        this.repository = repository;
        this.serviceCreate = serviceCreate;
    }

    public ClasseResponseDTO execute(ClasseCreateDTO dto) {
        ClasseModel classeModel = ClasseMapper.toEntity(dto);

        serviceCreate.valida(classeModel);

        ClasseModel salva = repository.save(classeModel);

        return ClasseMapper.toDTO(salva);
    }

}
