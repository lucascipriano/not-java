package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double DIVIDE = 5 / 9.0;
        final int AJUSTE = 32;
        int fahrenheit = 150;
        double celsius = (fahrenheit - AJUSTE) * DIVIDE;
        System.out.println("O resultado é " + celsius + "C.");
    }
}
