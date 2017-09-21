class Empresa {
  String nome;
  public Empresa(String nome) { this.nome = nome; }
  @Override
  public String toString() { return nome; }
  @Override
  public boolean equals(Object other) {
    /* Não escrevam assim! É feio!!
    if (this.nome.equals(other.nome))
      return true;
    else
      return false;
    */
    
    // Assim é mais bonito:
    if (other instanceof Empresa)
      return this.nome.equals(((Empresa)other).nome);
    return false;
  }
}

public class TestaComparacaoDeObjetos {
  public static void main(String[] a) {

    Empresa oracle = new Empresa("Oracle");
    //Empresa ibm = new Empresa("Oracle");
    Empresa ibm = new Empresa("IBM");

    if (oracle.equals(ibm)) {
      System.out.println("Oracle nao deveria ser a IBM!");
    } else {
      System.out.println("Oracle nao e IBM!");
    }     
  }
}
