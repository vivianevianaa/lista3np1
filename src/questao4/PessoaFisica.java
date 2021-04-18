
package questao4;

/**
 *
 * @author Viviane Viana
 */

//4. Implemente o sistema apresentado pelo diagrama de classes da Figura 2 usando a linguagem de
//programação Java.

public class PessoaFisica extends Pessoa {
    private String cpf;
    
    public PessoaFisica(int id, String nome, Departamento depart) {
        super(id, depart);
        super.nome = nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
