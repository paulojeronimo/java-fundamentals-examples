package pessoa.comandos;

public class ComandoObter implements Comando {

    @Override
    public void executar(String[] args) {
        System.out.println("Obtendo ...");
    }

}
