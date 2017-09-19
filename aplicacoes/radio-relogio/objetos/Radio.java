package objetos;

public class Radio {
  private boolean estado;

  public void ligar() {
    estado = true;
    System.out.println("O radio esta ligado!");
  }
  public void desligar() {
    estado = false;
    System.out.println("O radio esta desligado!");
  }
  public boolean getEstado() { return estado; }
}

