package ClassesMetodos.Desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.80);
        Comida c2 = new Comida("Fejião", .90);
        Pessoa p1 = new Pessoa("Lucas", 80);

        System.out.println(p1.hellou());
        p1.comer(c1);
        System.out.println(p1.hellou());
        p1.comer(c2);
        System.out.println(p1.hellou());

    }
}
