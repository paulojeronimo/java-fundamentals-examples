package pessoa;

import pessoa.comandos.Comando;
import pessoa.comandos.ComandoLerDoTeclado;
import pessoa.dao.DAO;
import pessoa.dao.PessoaDAO;
import pessoa.entidades.Pessoa;

public class Main {

    public static void main(String[] args) {
        DAO<Pessoa> dao = new PessoaDAO();
        if (args.length == 0) {
            Comando<Pessoa> comando = new ComandoLerDoTeclado();
            comando.setDAO(dao);
            comando.executar(null);
            System.exit(0);
        }
        Comando.criar(args[0], dao).executar(args);
    }
}
