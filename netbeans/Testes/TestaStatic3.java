enum Cor { BRANCO, PRETO, AMARELO }

class BolaDeSinuca {
  Cor cor;

  private static int bolasNaMesa;
  private static BolaDeSinuca[] bolas = new BolaDeSinuca[16];

  public BolaDeSinuca(Cor cor) {
    this.cor = cor;
    bolas[bolasNaMesa++] = this;
  }

  @Override
  public String toString() {
    return "Bola de cor " + cor;
  }

  public static BolaDeSinuca[] bolas() {
    return bolas;
  }

  public static int bolasNaMesa() {
    return bolasNaMesa;
  }
}

public class TestaStatic3 {
  public static void main(String args[]) {
    BolaDeSinuca bolao = new BolaDeSinuca(Cor.BRANCO);
    BolaDeSinuca bolaUm = new BolaDeSinuca(Cor.AMARELO);
    BolaDeSinuca bolaOito = new BolaDeSinuca(Cor.PRETO);

    System.out.printf("Na sinuca ha %d bolas ao comecar o jogo\n", BolaDeSinuca.bolas().length);
    System.out.printf("Na mesa de sinuca ha %d bolas neste momento\n", BolaDeSinuca.bolasNaMesa());
  }
}
