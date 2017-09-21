package dao;

import entidades.Pessoa;
import java.util.HashMap;
import java.util.Map;

// CRUD (CREATE, RETRIVE, UPDATE, DELETE) para a classe Pessoa
public class PessoaDAO implements DAO<Pessoa> {
    Map<Integer, Pessoa> pessoas = new HashMap<>();
    private static int proximoId;
    
    @Override
    public void criar(Pessoa pessoa) {
        pessoa.setId(proximoId++);
        pessoas.put(pessoa.getId(), pessoa);
    }
    
    @Override
    public Pessoa obter(int id) {
        return pessoas.get(id);
    }
    
    @Override
    public void atualizar(Pessoa pessoa) {
        pessoas.put(pessoa.getId(), pessoa);
    }
    
    @Override
    public void remover(Pessoa pessoa) {
        pessoas.remove(pessoa.getId());
    }
}