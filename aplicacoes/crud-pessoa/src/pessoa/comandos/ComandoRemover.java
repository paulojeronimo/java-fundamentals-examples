package pessoa.comandos;

import pessoa.entidades.Pessoa;

public class ComandoRemover extends ComandoAbstrato<Pessoa> {

    @Override
    public void executar(String[] args) {
        try {
            int id = Integer.parseInt(args[0]);
            Pessoa pessoa = getDAO().obter(id);
            getDAO().remover(pessoa);
        } catch (NumberFormatException e) {
            System.out.printf("id (%s) inválido!\n", args[1]);
        }
    }

}
