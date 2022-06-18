package ClassesMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4353.99;

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 12.56;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinalP1 = p1.precoComDesconto();
        double precoFinalP2 = p2.precoComDesconto();
        System.out.println(precoFinalP1);
        System.out.println(precoFinalP2);


    }
}
