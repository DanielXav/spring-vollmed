package daniel.xavier.api.controller;

import daniel.xavier.api.paciente.DadosCadastraPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastraPaciente dados){
        System.out.println(dados);
    }
}
