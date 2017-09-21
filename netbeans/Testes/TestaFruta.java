class Fruta {
  int qtdFrutose;

  void soltarCaldo() {
    System.out.println("Fruta soltando caldo");
  }
}

class Abacaxi extends Fruta {
  int qtdEspinhos;

  void soltarCaldo() {
    System.out.println("Abacaxi soltando caldo");
  }
}

class Banana extends Fruta {
  int tamanho;

  void soltarCaldo() {
    System.out.println("Banana soltando caldo");
  }
}

public class TestaFruta {
  public static void main(String[] args) {
    Fruta f = new Abacaxi();
    Fruta g = new Banana();
    Abacaxi h = (Abacaxi) g;
  }
}
