import comandos.Comando;
import comandos.ComandoNaoEncontrado;

public class Pessoa {

    public static void main(String[] args) {
        if (args.length < 1 || args.length > 2) {
            new ComandoNaoEncontrado().executar(null);
            System.exit(0);
        }
        Comando.criar(args[0]).executar(args);
    }
}
