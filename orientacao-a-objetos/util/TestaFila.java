package util;

enum Cor { PRETO, AZUL, VERMELHO }

public class TestaFila {

  public static void inserir(Fila fila, Cor cor) {
    fila.inserir(cor);
    System.out.println("Inserindo a cor " + cor + " na fila");
  }

  public static Cor remover(Fila fila) {
    Cor cor = (Cor) fila.remover();
    System.out.println("Removendo a cor " + cor + " da fila");
    return cor;
  }

  public static void main(String[] args) {
    Fila filaDeCores = new Fila(3);

    inserir(filaDeCores, Cor.PRETO);
    inserir(filaDeCores, Cor.AZUL);
    inserir(filaDeCores, Cor.VERMELHO);

    Cor cor = null;
    while (filaDeCores.temObjects())
      cor = remover(filaDeCores);
  }
}
