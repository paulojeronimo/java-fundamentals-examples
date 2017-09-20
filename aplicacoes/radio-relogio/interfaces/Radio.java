package interfaces;

public interface Radio extends AparelhoEletronico {
  void sintonizar(Frequencia frequencia);
  GeneroMusical getGeneroMusical();

  default void sintonizarRadioPreferida() {
      sintonizar(Frequencia.BrasiliaSuperRadioFM);
  }
}
