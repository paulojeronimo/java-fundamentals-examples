class CameraDeVideo {
  boolean ligado;

  void ligar() {
    System.out.println("Ligando ...");
    // ...
    ligado = true;
  }

  void desligar() {
    System.out.println("Desligando ...");
    // ...
    ligado = false;
  }
}

public class TestaReferencias {
  public static void main(String args[]) {
    CameraDeVideo remoto1 = new CameraDeVideo();
    //CameraDeVideo remoto2 = remoto1;
    CameraDeVideo remoto2 = new CameraDeVideo();

    System.out.println("remoto1 = " + remoto1);
    System.out.println("remoto2 = " + remoto2);

    remoto1.ligar();
    remoto2.desligar();
    System.out.println("remoto1 esta " + ( remoto1.ligado ? "ligado" : "desligado") );
    System.out.println("remoto2 esta " + ( remoto2.ligado ? "ligado" : "desligado") );
  }
}
