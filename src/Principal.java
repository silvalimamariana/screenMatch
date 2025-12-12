public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme(); //esquerda guarda e direita cria

        meuFilme.nome = "O poderoso chefao";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);

        System.out.println("Média de avaliações: "+ meuFilme.pegaMedia());

    }

}