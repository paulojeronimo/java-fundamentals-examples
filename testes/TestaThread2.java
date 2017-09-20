public class TestaThread2 {
  public static void main(String args[]) {
    System.out.println("Estou na Thread principal");
/*
    Thread t = new Thread(new Runnable() {
      public void run() {
        System.out.println("Estou na Thread interna");
      }
    });
*/
    Thread t = new Thread(() -> System.out.println("Estou na Thread interna"));
    t.start();
  }
}
