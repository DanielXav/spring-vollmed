package daniel.xavier.api.domain.paciente;

import daniel.xavier.api.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id, String name, String telefone, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getTelefone(), paciente.getEndereco());
    }
}
