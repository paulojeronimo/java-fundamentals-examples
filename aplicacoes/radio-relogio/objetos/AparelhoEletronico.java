package objetos;

public class AparelhoEletronico {
  private boolean estado;

  public void ligar() {
    estado = true;
  }
  public void desligar() {
    estado = false;
  }
  public boolean getEstado() { return estado; }
}

