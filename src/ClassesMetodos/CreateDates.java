package ClassesMetodos;

public class CreateDates {
    String ocasiao;
    int dia;
    int mes;
    int ano;

    String obterData(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
