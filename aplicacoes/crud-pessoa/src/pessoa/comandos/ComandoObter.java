package pessoa.comandos;

import java.util.Arrays;
import pessoa.entidades.Pessoa;

public class ComandoObter extends ComandoAbstrato<Pessoa> {

    @Override
    public void executar(String[] args) {
        String id = args[0];
        try {
            System.out.println(getDAO().obter(
                    Integer.parseInt(id)));
        } catch (NumberFormatException e) {
            System.out.printf("id (%s) inválido!\n", id);
        }
    }

}
