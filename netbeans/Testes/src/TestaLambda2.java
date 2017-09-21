import java.util.*;

public class TestaLambda2 {
  public static void main(String args[]) {
    List<Integer> list = 
      Arrays.asList(1, 2, 3, 4);

    // encontrar o total do dobro dos números pares
    int total = 0;
    for(int i: list) {
      if (i % 2 == 0) {
        total += i * 2;
      }
    }

    System.out.println("total = " + total);

    System.out.println(
      list.stream()
        .filter(e -> e % 2 == 0)
        .mapToInt(e -> e * 2)
        .sum());
  }
}
