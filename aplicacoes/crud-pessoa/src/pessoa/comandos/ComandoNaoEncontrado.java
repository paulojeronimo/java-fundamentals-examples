package pessoa.comandos;

public class ComandoNaoEncontrado extends ComandoAbstrato {
    
    @Override
    public void executar(String[] args) {
        System.out.println("Comando não encontrado!");
    }
    
}
