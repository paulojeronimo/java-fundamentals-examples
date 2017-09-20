package entidades;

public class Livro {
  private String titulo;
  private String genero;
  private String ISBN;
  private Autor[] autores;

  public String getTitulo() { return titulo; }
  public void setTitulo(final String titulo) { this.titulo = titulo; }

  public Autor[] getAutores() { return autores; }
  public void setAutores(final Autor[] autores) { this.autores = autores; }

  // TODO: criar o restante dos gets e sets

  @Override
  public String toString() {
    return titulo;
  }
}
