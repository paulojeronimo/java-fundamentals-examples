package comandos;

public class ComandoListar implements Comando {

    @Override
    public void executar(String[] args) {
        System.out.println("Listando ...");
    }

}
