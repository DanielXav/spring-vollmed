package daniel.xavier.api.controller;

import daniel.xavier.api.paciente.DadosCadastraPaciente;
import daniel.xavier.api.paciente.Paciente;
import daniel.xavier.api.paciente.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
        public void cadastrar(@RequestBody @Valid DadosCadastraPaciente dados) {
        repository.save(new Paciente(dados));
    }
}

