package ClassesMetodos.Desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    void comer(Comida comida){
        if(comida != null ){
            this.peso += comida.peso;
        }
    }
    String hellou(){
        return String.format("Meu nome é %s e tenho %.2fkg.", nome, peso);
    }
}
