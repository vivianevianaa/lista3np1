
package questao5;

/**
 *
 * @author Viviane Viana
 */

//5. O mecanismo de herança em programação orientado a objetos permite que uma nova classe
//(subclasse) nasça a partir de uma classe já existente (superclasse). Com base no conceito de herança,
//implemente, usando a linguagem Java, o sistema representado pelo diagrama da Figura 3.

public class Pessoa {
    private final int codigo;
    protected String nome;
    
    public Pessoa(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
}
