package pessoa.comandos;

import pessoa.entidades.Pessoa;

public class ComandoListar extends ComandoAbstrato<Pessoa> {

    @Override
    public void executar(String[] args) {
        getDAO().listar().forEach(System.out::println);
    }

}
