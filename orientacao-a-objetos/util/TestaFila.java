package util;

public class TestaFila {
  public static void main(String[] args) {
    Lista filaDeCores = new FilaDeTeste(3);

    filaDeCores.inserir(Cor.PRETO);
    filaDeCores.inserir(Cor.AZUL);
    filaDeCores.inserir(Cor.VERMELHO);

    Cor cor = null;
    while (filaDeCores.contemObjetos())
      cor = (Cor) filaDeCores.remover();
  }
}
