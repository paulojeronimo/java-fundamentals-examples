class Camiseta {
  static final String PEQUENA = "P";
  static final String MEDIA = "M";
  static final String GRANDE = "G";
  static final String ENORME = "GG";

  String tamanho;

  public Camiseta(String tamanho) {
    this.tamanho = tamanho;
  }

  @Override
  public String toString() {
    return tamanho;
  }
}

public class TestaStatic {
  public static void main(String args[]) {
    Camiseta camisetaPequena = new Camiseta(Camiseta.PEQUENA);
    Camiseta camisetaMedia = new Camiseta(Camiseta.MEDIA);

    System.out.println("Sigla da camiseta camisetaPequena: " + camisetaPequena);
    System.out.println("Sigla da camiseta camisetaMedia: " + camisetaMedia);
  }
}
