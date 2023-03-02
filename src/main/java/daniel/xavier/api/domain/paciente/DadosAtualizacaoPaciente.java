package daniel.xavier.api.domain.paciente;

import daniel.xavier.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {
}
