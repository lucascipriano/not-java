package ArraysCollections;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Quantos alunos?: ");
        int qtAlunos = entry.nextInt();

        System.out.print("Quantas notas: ");
        int qtNotas = entry.nextInt();

        double[][] notaDaTurma = new double[qtAlunos][qtNotas];

        double media = 0;
        for (int a = 0; a < notaDaTurma.length; a++){
            for (int n = 0; n < notaDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d:", n + 1, a + 1);
                notaDaTurma[a][n] = entry.nextDouble();

                media += notaDaTurma[a][n];
            }
        }
        double total =  media /(qtAlunos * qtNotas);
        System.out.println("Média da turma é " + total);

    }

}
