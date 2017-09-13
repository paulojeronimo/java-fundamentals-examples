package util;

public class Pilha {
  int quantidade;
  Object[] objects;
  int posicao;

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
