import util.Fila;

public class Caixa {
  FilaDeSenhas fila;

  public Caixa(Fila fila) {
    this.fila = (FilaDeSenhas) fila;
  } 

  boolean temAtendimentoAFazer() {
    return fila.temSenhas();
  }

  void atender() {
    Senha senha = (Senha) fila.remover();
    System.out.println("Atendendo a senha " + senha);
  }
}
