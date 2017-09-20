package util;

abstract class EstruturaAbstrata<T> implements Lista<T> {
  protected int quantidade;
  protected T[] objects;
  protected int posicao;

  protected EstruturaAbstrata(int quantidade) {
    this.quantidade = quantidade;
    objects = (T[]) new Object[quantidade];
  }

  public void paraCadaItem(Operacao operacao) {
    for (Object o: objects) {
      operacao.executar(o);
    }
  }

  public boolean inserir(T object) {
    if (posicao >= quantidade) return false;
    objects[posicao++] = object;
    return true;
  }

  public boolean contemObjetos() {
    return posicao > 0;
  } 

  public abstract T remover();
}
