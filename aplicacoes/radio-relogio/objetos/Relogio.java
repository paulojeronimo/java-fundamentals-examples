package objetos;

import java.time.LocalTime;

// Esta declaração é certa, mas redundante:
//public class Relogio extends AparelhoEletronicoAbstrato implements AparelhoEletronico {
public class Relogio extends AparelhoEletronico {
  private LocalTime horas;

  public void setHoras(LocalTime horas) {
    this.horas = horas;
  }
}
