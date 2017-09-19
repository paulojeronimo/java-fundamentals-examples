import objetos.*;

public class Teste {
  static void imprimirEstadoDosObjetos(Radio radio, Relogio relogio) {
    System.out.println("O radio esta " + (radio.getEstado()? "ligado ": "desligado"));
    System.out.println("O relogio esta " + (radio.getEstado()? "ligado ": "desligado"));
  }

  public static void main(String[] args) {
    Radio radio = new Radio();
    Relogio relogio = new Relogio();

    radio.ligar();
    relogio.ligar();
    
    imprimirEstadoDosObjetos(radio, relogio);  
   
    radio.desligar();
    relogio.desligar();

    imprimirEstadoDosObjetos(radio, relogio);  
  }
}
