package pessoa.comandos;

import java.util.Arrays;
import pessoa.entidades.Pessoa;

public class ComandoObter extends ComandoAbstrato<Pessoa> {

    @Override
    public void executar(String[] args) {
        System.out.println(Arrays.toString(args));
        String id = args[1];
        try {
            System.out.println(getDAO().obter(
                    Integer.parseInt(id)));
        } catch (NumberFormatException e) {
            System.out.printf("id (%s) inválido!\n", id);
        }
    }

}
