enum Cor { PRETO, BRANCO }

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

public class TestaEnum {
  public static void main(String args[]) {
    BolaDeSinuca bolao = new BolaDeSinuca(Cor.BRANCO);
    BolaDeSinuca bolaOito = new BolaDeSinuca(Cor.PRETO);
 
    System.out.println("bolao: " + bolao);
    System.out.println("bolaOito: " + bolaOito);
  }
}
