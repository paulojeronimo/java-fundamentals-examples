import java.util.*;

interface Analisador {
  public boolean analisa(String alvo, String busca);
}

class Analisador1 {
  public static void buscarString(String[] lista, String busca, Analisador ana) {
    for (String s: lista) {
      if (ana.analisa(s, busca)) {
        System.out.println(s);
      }
    }
  }
}

public class TestaLambda3 {
  public static void main(String args[]) {
    String[] lista = new String[] { "Paulo", "Jose", "Manuel", "Jair", "Roberio" };
    String busca = "a";

    Analisador1.buscarString(lista, busca, new Analisador() {
      public boolean analisa(String alvo, String busca) {
        return alvo.contains(busca);
      }
    });
  }
}
