package pessoa.comandos;

import java.util.Scanner;

public class ComandoLerDoTeclado implements Comando {

    @Override
    public void executar(String[] args) {
        String cmd;
        do {
            System.out.print("> ");
            Scanner scanIn = new Scanner(System.in);
            cmd = scanIn.nextLine();
            args = cmd.split(" ");
            if (args[0].equals("lerDoTeclado"))
                continue;
            try {
                Comando.criar(args[0]).executar(args);
            } catch (ComandoSair.Sair s) {
                break;
            } catch (Throwable t) {
                System.out.println("Erro na execução do comando:" + t.getMessage());
            }
        } while (true);
    }

}
