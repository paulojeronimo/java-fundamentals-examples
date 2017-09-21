// https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
enum Sexo { Masculino, Feminino, Seila }

public class TestaEnum2 {
  public static void main(String args[]) {
    System.out.println("Sexos cadastrados: ");
    for (Sexo s: Sexo.values()) {
      System.out.println(s);
    }

    Sexo paulo = Sexo.Masculino;
    Sexo susana = Sexo.Feminino;
    Sexo darcy = Sexo.Seila;

    System.out.println("Sexo do Paulo: " + paulo);
    System.out.println("Sexo da Susana: " + susana);
    System.out.println("Sexo do(a) Darcy: " + darcy);

    Sexo sexo = Sexo.Masculino;
    switch (sexo) {
      case Masculino: System.out.println("Um sexo masculino foi informado"); break;
      case Feminino: System.out.println("Um sexo feminino foi informado"); break;
      default: System.out.println("Um sexo diferente foi informado");
    }

  }
}
