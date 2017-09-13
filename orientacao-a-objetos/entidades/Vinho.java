package entidades;

public class Vinho {
  private String nome;
  private String origem;
  private String uva;
  private String sabor;
  private String cor;
  private int ano;

  public Vinho(String nome, String origem, String uva, String sabor, String cor) {
    this.nome = nome;
    this.origem = origem;
    this.uva = uva;
    this.sabor = sabor;
    this.cor = cor;
  }

  public void engarrafar(int ano) {
    System.out.printf("Engarrafando o vinho \"%s\" em %d\n", nome, ano);
    this.ano = ano;
  }

  public void abrir() {
  }

  public String getNome() {
    return nome;
  }

  public int getAno() {
    return ano;
  }
}
