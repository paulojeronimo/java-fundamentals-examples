package objetos;

public class AparelhoEletronico implements interfaces.AparelhoEletronico {
  private boolean estado;

  public void ligar() {
    setEstado(true);
  }
  public void desligar() {
    setEstado(false);
  }
  protected void setEstado(boolean estado) { this.estado = estado; }
  public boolean getEstado() { return estado; }
}
