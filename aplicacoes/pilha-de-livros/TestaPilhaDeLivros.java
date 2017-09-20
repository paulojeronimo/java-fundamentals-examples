import util.Pilha;
import entidades.Autor;
import entidades.Livro;

public class TestaPilhaDeLivros {

  static String imprimeAutores(Autor[] autores) {
    if (autores == null)
      return "Desconhecido";
    StringBuilder sb = new StringBuilder();
    for(Autor autor: autores) {
      String nomeCompleto = autor.getNome();
      String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
      String ultimoNome = nomeCompleto.substring(nomeCompleto.indexOf(" ")+1);
      sb.append(ultimoNome);
      sb.append(", ");
      sb.append(primeiroNome);
      sb.append(" / ");
    }
    String result = sb.toString();
    return result.substring(0, result.lastIndexOf("/")-1);
  }

  public static void main(String[] args) {
    Autor autor1 = new Autor();
    autor1.setNome("Gelson Iezzi");

    Livro matematica1 = new Livro();
    matematica1.setTitulo("Matematica 1");
    matematica1.setAutores(new Autor[] { autor1, new Autor() });
    matematica1.getAutores()[1].setNome("Carlos Murakami");

    Livro aOrigemDasEspecies = new Livro();
    aOrigemDasEspecies.setTitulo("A Origem das Espécies");

    Pilha<Livro> estante = new Pilha<>(2);
    estante.inserir(matematica1);
    estante.inserir(aOrigemDasEspecies);

    System.out.println("Estes sao os livros na estante:");
    // impressão dos livros através de uma expressão lambda:
    estante.paraCadaItem(System.out::println);

    Livro livro = null;
    while (estante.contemObjetos()) {
      livro = estante.remover();
      System.out.printf("Agora eu vou ler o livro \"%s\" do(s) autor(es) \"%s\"\n",
        livro.getTitulo(), imprimeAutores(livro.getAutores()));
    }
  }
}
