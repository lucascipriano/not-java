package Fundamentos;

public class VarAndConst {
    public static void main(String[] args){
        double raio = 3.4;
        final double PI = 3.14159; // Constante tem final antes do tipo
        double area = PI * raio * raio;
        System.out.println("Área = " + area + "m2.");
    }
}
