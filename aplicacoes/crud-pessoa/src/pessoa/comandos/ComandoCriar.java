package pessoa.comandos;

import pessoa.entidades.ErroDeValidacao;
import pessoa.entidades.Pessoa;

public class ComandoCriar extends ComandoAbstrato<Pessoa> {

    @Override
    public void executar(String[] args) {
        if ((args == null) || ((args != null) && (args.length != 3)))
            throw new ErroDeValidacao("Favor informar: nome,idade,sexo");
        Pessoa pessoa = Pessoa.Builder(args[0])
                .idade(args[1])
                .sexo(args[2])
                .build();
        getDAO().criar(pessoa);
        System.out.println(getDAO().obter(pessoa.getId()));
    }

}