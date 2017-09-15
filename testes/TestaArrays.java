import java.util.List;
import java.util.Arrays;

public class TestaArrays {
  public static void main(String args[]) {
    String[] nums = { "one", "two", "three" };
    List<String> myList = Arrays.asList(nums);

    System.out.println("Elementos da lista:");
    for (String num: nums) {
      System.out.println(num);
    }
  }
}
