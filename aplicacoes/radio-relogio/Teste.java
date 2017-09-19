import objetos.*;

public class Teste {
  static void imprimirEstadoDosObjetos(Radio radio, 
    Relogio relogio, RadioRelogio radioRelogio) {
    System.out.println("O radio esta " + (radio.getEstado()? "ligado ": "desligado"));
    System.out.println("O relogio esta " + (radio.getEstado()? "ligado ": "desligado"));
    System.out.println("O radioRelogio esta " + 
      (radioRelogio.getEstado()? "ligado ": "desligado"));
  }

  public static void main(String[] args) {
    Radio radio = new Radio();
    Relogio relogio = new Relogio();
    RadioRelogio radioRelogio = new RadioRelogio();

    radio.ligar();
    relogio.ligar();
    radioRelogio.ligar();
    
    imprimirEstadoDosObjetos(radio, relogio, radioRelogio);
   
    radio.desligar();
    relogio.desligar();

    imprimirEstadoDosObjetos(radio, relogio, radioRelogio);
  }
}
