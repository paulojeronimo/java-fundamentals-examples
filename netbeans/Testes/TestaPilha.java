import java.util.Arrays;
import java.util.Stack;

enum Cor { PRETO, AZUL, VERMELHO };

public class TestaPilha {
  public static void main(String args[]) {
    Stack<Cor> stack = new Stack<>();
    stack.addAll(Arrays.asList(
      new Cor[] { Cor.PRETO, Cor.AZUL, Cor.VERMELHO }));

    System.out.println("Apos preencher a lista:");
    for (Cor cor: stack) {
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
