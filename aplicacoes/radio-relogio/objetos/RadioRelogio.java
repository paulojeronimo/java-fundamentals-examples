package objetos;

public class RadioRelogio extends Radio {
  enum Brilho { NORMAL, MEDIO, INTENSO, APAGADO };

  Relogio relogio;
  Brilho brilho;

  public RadioRelogio(Relogio relogio) {
    this.relogio = relogio;
  }

  @Override
  public void ligar() {
    //super.estado = true; // não compila!
    setEstado(true);
    setBrilho(Brilho.NORMAL);
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

  public void setBrilho(Brilho brilho) {
    this.brilho = brilho;
  }
}
