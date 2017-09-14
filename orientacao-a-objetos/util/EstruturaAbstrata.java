package util;

abstract class EstruturaAbstrata {
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

  public abstract Object remover();

  public boolean temObjects() {
    return posicao > 0;
  } 
}
