package interfaces;

import java.util.List;
import java.util.Arrays;

public interface Radio extends AparelhoEletronico {
  Frequencia FREQUENCIA_PREFERIDA = Frequencia.BrasiliaSuperRadioFM;

  void sintonizar(Frequencia frequencia);
  GeneroMusical getGeneroMusical();

  default void sintonizarRadioPreferida() {
      sintonizar(FREQUENCIA_PREFERIDA);
  }

  static List<Antena> getAntenasTransmissoras() {
    return Arrays.asList(Antena.values());
  }
}
