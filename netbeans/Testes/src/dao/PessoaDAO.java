package dao;

import entidades.Pessoa;

// CRUD (CREATE, RETRIVE, UPDATE, DELETE) para a classe Pessoa
public class PessoaDAO implements DAO<Pessoa> {
    @Override
    public int criar(Pessoa pessoa) {
        return 0;
    }
    
    @Override
    public Pessoa obter(int id) {
        return null;
    }
    
    @Override
    public void atualizar(int id, Pessoa pessoa) {
        
    }
    
    @Override
    public void remover(Pessoa pessoa) {
        
    }
}