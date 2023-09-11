import br.com.alura.sceenmatch.modelos.Episode;
import br.com.alura.sceenmatch.modelos.Movie;
import br.com.alura.sceenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class Main {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.setNome("0 poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(false);

        Movie outroFilme = new Movie();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(100);
        outroFilme.setIncluidoNoPlano(false);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + minhaSerie.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episode episodio = new Episode();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}