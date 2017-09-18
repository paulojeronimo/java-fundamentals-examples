package util;

class ImpressoraDeItens implements Operacao {
  public void executar(Object o) {
    System.out.println("Imprimindo " + o);
  }
}

public class TestaFila {
  public static void main(String[] args) {
    Lista filaDeCores = new FilaDeTeste(3);

    filaDeCores.inserir(Cor.PRETO);
    filaDeCores.inserir(Cor.AZUL);
    filaDeCores.inserir(Cor.VERMELHO);

    filaDeCores.paraCadaItem(new ImpressoraDeItens());

    Cor cor = null;
    while (filaDeCores.contemObjetos())
      cor = (Cor) filaDeCores.remover();
  }
}
