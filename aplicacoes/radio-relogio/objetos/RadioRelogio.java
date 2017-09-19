package objetos;

public class RadioRelogio extends Radio {
  Relogio relogio;

  public RadioRelogio(Relogio relogio) {
    this.relogio = relogio;
  }

  @Override
  public void ligar() {
    //super.estado = true; // não compila!
    setEstado(true);
    relogio.ligar();
  }

  @Override
  public void desligar() {
    super.desligar();
    relogio.desligar();
  }

  public void ligarRadio() {
    ligar();
  }

  public void desligarRadio() {
    desligar();
  }
}
