package com.jogo.jogoRPG.classeAtributos.classeController;

import com.jogo.jogoRPG.classeAtributos.classeDTOS.ClasseCreateDTO;
import com.jogo.jogoRPG.classeAtributos.classeDTOS.ClasseResponseDTO;
import com.jogo.jogoRPG.classeAtributos.classeUseCase.CreateClasseUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classe")
public class ClasseController {

    private final CreateClasseUseCase useCase;

    public ClasseController(CreateClasseUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping("/criar")
    public ResponseEntity<ClasseResponseDTO> criaClasse(ClasseCreateDTO request) {
        ClasseResponseDTO response = useCase.execute(request);
        return ResponseEntity.ok(response);
    }
}
