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

        if (classe.getNome().length() < 5 || classe.getNome().length() > 15) {
            throw new IllegalArgumentException("O nome da classe deve ter entre 5 e 15 caracteres.");}

        if (classe.getDescricao() == null || classe.getDescricao().trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição da classe não pode ser nula ou vazia.");}

        if (classe.getDescricao().length() < 10 || classe.getDescricao().length() > 100) {
            throw new IllegalArgumentException("A descrição da classe deve ter entre 10 e 100 caracteres.");}

        if (classe.getRank() == null || classe.getRank().trim().isEmpty()) {
            throw new IllegalArgumentException("O rank da classe não pode ser nulo ou vazio.");}
    }

}
