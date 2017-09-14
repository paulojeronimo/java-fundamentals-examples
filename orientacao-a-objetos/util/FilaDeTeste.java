package util;

public class FilaDeTeste extends Fila {
  public FilaDeTeste(int qtd) {
    super(qtd);
  }

  @Override
  public boolean inserir(Object cor) {
    System.out.println("Inserindo a cor" + cor + " na fila");
    return super.inserir(cor);
  }

  @Override
  public Object remover() {
    Cor cor = (Cor) super.remover();
    System.out.println("Removendo a cor " + cor + " da fila");
    return cor;
  }
}
