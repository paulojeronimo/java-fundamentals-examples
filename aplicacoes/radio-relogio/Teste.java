import objetos.*;

public class Teste {
  public static void main(String[] args) {
    TestaAparelhoEletronico teste =
      new TestaAparelhoEletronico(new RadioRelogio(new Relogio()));
    teste.testaLigar();
    teste.testaDesligar();
  }
}
