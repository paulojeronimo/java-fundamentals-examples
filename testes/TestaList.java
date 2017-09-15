import java.util.List;
import java.util.ArrayList;

enum Cor { PRETO, AZUL, VERMELHO };

public class TestaList {
  public static void main(String args[]) {
    List<Cor> listaDeCores = new ArrayList<>();

    listaDeCores.add(Cor.PRETO);
    listaDeCores.add(Cor.AZUL);
    listaDeCores.add(Cor.VERMELHO);

    System.out.println("Apos preencher a lista:");
    for (Cor cor: listaDeCores) {
      System.out.println(cor);
    }

    while (!listaDeCores.isEmpty())
      listaDeCores.remove(0);

    System.out.println("Apos remover elementos da lista:");
    for (Cor cor: listaDeCores) {
      System.out.println(cor);
    }
  }
}
