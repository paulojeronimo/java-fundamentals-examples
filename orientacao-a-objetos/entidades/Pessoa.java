package entidades;

public class Pessoa {
  private String nome;
  private int idade;
  private enum Sexo { MASCULINO, FEMININO };
  private Sexo sexo;

  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }

  // TODO: criar o restante dos gets e sets
}
