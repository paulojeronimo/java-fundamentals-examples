package testes;

import interfaces.*;

public class TestaAparelhoEletronico {
  private AparelhoEletronico aparelho;

  public TestaAparelhoEletronico(AparelhoEletronico aparelho) {
    this.aparelho = aparelho;
  }

  public void testaLigar() {
    aparelho.ligar();
    System.out.println("O testeLigar " +
      (aparelho.getEstado()? "passou" : "nao passou!"));
  } 

  public void testaDesligar() {
    aparelho.desligar();
    System.out.println("O testeDesligar " +
      (!aparelho.getEstado()? "passou" : "nao passou!"));
  } 
}
