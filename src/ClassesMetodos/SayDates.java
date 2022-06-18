package ClassesMetodos;

public class SayDates {
    public static void main(String[] args) {
        CreateDates p1 = new CreateDates();
        p1.ocasiao = "Aniversário";
        p1.dia = 29;
        p1.mes = 03;
        p1.ano = 1998;
        System.out.println(p1.ocasiao + " " + p1.dia + " " + p1.mes + " "+ p1.ano);
        System.out.println(p1.obterData());
        CreateDates p2 = new CreateDates();
        p2.ocasiao = "Salário";
        p2.dia = 5;
        p2.mes = 8;
        p2.ano = 2022;
        System.out.println(p2.obterData());

    }
}
