package objetos;

public class Relogio {
  private boolean estado;

  public void ligar() {
    estado = true;
    System.out.println("O relogio esta ligado!");
  }
  public void desligar() {
    estado = false;
    System.out.println("O relogio esta desligado!");
  }
  public boolean getEstado() { return estado; }
}
