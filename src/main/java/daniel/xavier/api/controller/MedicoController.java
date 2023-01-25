package daniel.xavier.api.controller;

import daniel.xavier.api.medico.DadosCadastraMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastraMedico dados){
        System.out.println(dados);
    }
}
