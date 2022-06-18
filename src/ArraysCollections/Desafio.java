package ArraysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Quantas notas você quer informar?: ");
        int noteCount = entry.nextInt();

        double[] arr = new double[noteCount];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            System.out.print("Informe a nota " + (i + 1) +": ");
            arr[i] = entry.nextDouble();
        }
        System.out.println(Arrays.toString(arr));

        double media = 0;
        for(double ar: arr){
            media += ar;
        }
        double total = media / arr.length;
        System.out.println(total);
    }
}
