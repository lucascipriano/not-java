package ArraysCollections;

public class Usuario {
//    Equals and Hashcode

    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {
        Usuario outro = (Usuario) obj;

        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);

        return nomeIgual && emailIgual;
    }
}