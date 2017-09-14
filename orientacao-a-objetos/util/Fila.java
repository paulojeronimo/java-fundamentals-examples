package util;

public class Fila extends EstruturaAbstrata {
  public Fila(int quantidade) {
    this.quantidade = quantidade;
    objects = new Object[quantidade];
  }

  @Override
  public boolean inserir(Object object) {
    if (posicao >= quantidade) return false;
    objects[posicao++] = object;
    return true;
  }

  @Override
  public Object remover() {
    if (!temObjects()) return null;
    Object resultado = objects[0];
    posicao--;
    for (int i = 0; i < posicao; i++)
      objects[i] = objects[i+1];
    objects[posicao] = null;
    return resultado;
  }

  @Override
  public boolean temObjects() {
    return posicao > 0;
  }
}
