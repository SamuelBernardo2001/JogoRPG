package com.jogo.jogoRPG.classeAtributos.classeUseCase;

import com.jogo.jogoRPG.classeAtributos.classeRepository.ClasseRepository;
import com.jogo.jogoRPG.classeAtributos.classeService.ClasseServiceCreate;
import com.jogo.jogoRPG.classeAtributos.mapper.ClasseMapper;
import org.springframework.stereotype.Component;

@Component
public class CreateClasseUseCase {

    private final ClasseRepository repository;
    private final ClasseServiceCreate serviceCreate;
    private final ClasseMapper mapper;

    public CreateClasseUseCase(ClasseRepository repository, ClasseServiceCreate serviceCreate, ClasseMapper mapper) {
        this.repository = repository;
        this.serviceCreate = serviceCreate;
        this.mapper = mapper;
    }


}
