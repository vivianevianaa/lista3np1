
package questao4;

/**
 *
 * @author Viviane Viana
 */

//4. Implemente o sistema apresentado pelo diagrama de classes da Figura 2 usando a linguagem de
//programação Java.

public class Pessoa {
    private final int id;
    protected String nome;
    Departamento depart;
    
    public Pessoa(int id, Departamento depart) {
        this.id = id;
        this.depart = depart;
    }
    
    protected int getId() {
        return this.id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
