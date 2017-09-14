package util;

public class TestaFila {
  public static void main(String[] args) {
    Fila filaDeCores = new FilaDeTeste(3);

    filaDeCores.inserir(Cor.PRETO);
    filaDeCores.inserir(Cor.AZUL);
    filaDeCores.inserir(Cor.VERMELHO);

    Cor cor = null;
    while (filaDeCores.temObjects())
      cor = (Cor) filaDeCores.remover();
  }
}
