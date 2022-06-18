package ArraysCollections;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7;
        notasAlunoA[1] = 8.6;
        notasAlunoA[2] = 4.5;

        String notafinal = Arrays.toString(notasAlunoA);
//       Ou System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notafinal);

        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        System.out.println("Média: " + total / notasAlunoA.length);

        for (int i = 0; i < notasAlunoA.length; i++){
            System.out.println(notasAlunoA[i]);
        }
    }

    double[] notasAlunoB = {6.9, 7.1, 4.0};
}
