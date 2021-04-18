
package questao4;

import java.util.List;

/**
 *
 * @author Viviane Viana
 */

//4. Implemente o sistema apresentado pelo diagrama de classes da Figura 2 usando a linguagem de
//programação Java.

public class Departamento {
    private final int id;
    public String descricao;
    public List<Pessoa> pessoa;
    
    public Departamento(int id) {
        this.id = id;
    }
    
    protected int getId() {
        return this.id;
    }
}
