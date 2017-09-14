package util;

abstract class EstruturaAbstrata {
  protected int quantidade;
  protected Object[] objects;
  protected int posicao;

  public abstract boolean inserir(Object object);
  public abstract Object remover();
  public abstract boolean temObjects();
}
