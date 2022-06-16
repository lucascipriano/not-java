package Controle;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entry.nextDouble();

        if(media >= 7.0){
            System.out.println("Passou");
        } else if(media >= 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        entry.close();
    }
}
