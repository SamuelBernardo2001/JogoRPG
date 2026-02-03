package com.jogo.jogoRPG.classeAtributos.classeRepository;

import com.jogo.jogoRPG.classeAtributos.classeModels.ClasseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClasseRepository extends JpaRepository<ClasseModel, Long> {

    boolean existsByNome(String nome);
    Optional<ClasseModel> findByNome(String nome);
}
