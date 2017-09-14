package util;

enum Cor { PRETO, AZUL, VERMELHO }

public class TestaFila {
  public static void main(String[] args) {
    Fila filaDeCores = new Fila(3);

    filaDeCores.inserir(Cor.PRETO);
    System.out.println("Inserindo a cor " + Cor.PRETO + " na fila");

    filaDeCores.inserir(Cor.AZUL);
    System.out.println("Inserindo a cor " + Cor.AZUL + " na fila");

    filaDeCores.inserir(Cor.VERMELHO);
    System.out.println("Inserindo a cor " + Cor.VERMELHO + " na fila");

    Cor cor = null;
    while (filaDeCores.temObjects()) {
      cor = (Cor) filaDeCores.remover();
      System.out.println("Removendo a cor " + cor + " da fila");
    }
  }
}
