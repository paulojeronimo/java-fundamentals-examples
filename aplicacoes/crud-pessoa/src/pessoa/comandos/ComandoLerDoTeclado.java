package pessoa.comandos;

import java.util.Scanner;
import pessoa.entidades.ErroDeValidacao;

public class ComandoLerDoTeclado extends ComandoAbstrato {

    @Override
    public void executar(String[] args) {
        String line;
        do {
            System.out.print("> ");
            Scanner scanIn = new Scanner(System.in);
            line = scanIn.nextLine().trim();
            String cmd = line;
            if (line.indexOf(" ") > 0) {
                args = new String[2];
                args[0] = cmd.substring(0, line.indexOf(" "));
                args[1] = cmd.substring(line.indexOf(" ") + 1, line.length());
                cmd = args[0];
                args = args[1].split(",");
            }
            if (cmd.equals("lerDoTeclado")) {
                continue;
            }
            try {
                Comando.criar(cmd, getDAO()).executar(args);
                args = null;
            } catch (ComandoSair.Sair s) {
                break;
            } catch (ErroDeValidacao e) {
                System.out.println(e.getMessage());
            } catch (Throwable t) {
                System.out.println("Erro na execução do comando: "
                        + t.getMessage());
            }
        } while (true);
    }

}
