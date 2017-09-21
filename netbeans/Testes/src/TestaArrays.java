import java.util.List;
import java.util.Arrays;

public class TestaArrays {
  public static void main(String args[]) {
    List<String> myList = Arrays.asList(
      new String[] { "one", "two", "three" });

    System.out.println("Elementos da lista:");
    myList.forEach(x -> System.out.println(x));
  }
}
