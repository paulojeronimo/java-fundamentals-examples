package comandos;

public class ComandoRemover implements Comando {

    @Override
    public void executar(String[] args) {
        System.out.println("Removendo ...");
    }

}
