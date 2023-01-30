package daniel.xavier.api.controller;

import daniel.xavier.api.endereco.Endereco;
import daniel.xavier.api.medico.DadosCadastraMedico;
import daniel.xavier.api.medico.Medico;
import daniel.xavier.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void cadastrar(@RequestBody DadosCadastraMedico dados){
        repository.save(new Medico(dados));
    }
}
