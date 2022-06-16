package Fundamentos;

public class TipoString {
    public static void main(String[] args) {

        System.out.println("Olá pessoal");

        String s = "Bom dia";

        // Sting é imutável, mas aceita essas funções com ponto.
        System.out.println(s.concat("!!"));

        var nome = "Lucas";
        var sobrenome = "Cipriano";
        var idade = 25;
        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);

        System.out.printf("O senhor %s %s tem %d anos.", nome, sobrenome, idade);
    }
}
