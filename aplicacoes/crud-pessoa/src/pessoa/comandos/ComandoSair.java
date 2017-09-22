package pessoa.comandos;

public class ComandoSair extends ComandoAbstrato {
    public class Sair extends RuntimeException {}
    
    @Override
    public void executar(String[] args) {
        throw new Sair();
    }

}
