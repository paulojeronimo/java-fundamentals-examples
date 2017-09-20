class ContadorLento implements Runnable {
  public void run() {
    System.out.println("Estou na Thread ContadorLento");
    int contador = 0;
    while (contador++ < 10) {
      System.out.println("Contador lento: " + contador);
      try {
        Thread.sleep(2000);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }      
    System.out.println("Thread ContadorLento acabou");
  }
}

public class TestaThread {
  public static void run() {
    int contador = 0;
    while (contador++ < 10) {
      System.out.println("Contador principal: " + contador);
      try { Thread.sleep(1000); } catch (Exception e) { e.printStackTrace(); }
    }      
  }

  public static void main(String args[]) {
    System.out.println("Estou na Thread principal");
    Thread t = new Thread(new ContadorLento());
    t.start();
    run();
    System.out.println("Thread principal acabou");
  }
}
