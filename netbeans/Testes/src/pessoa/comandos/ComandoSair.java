package pessoa.comandos;

public class ComandoSair implements Comando {
    public class Sair extends RuntimeException {}
    
    @Override
    public void executar(String[] args) {
        System.out.println("Saindo ...");
        throw new Sair();
    }

}
