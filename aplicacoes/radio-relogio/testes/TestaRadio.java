package testes;

import interfaces.*;
import java.util.List;
import java.util.Arrays;

class TestaRadio {
  private Radio radio;

  public TestaRadio(Radio radio) {
    this.radio = radio;
  }

  public void testaObterAntenasTransmissoras() {
    if (Radio.getAntenasTransmissoras().equals(Arrays.asList(Antena.values())))
      System.out.println("testaObterAntenasTransmissoras passou!");
    else
      System.out.println("testaObterAntenasTransmissoras nao passou!");
  }

  public void testaSintonizar() {
    radio.ligar();
    radio.sintonizar(Frequencia.BrasiliaSuperRadioFM);
    switch (radio.getGeneroMusical()) {
      case MUSICA_CLASSICA:
      case MPB:
        System.out.println("testaSintonizar passou!");
        break;
      default:
        System.out.println("testaSintonizar nao passou!");
    }
    radio.desligar();
  }
}
