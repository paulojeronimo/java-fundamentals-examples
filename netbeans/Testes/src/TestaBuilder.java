import java.util.List;
import java.util.ArrayList;

class Pessoa {
    private static List<Pessoa> pessoas = new ArrayList<>();
    
    public enum Sexo {MASCULINO, FEMININO};
    
    String nome; // obrigatório
    int idade; // opcional
    Sexo sexo; // opcional
    
    public String getNome(String nome) { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    
    public Sexo getSexo() { return sexo; }
    public void setSexo(Sexo sexo) { this.sexo = sexo; }
  
    private Pessoa(String nome) {
        this.nome = nome;
    }
    
    static Builder Builder(String nome) {
        Pessoa pessoa = new Pessoa(nome);
        pessoas.add(pessoa);
        return new Builder(pessoa);
    }

    static List<Pessoa> getList() {
        return pessoas;
    }
    
    static class Builder {
        Pessoa pessoa;
     
        public Builder(Pessoa pessoa) {
            this.pessoa = pessoa;
        }
        public Builder(String nome) {
            pessoa = new Pessoa(nome);
        }
        public Builder sexo(Sexo sexo) {
            pessoa.setSexo(sexo);
            return this;
        }
        public Builder idade(int idade) {
            pessoa.setIdade(idade);
            return this;
        }
        public Pessoa build() {
            return pessoa;
        }
    }
    
    @Override
    public String toString() {
        return nome;
    }
}

public class TestaBuilder {
    public static void main(String[] args) {
        Pessoa jair = Pessoa.Builder("Jair")
                .sexo(Pessoa.Sexo.MASCULINO)
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
                .sexo(Pessoa.Sexo.FEMININO)
                .build();
        Pessoa manuel = Pessoa.Builder("Manuel")
                .idade(58)
                .sexo(Pessoa.Sexo.MASCULINO)
                .build();
        Pessoa paulo = Pessoa.Builder("Paulo")
                .idade(43)
                .sexo(Pessoa.Sexo.MASCULINO)
                .build();
        
        List<Pessoa> pessoas = Pessoa.getList();
        System.out.println("Todas as pessoas:");
        pessoas.forEach(System.out::println);
        
        System.out.println("Pessoas com mais de 30 anos:");
        pessoas.stream()
            .filter((pessoa) -> pessoa.getIdade() > 30)
            .forEach(System.out::println);
    }
}