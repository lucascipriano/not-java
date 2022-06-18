package ArraysCollections;

public class EqualsAndHashcode {
    public static void main(String[] args) {
        Usuario p1 = new Usuario();
        p1.nome = "Lucas";
        p1.email = "lucas@gmail.com";

        Usuario p2 = new Usuario();
        p2.nome = "Lucas";
        p2.email = "lucas@gmail.com";
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
    }
}
