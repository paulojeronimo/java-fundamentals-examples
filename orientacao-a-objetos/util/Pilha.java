package util;

public class Pilha {
  private int quantidade;
  private Object[] objects;
  private int posicao;

  public Pilha(int quantidade) {
    this.quantidade = quantidade;
    objects = new Object[quantidade];
  }

  public boolean inserir(Object object) {
    if (posicao >= quantidade)
      return false;
      
    objects[posicao++] = object;
    return true;
  }

  public Object remover() {
    if (temObjects())
      return objects[--posicao];
    return null;
  }

  public boolean temObjects() {
    return posicao > 0;
  }
}
