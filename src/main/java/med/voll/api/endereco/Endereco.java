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

    public void atualizarEndereco(DadosEndereco dados) {
        if (this.logradouro != null){
            this.logradouro = dados.logradouro();
        }
        if (this.cep != null){
            this.cep = dados.cep();
        }
        if (this.bairro != null){
            this.bairro = dados.bairro();
        }
        if (this.uf != null){
            this.uf = dados.uf();
        }
        if (this.cidade != null){
            this.cidade = dados.cidade();
        }
        if (this.complemento != null){
            this.complemento = dados.complemento();
        }
        if (this.numero != null){
            this.numero = dados.numero();
        }
    }
}
