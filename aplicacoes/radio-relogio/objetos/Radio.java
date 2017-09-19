package objetos;

public class Radio {
  private boolean estado;

  public void ligar() {
    estado = true;
  }
  public void desligar() {
    estado = false;
  }
  public boolean getEstado() { return estado; }
}

