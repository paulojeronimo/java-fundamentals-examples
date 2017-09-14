import util.Fila;

public class FilaDeSenhas extends Fila {
  public FilaDeSenhas(int qtd) {
    super(qtd);
  }

  @Override
  public boolean inserir(Object senha) {
    System.out.println("Gerando a senha " + (Senha) senha);
    return super.inserir(senha);
  }

  public boolean temSenhas() {
    return contemObjetos();
  }
}
