package daniel.xavier.api.paciente;

import daniel.xavier.api.endereco.Endereco;
import jakarta.persistence.*;

@Entity(name = "Paciente")
@Table(name = "Pacientes")
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String cpf;

    @Embedded
    private Endereco endere;
}
