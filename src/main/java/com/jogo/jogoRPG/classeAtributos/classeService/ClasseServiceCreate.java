package com.jogo.jogoRPG.classeAtributos.classeService;

import com.jogo.jogoRPG.classeAtributos.classeModels.ClasseModel;
import org.springframework.stereotype.Service;

@Service
public class ClasseServiceCreate {

    public void valida(ClasseModel classe) {

        if (classe == null) {
            throw new IllegalArgumentException("A classe não pode ser nula.");}


    }

}
