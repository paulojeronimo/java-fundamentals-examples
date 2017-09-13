package entidades;

public class Livro {
  private String titulo;
  private String genero;
  private String ISBN;
  private Autor[] autores;

  public String getTitulo() { return titulo; }
  public void setTitulo(String titulo) { this.titulo = titulo; }

  public Autor[] getAutores() { return autores; }
  public void setAutores(Autor[] autores) { this.autores = autores; }

  // TODO: criar o restante dos gets e sets
}
