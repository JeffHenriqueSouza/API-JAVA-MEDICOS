package med.voll.api.endereco;

import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.cep = dados.cep();
        this.bairro = dados.bairro();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
    }
}
