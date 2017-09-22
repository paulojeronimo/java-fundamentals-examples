package pessoa.comandos;

public class ComandoCriar implements Comando {

    @Override
    public void executar(String[] args) {
        System.out.println("Criando ...");
    }

}