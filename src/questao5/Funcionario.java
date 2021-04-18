
package questao5;

import java.util.List;

/**
 *
 * @author Viviane Viana
 */

//5. O mecanismo de herança em programação orientado a objetos permite que uma nova classe
//(subclasse) nasça a partir de uma classe já existente (superclasse). Com base no conceito de herança,
//implemente, usando a linguagem Java, o sistema representado pelo diagrama da Figura 3.

public class Funcionario extends Pessoa {
    protected double salario;
    public List<Venda> venda;
    
    public Funcionario(int codigo, String nome) {
        super(codigo);
        super.nome = nome;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public String getNome() {
        return this.nome;
    }
}
