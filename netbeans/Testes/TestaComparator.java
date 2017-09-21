import java.util.List;
import java.util.Arrays;

public class TestaComparator {
  public static void main(String args[]) {
    List<String> nomes = Arrays.asList(
      "Paulo", "Manuel", "Jair", "Robério");

    nomes.sort();
    nomes.forEach(System.out::println);
  }
}
