package testaEnum3;

enum Cor {
  PRETO (0x000000),
  BRANCO (0xFFFFFF),
  VERMELHO (0xFF0000),
  VERDE (0x00FF00),
  AZUL (0x0000FF);

  long rgb;

  Cor(long rgb) {
    this.rgb = rgb;    
  }

  public String emMinusculo() {
    return toString().toLowerCase();
  }

  public long getRgb() { return rgb; }
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

public class TestaEnum3 {
  public static void main(String args[]) {
    BolaDeSinuca bolao = new BolaDeSinuca(Cor.BRANCO);
    BolaDeSinuca bolaOito = new BolaDeSinuca(Cor.PRETO);
 
    System.out.println("bolao: " + bolao);
    System.out.println("bolaOito: " + bolaOito);

    System.out.println("RGB da cor PRETO: " + Cor.PRETO.getRgb());
    System.out.println("Cor PRETO em minusculo: " + Cor.PRETO.emMinusculo());

    System.out.println("RGB das cores: ");
    for (Cor cor: Cor.values()) {
      System.out.println("RGB do " + cor + ": " + cor.getRgb());
    }
  }
}
