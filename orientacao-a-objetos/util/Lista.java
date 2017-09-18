package util;

public interface Lista {
  boolean inserir(Object object);
  boolean contemObjetos();
  Object remover();
  void paraCadaItem(Operacao operacao); 
}
