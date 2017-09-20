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

    System.out.println("Strings que contem \"a\"");
    Analisador1.buscarString(lista, busca, (alvo, s) -> alvo.contains(s));

    System.out.println("Strings que terminam com \"o\"");
    Analisador1.buscarString(lista, "o", (alvo, s) -> alvo.endsWith(s));

    System.out.println("Strings que comecam com \"P\"");
    Analisador1.buscarString(lista, "P", new Analisador() {
      public boolean analisa(String alvo, String busca) {
        return alvo.startsWith(busca);
      }
    });
  }
}
