public class Highlander {
  private static Highlander instance;
  private String nome;

  private Highlander(String nome) {
    this.nome = nome;
  }

  public static Highlander getInstance(String nome) {
    if (instance == null)
      instance = new Highlander(nome);
    return instance;
  }

  public String getNome() { return nome; }
}
