package objetos;

public class Radio extends AparelhoEletronicoAbstrato {
  private float frequencia;
  public void sintonizar(float frequencia) {
    this.frequencia = frequencia;
  }
}
