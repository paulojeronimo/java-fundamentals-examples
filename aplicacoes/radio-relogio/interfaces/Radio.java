package interfaces;

public interface Radio extends AparelhoEletronico {
  void sintonizar(Frequencia frequencia);
  GeneroMusical getGeneroMusical();
}
