package util;

public interface Lista<T> extends Iteravel {
  boolean inserir(T object);
  boolean contemObjetos();
  T remover();
}
