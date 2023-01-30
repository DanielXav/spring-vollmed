package daniel.xavier.api.medico;

import daniel.xavier.api.endereco.DadosEndereco;

public record DadosCadastraMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
