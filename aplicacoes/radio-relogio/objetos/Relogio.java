package objetos;

import java.time.LocalTime;

// Esta declaração é certa, mas redundante:
//public class Relogio extends AparelhoEletronicoAbstrato implements AparelhoEletronico {
public class Relogio extends AparelhoEletronico implements interfaces.Relogio {
  private LocalTime horas;

    @Override
  public void setHoras(LocalTime horas) {
    this.horas = horas;
  }

    @Override
    public LocalTime getHoras() {
        return horas;
    }
}
