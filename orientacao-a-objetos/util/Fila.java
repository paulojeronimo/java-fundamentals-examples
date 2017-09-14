package util;

public class Fila extends EstruturaAbstrata {
  public Fila(int quantidade) {
    super(quantidade);
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
}
