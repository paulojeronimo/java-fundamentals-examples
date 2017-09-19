import objetos.*;
import static objetos.RadioRelogio.Brilho.INTENSO;

public class Teste {
  static void imprimirEstado(interfaces.AparelhoEletronico aparelho) {
    System.out.println("O aparelho esta " + 
      (aparelho.getEstado()? "ligado": "desligado"));
  }

  public static void main(String[] args) {
    interfaces.AparelhoEletronico radioRelogio = new RadioRelogio(new Relogio());

    radioRelogio.ligar();
    
    imprimirEstado(radioRelogio);
   
    radioRelogio.desligar();
    //radioRelogio.setBrilho(RadioRelogio.Brilho.INTENSO); <- está ok mas ... huummm :/
    ((RadioRelogio) radioRelogio).setBrilho(INTENSO); // agora sim!
    
    imprimirEstado(radioRelogio);
  }
}
