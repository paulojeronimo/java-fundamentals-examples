import java.util.List;
import java.util.Stack;

enum Cor { PRETO, AZUL, VERMELHO };

public class TestaPilha {
  public static void main(String args[]) {
    Stack<Cor> stack = new Stack<>();
    List<Cor> listaDeCores = stack;

    listaDeCores.add(Cor.PRETO);
    listaDeCores.add(Cor.AZUL);
    listaDeCores.add(Cor.VERMELHO);

    System.out.println("Apos preencher a lista:");
    for (Cor cor: listaDeCores) {
      System.out.println(cor);
    }

    System.out.println("Removendo cores (da pilha):");
    Cor cor = null;
    while (!stack.empty()) {
      cor = stack.pop();
      System.out.println(cor);
    }
  }
}
