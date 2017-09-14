package util;

public class Pilha extends EstruturaAbstrata {
  public Pilha(int quantidade) {
    super(quantidade);
  }

  @Override
  public Object remover() {
    return temObjects() ? objects[--posicao] : null;
  }
}
