package com.jogo.jogoRPG.classeAtributos.classeService;

import com.jogo.jogoRPG.classeAtributos.classeModels.ClasseModel;
import org.springframework.stereotype.Service;

@Service
public class ClasseServiceCreate {

    public void valida(ClasseModel classe) {

        if (classe == null) {
            throw new IllegalArgumentException("A classe não pode ser nula.");}

        if (classe.getNome() == null || classe.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da classe não pode ser nulo ou vazio.");}

    }

}
