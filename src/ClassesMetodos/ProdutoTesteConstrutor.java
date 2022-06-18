package ClassesMetodos;

public class ProdutoTesteConstrutor {
    public static void main(String[] args) {
        ProdutoConstrutor p1 = new ProdutoConstrutor("Notebook");
//        p1.nome = "Notebook";
        p1.preco = 4353.99;
        p1.desconto = 0.25;

        var p2 = new ProdutoConstrutor("Caneta");
//        p2.nome = "Caneta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinalP1 = p1.precoComDesconto();
        double precoFinalP2 = p2.precoComDesconto();
        System.out.println(precoFinalP1);
        System.out.println(precoFinalP2);


    }
}
