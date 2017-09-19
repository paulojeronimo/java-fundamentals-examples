import objetos.*;

public class Teste {
  static void imprimirEstadoDosObjetos(Radio radio) {
    System.out.println("O radioRelogio esta " + 
      (radio.getEstado()? "ligado ": "desligado"));
  }

  public static void main(String[] args) {
    RadioRelogio radioRelogio = new RadioRelogio(new Relogio());

    radioRelogio.ligar();
    
    imprimirEstadoDosObjetos(radioRelogio);
   
    radioRelogio.desligar();

    imprimirEstadoDosObjetos(radioRelogio);
  }
}
