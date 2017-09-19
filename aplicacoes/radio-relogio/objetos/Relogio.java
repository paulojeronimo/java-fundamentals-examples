package objetos;

import java.time.LocalTime;

public class Relogio extends AparelhoEletronico {
  private LocalTime horas;

  public void setHoras(LocalTime horas) {
    this.horas = horas;
  }
}
