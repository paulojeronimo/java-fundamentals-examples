class Cor {
  static final Cor PRETO = new Cor("preto");
  static final Cor BRANCO = new Cor("branco");

  String cor;

  public Cor(String cor) {
    this.cor = cor;    
  }

  public String emMaiusculo() {
    return cor.toUpperCase();
  }

  @Override
  public String toString() {
    return cor;
  }
}

class BolaDeSinuca {
  Cor cor;

  public BolaDeSinuca(Cor cor) {
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "Bola de cor " + cor;
  }
}

public class TestaStatic2 {
  public static void main(String args[]) {
    BolaDeSinuca bolao = new BolaDeSinuca(Cor.BRANCO);
    BolaDeSinuca bolaOito = new BolaDeSinuca(Cor.PRETO);
 
    System.out.println("Cor preto em maisculo: " + Cor.PRETO.emMaiusculo());

    System.out.println("bolao: " + bolao);
    System.out.println("bolaOito: " + bolaOito);
  }
}
