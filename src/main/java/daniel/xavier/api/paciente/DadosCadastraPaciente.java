package daniel.xavier.api.paciente;

import daniel.xavier.api.endereco.DadosEndereco;

public record DadosCadastraPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
