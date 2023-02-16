package daniel.xavier.api.controller;

import daniel.xavier.api.paciente.DadosCadastraPaciente;
import daniel.xavier.api.paciente.DadosListagemPaciente;
import daniel.xavier.api.paciente.Paciente;
import daniel.xavier.api.paciente.PacienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public Page<DadosListagemPaciente> listar(Pageable pageable){
        return repository.findAll(pageable).map(DadosListagemPaciente::new);
    }

}

