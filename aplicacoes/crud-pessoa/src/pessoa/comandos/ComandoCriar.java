package pessoa.comandos;

import pessoa.entidades.Pessoa;

public class ComandoCriar extends ComandoAbstrato<Pessoa> {

    @Override
    public void executar(String[] args) {
        Pessoa pessoa = Pessoa.Builder(args[1]).build();
        getDAO().criar(pessoa);
        System.out.println(getDAO().obter(pessoa.getId()));
    }

}