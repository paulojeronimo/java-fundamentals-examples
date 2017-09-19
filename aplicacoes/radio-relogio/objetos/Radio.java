package objetos;

import interfaces.Frequencia;
import interfaces.GeneroMusical;

public class Radio extends AparelhoEletronico implements interfaces.Radio {

    private float frequencia;

    public void sintonizar(float frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public void sintonizar(Frequencia frequencia) {
    }

    @Override
    public GeneroMusical getGeneroMusical() {
        return GeneroMusical.MPB;
    }
}
