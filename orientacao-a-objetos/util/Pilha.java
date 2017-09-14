package util;

public class Pilha extends EstruturaAbstrata {
  public Pilha(int quantidade) {
    this.quantidade = quantidade;
    objects = new Object[quantidade];
  }

  @Override
  public boolean inserir(Object object) {
    if (posicao >= quantidade)
      return false;
      
    objects[posicao++] = object;
    return true;
  }

  @Override
  public Object remover() {
    if (temObjects())
      return objects[--posicao];
    return null;
  }

  @Override
  public boolean temObjects() {
    return posicao > 0;
  }
}
