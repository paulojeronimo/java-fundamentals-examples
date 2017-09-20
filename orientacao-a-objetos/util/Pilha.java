package util;

public class Pilha<T> extends EstruturaAbstrata<T> {
  public Pilha(int quantidade) {
    super(quantidade);
  }

  @Override
  public T remover() {
    return contemObjetos() ? objects[--posicao] : null;
  }
}
