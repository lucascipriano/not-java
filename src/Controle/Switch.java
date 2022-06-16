package Controle;

public class Switch {
    public static void main(String[] args) {
        String faixa = "roxa";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai..");
                break;
            case "marron":
                System.out.println("Sei o Tekki Shodan");
                break;
            case "roxa":
                System.out.println("Sei o Heian Godan");
                break;
            case "verde":
                System.out.println("Sei o Heian Yodan");
                break;
            case "laranja":
                System.out.println("Sei o Heian Sadan");
                break;

            case "vermelha":
                System.out.println("Sei o Heian Nidan");
                break;
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Sei de nada");
        }
    }
}
