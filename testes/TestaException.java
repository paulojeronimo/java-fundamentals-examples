public class TestaException {

  public static String stringInicial() {
    return null;
  }

  public static void main(String[] a) {
    String s = stringInicial();

    int i = 10;
    if (i > 10)
      s = "O valor e maior que 10";

    try {
      System.out.println(s.toUpperCase());
      // ...
      // ...
      // ...

    } catch (NullPointerException erro) {
      System.out.println("Opa ... avise ao programador que ele fez uma merdinha ...");
      System.out.println("O erro foi: " + erro);
    }
  }
}
