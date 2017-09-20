import java.util.*;

public class TestaLambda3 {
  public static void main(String args[]) {
    String[] lista = new String[] { "Paulo", "Jose", "Manuel", "Jair", "Roberio" };
    String busca = "a";

    for (String s: lista) {
      if (s.contains(busca)) {
        System.out.println(s);
      }
    }
  }
}
