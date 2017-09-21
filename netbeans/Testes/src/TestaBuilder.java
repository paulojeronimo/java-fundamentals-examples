
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

import entidades.Pessoa;
import static entidades.Pessoa.Sexo.*;

public class TestaBuilder {
    public static void main(String[] args) {
        Pessoa jair = Pessoa.Builder("Jair")
                .sexo(MASCULINO)
                .idade(25)
                .build();
        Pessoa ze = Pessoa.Builder("José")
                .idade(90)
                .build();
        Pessoa rodrigo = Pessoa.Builder("Rodrigo")
                .idade(1)
                .build();
        Pessoa roberio = Pessoa.Builder("Roberio")
                .idade(36)
                .sexo(FEMININO)
                .build();
        Pessoa manuel = Pessoa.Builder("Manuel")
                .idade(58)
                .sexo(MASCULINO)
                .build();
        Pessoa paulo = Pessoa.Builder("Paulo")
                .idade(43)
                .sexo(MASCULINO)
                .build();

        List<Pessoa> pessoas = Pessoa.getList();
        System.out.println("Todas as pessoas:");
        pessoas.forEach(System.out::println);

        Predicate<Pessoa> pessoasComMaisDe30 = (pessoa) -> pessoa.getIdade() > 30;
        Predicate<Pessoa> pessoasDoSexoIndefinido = (p) -> p.getSexo() == null;
        Predicate<Pessoa> pessoasDoSexoFeminino = (p) -> 
                p.getSexo() != null && p.getSexo().equals(Pessoa.Sexo.FEMININO);

        System.out.println("Pessoas com mais de 30 anos:");
        pessoas.stream()
                .filter(pessoasComMaisDe30)
                .forEach(System.out::println);
        
        System.out.println("Pessoas do sexo indefinido:");
        pessoas.stream()
                .filter(pessoasDoSexoIndefinido)
                .forEach(System.out::println);
        
        System.out.println("Pessoas do sexo feminino:");
        pessoas.stream()
                .filter(pessoasDoSexoFeminino)
                .forEach(System.out::println);
    }
}
