package br.com.alura.screenmatch.calculos;

import br.com.alura.sceenmatch.modelos.Tittle;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Tittle t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
