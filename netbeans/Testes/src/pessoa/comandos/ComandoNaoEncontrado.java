package pessoa.comandos;

public class ComandoNaoEncontrado implements Comando {
    
    @Override
    public void executar(String[] args) {
        System.out.println("Comando não encontrado!");
    }
    
}
