package util;

abstract class EstruturaAbstrata implements Lista {
  protected int quantidade;
  protected Object[] objects;
  protected int posicao;

  protected EstruturaAbstrata(int quantidade) {
    this.quantidade = quantidade;
    objects = new Object[quantidade];
  }

  public boolean inserir(Object object) {
    if (posicao >= quantidade) return false;
    objects[posicao++] = object;
    return true;
  }

  public boolean contemObjetos() {
    return posicao > 0;
  } 

  public abstract Object remover();
}
