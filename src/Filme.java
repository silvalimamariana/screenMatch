public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);

    }

    void avalia(double nota) { //apenas dá, sem receber

        somaAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    double pegaMedia() { //recebe

        return somaAvaliacoes / totalDeAvaliacoes;
    }

}