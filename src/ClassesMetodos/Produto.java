package ClassesMetodos;

public class Produto {
    String nome;
    double preco;
    static final double desconto = 0.25;

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
