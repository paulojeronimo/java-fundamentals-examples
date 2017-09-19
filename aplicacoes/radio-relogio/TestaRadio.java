import interfaces.*;

class TestaRadio {
  private Radio radio;

  public TestaRadio(Radio radio) {
    this.radio = radio;
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
