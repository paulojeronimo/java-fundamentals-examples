enum Cor { BRANCO, PRETO, AMARELO }

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

public class TestaStatic3 {
  public static void main(String args[]) {
    BolaDeSinuca bolao = new BolaDeSinuca(Cor.BRANCO);
    BolaDeSinuca bolaUm = new BolaDeSinuca(Cor.AMARELO);
    BolaDeSinuca bolaOito = new BolaDeSinuca(Cor.PRETO);

    System.out.printf("Na mesa de sinuca ha %d bolas\n", BolaDeSinuca.bolas().length);
  }
}
