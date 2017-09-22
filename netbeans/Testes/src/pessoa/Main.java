package pessoa;

import pessoa.comandos.Comando;
import pessoa.comandos.ComandoNaoEncontrado;

public class Main {

    public static void main(String[] args) {
        if (args.length < 1 || args.length > 2) {
            new ComandoNaoEncontrado().executar(null);
            System.exit(0);
        }
        Comando.criar(args[0]).executar(args);
    }
}
