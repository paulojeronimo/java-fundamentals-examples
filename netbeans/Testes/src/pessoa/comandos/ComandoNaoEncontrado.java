package pessoa.comandos;

public class ComandoNaoEncontrado implements Comando {
    
    @Override
    public void executar(String[] args) {
        System.out.println("java Pessoa <criar|obter|remover|listar>");
    }
    
}
