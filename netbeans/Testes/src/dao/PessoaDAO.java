package dao;

import entidades.Pessoa;
import java.util.ArrayList;
import java.util.List;

// CRUD (CREATE, RETRIVE, UPDATE, DELETE) para a classe Pessoa
public class PessoaDAO implements DAO<Pessoa> {
    List<Pessoa> pessoas = new ArrayList<>();
    
    @Override
    public void criar(Pessoa pessoa) {
        pessoa.setId(pessoas.size()-1);
        pessoas.add(pessoa);
    }
    
    @Override
    public Pessoa obter(int id) {
        return pessoas.get(id);
    }
    
    @Override
    public void atualizar(Pessoa pessoa) {
        pessoas.set(pessoa.getId(), pessoa);
    }
    
    @Override
    public void remover(Pessoa pessoa) {
        pessoas.remove(pessoa.getId());
    }
}