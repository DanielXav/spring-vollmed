package daniel.xavier.api.paciente;

import daniel.xavier.api.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id, String name, String telefone, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getTelefone(), paciente.getEndereco());
    }
}
