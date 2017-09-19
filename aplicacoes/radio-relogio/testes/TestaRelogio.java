package testes;

import interfaces.*;
import java.time.LocalTime;

class TestaRelogio {
  private Relogio relogio;

  public TestaRelogio(Relogio relogio) {
    this.relogio = relogio;
  }
  
  public void testaAjustarHoras() {
     relogio.setHoras(LocalTime.of(5, 0));
     if (relogio.getHoras().equals(LocalTime.of(5, 0))) {
         System.out.println("testaAjustarHoras passou!");
     } else {
         System.out.println("testaAjustarHoras não passou!");
     }
  }
}