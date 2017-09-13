public class Vinho {
  String nome;
  String origem;
  String uva;
  String sabor;
  String cor;
  int ano;

  public Vinho(String nome, String origem, String uva, String sabor, String cor) {
    this.nome = nome;
    this.origem = origem;
    this.uva = uva;
    this.sabor = sabor;
    this.cor = cor;
  }

  void engarrafar(int ano) {
    System.out.printf("Engarrafando o vinho \"%s\" em %d\n", nome, ano);
    this.ano = ano;
  }

  void abrir() {
  }
}
