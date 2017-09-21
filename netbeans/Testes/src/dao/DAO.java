package dao;

public interface DAO<T> {
    void atualizar(int id, T entidade);
    int criar(T entidade);
    T obter(int id);
    void remover(T entidade);
}
