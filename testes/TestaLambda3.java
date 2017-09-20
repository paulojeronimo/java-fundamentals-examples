import java.util.*;

class Analisador {
  public boolean analisa(String alvo, String busca) {
    return alvo.contains(busca);
  }
}

public class TestaLambda3 {
  public static void main(String args[]) {
    String[] lista = new String[] { "Paulo", "Jose", "Manuel", "Jair", "Roberio" };
    String busca = "a";

    Analisador ana = new Analisador();

    for (String s: lista) {
      if (ana.analisa(s, busca)) {
        System.out.println(s);
      }
    }
  }
}
