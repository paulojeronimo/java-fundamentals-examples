package pessoa.dao;

import java.util.Collection;

public interface DAO<T> {
    void atualizar(T entidade);
    void criar(T entidade);
    T obter(int id);
    void remover(T entidade);
    Collection<T> listar();
}