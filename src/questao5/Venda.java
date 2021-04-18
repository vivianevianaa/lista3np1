
package questao5;

import java.util.Date;

/**
 *
 * @author Viviane Viana
 */

//5. O mecanismo de herança em programação orientado a objetos permite que uma nova classe
//(subclasse) nasça a partir de uma classe já existente (superclasse). Com base no conceito de herança,
//implemente, usando a linguagem Java, o sistema representado pelo diagrama da Figura 3.

public class Venda {
    private final int codigo;
    public Date data;
    public Funcionario funcionario;
    public Cliente cliente;
    
    public Venda(int codigo, Funcionario funcionario, Cliente cliente) {
        this.codigo = codigo;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public static void main(String[] args) {
        
    }
}
