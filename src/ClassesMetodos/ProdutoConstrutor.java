package ClassesMetodos;

public class ProdutoConstrutor {
    String nome;
    double preco;
    double desconto;

    ProdutoConstrutor(String nomeInicial){
        nome = nomeInicial;
    }
    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
