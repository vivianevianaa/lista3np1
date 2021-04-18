
package questao3;

/**
 *
 * @author Viviane Viana
 */

//3. Implemente uma superclasse Pessoa que possua os seguintes atributos: id do tipo inteiro, nome do
//tipo cadeia de caracteres (String) e email do tipo cadeia de caracteres (String). O atributo id só pode ser
//diretamente visível e acessado dentro da própria classe Pessoa. Já o atributo nome só pode ser diretamente
//visível e acessado dentro da classe Pessoa e das subclasses que herdam de Pessoa. Já o atributo email
//pode ser diretamente visível e acessado dentro da classe Pessoa, dentro das subclasses de Pessoa e por
//meio dos objetos instanciados da classe Pessoa ou das subclasses de Pessoa. Como o atributo nome só
//pode ser diretamente acessado pela classe Pessoa e pelas subclasses de Pessoa, implemente um método
//que permita a leitura do valor do atributo nome por meio de objetos instanciados a partir da classe Pessoa e
//de suas classes derivadas. Implemente também, pelo menos, uma subclasse de Pessoa. Por fim,
//implemente uma classe Principal que possua o método main e instancie um objeto da superclasse Pessoa e
//dois objetos da subclasse de Pessoa. A resposta desta questão pode ser feita na linguagem Java.

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Maria", "maria.com");
        
        PessoaFisica pessoa2 = new PessoaFisica(2, "João", "joao.com", 123456);
        
        PessoaJuridica pessoa3 = new PessoaJuridica(3, "José", "jose.com", 123456789);
    }
}
