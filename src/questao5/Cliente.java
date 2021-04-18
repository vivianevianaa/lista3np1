
package questao5;

import java.util.List;

/**
 *
 * @author Viviane Viana
 */

//5. O mecanismo de herança em programação orientado a objetos permite que uma nova classe
//(subclasse) nasça a partir de uma classe já existente (superclasse). Com base no conceito de herança,
//implemente, usando a linguagem Java, o sistema representado pelo diagrama da Figura 3.

public class Cliente extends Pessoa {
    private String email;
    public List<Venda> venda;
    
    public Cliente(int codigo, String nome) {
        super(codigo);
        super.nome = nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getNome() {
        return this.nome;
    }
}
