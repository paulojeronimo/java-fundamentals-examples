package pessoa.comandos;

import java.util.Scanner;

public class ComandoLerDoTeclado extends ComandoAbstrato {

    @Override
    public void executar(String[] args) {
        String line;
        do {
            System.out.print("> ");
            Scanner scanIn = new Scanner(System.in);
            line = scanIn.nextLine();
            args = line.split(" ");
            if (args[0].equals("lerDoTeclado")) {
                continue;
            }
            try {
                Comando.criar(args[0], getDAO()).executar(args);
            } catch (ComandoSair.Sair s) {
                break;
            } catch (Throwable t) {
                System.out.println("Erro na execução do comando: "
                        + t.getMessage());
            }
        } while (true);
    }

}
