package br.com.alura.sceenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classificavel;

public class Movie extends Tittle implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia();
    }
}
