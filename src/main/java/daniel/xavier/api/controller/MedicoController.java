package daniel.xavier.api.controller;

import daniel.xavier.api.endereco.Endereco;
import daniel.xavier.api.medico.DadosCadastraMedico;
import daniel.xavier.api.medico.Medico;
import daniel.xavier.api.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/medicos")
public class MedicoController {

    @Autowired
    MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastraMedico dados){
        repository.save(new Medico(dados));
    }
}
