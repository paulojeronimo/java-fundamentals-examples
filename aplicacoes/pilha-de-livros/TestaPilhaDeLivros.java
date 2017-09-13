import util.Pilha;
import entidades.Autor;
import entidades.Livro;

public class TestaPilhaDeLivros {
  public static void main(String[] args) {
    Autor autor1 = new Autor();
    autor1.setNome("Gelson Iezzi");

    Livro matematica1 = new Livro();
    matematica1.setTitulo("Matematica 1");
    matematica1.setAutores(new Autor[] { autor1, new Autor() });
    matematica1.getAutores()[1].setNome("Amigo do Gelson");

    Livro aOrigemDasEspecies = new Livro();
    aOrigemDasEspecies.setTitulo("A Origem das Espécies");

    Pilha estante = new Pilha(2);
    estante.inserir(matematica1);
    estante.inserir(aOrigemDasEspecies);

    Livro livro = null;
    while (estante.temObjects()) {
      livro = (Livro) estante.remover();
      System.out.printf("Agora eu vou ler o livro \"%s\"\n", livro.getTitulo());
    }
  }
}
