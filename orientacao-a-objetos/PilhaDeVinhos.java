import util.Pilha;

public class PilhaDeVinhos extends Pilha {
  public PilhaDeVinhos(int quantidade) {
    super(quantidade);
  }

  boolean temVinhos() {
    return contemObjetos();
  } 
}
