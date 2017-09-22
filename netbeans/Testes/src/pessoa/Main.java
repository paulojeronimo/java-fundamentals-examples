package pessoa;

import pessoa.comandos.Comando;
import pessoa.comandos.ComandoLerDoTeclado;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            new ComandoLerDoTeclado().executar(null);
            System.exit(0);
        }
        Comando.criar(args[0]).executar(args);
    }
}
