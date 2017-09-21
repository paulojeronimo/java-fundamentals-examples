public class TestaPromocao {
  public static void main(String args[]) {
    short a, b, c;
    a = 1;
    b = 2;
    //c = a + b; // <- erro de compilação!
    c = (short) (a + b);
    System.out.println("c = " + c);
  }
}
