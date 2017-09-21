import java.util.*;
import java.util.function.*;

public class TestaLambda {
  static void e1(List<Integer> l) {
    System.out.println("External iterator 1");
    for (int i = 0; i < l.size(); i++) {
      System.out.println(l.get(i));
    }
  }

  static void e2(List<Integer> l) {
    System.out.println("External iterator 2");
    //for (Integer i: l) {
    for (int i: l) {
      System.out.println(i);
    }
  }

  static void i1(List<Integer> l) {
    System.out.println("Internal iterator 1");
    l.forEach(new Consumer<Integer>() {
      public void accept(Integer e) {
        System.out.println(e);
      }
    });        
  }

  static void i2(List<Integer> l) {
    System.out.println("Internal iterator 2");
    l.forEach((Integer e) -> System.out.println(e));
  }

  static void i3(List<Integer> l) {
    System.out.println("Internal iterator 3");
    l.forEach((e) -> System.out.println(e));
  }

  static void i4(List<Integer> l) {
    System.out.println("Internal iterator 4");
    l.forEach(e -> System.out.println("i4: " + e));
  }

  static void i5(List<Integer> l) {
    System.out.println("Internal iterator 5");
    l.forEach(System.out::println);
  }

  public static void main(String args[]) {
    List<Integer> list = 
      Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    e1(list);
    e2(list);
    i1(list);
    i2(list);
    i3(list);
    i4(list);
    i5(list);
  }
}
