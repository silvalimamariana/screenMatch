import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme(); //esquerda guarda e direita cria

        meuFilme.setNome("The Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: "+ meuFilme.getDuracaoEmMinutos());

        meuFilme.getNome();
        meuFilme.getAnoDeLancamento();
        meuFilme.getDuracaoEmMinutos();
        meuFilme.getisIncluidoNoPlano();

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: "+ meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setTemporadas(5);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setMinutosPorEpisodio(45);
        serie.setEpisodiosPorTemporada(10);
        serie.exibeFichaTecnica();

        System.out.println("Duração da série: " + serie.getDuracaoEmMinutos() + " minutos.");

        Filme outroFilme = new Filme();

        outroFilme.setNome("John Wick");
        outroFilme.setAnoDeLancamento(2014);
        outroFilme.setDuracaoEmMinutos(101);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.exibeFichaTecnica();

        //calculadora juntando filmes e series
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println("Tempo total: "+ calculadora.getTempoTotal());

    }
}