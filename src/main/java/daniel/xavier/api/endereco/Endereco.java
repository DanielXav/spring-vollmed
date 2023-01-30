package daniel.xavier.api.endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(DadosEndereco endereco) {
        logradouro = endereco.logradouro();
        numero = endereco.numero();
        complemento = endereco.complemento();
        bairro = endereco.bairro();
        cidade = endereco.cidade();
        uf = endereco.uf();
        cep = endereco.cep();
    }
}
