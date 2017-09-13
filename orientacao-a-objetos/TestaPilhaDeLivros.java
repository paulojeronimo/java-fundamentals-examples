public class TestaPilhaDeLivros {
  public static void main(String[] args) {
    Autor autor1 = new Autor();
    autor1.nome = "Gelson Iezzi";

    Livro matematica1 = new Livro();
    matematica1.titulo = "Matematica 1";
    matematica1.autores = new Autor[] { autor1, new Autor() };
    matematica1.autores[1].nome = "Amigo do Gelson";

    Livro aOrigemDasEspecies = new Livro();
    aOrigemDasEspecies.titulo = "A Origem das Espécies";

    Pilha estante = new Pilha(2);
    estante.inserir(matematica1);
    estante.inserir(aOrigemDasEspecies);

    Livro livro = null;
    while (estante.temObjects()) {
      livro = (Livro) estante.remover();
      System.out.printf("Agora eu vou ler o livro \"%s\"\n", livro.titulo);
    }
  }
}
