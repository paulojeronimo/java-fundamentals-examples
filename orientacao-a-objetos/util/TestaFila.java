package util;

class ImpressoraDeItens implements Operacao {
  public void executar(Object o) {
    System.out.println("Imprimindo " + o);
  }
}

public class TestaFila {
  public static void main(String[] args) {
    Lista filaDeCores = new FilaDeTeste(3);

    ImpressoraDeItens imp = new ImpressoraDeItens();

    filaDeCores.inserir(Cor.PRETO);
    filaDeCores.inserir(Cor.AZUL);
    filaDeCores.inserir(Cor.VERMELHO);

    filaDeCores.paraCadaItem(imp);

    Cor cor = null;
    while (filaDeCores.contemObjetos())
      cor = (Cor) filaDeCores.remover();
  }
}
