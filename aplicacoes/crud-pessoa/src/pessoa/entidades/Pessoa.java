package pessoa.entidades;

public class Pessoa {

    public enum Sexo {
        MASCULINO, FEMININO
    }
    private int id; // gerado
    private String nome; // obrigatório
    private int idade; // opcional
    private Pessoa.Sexo sexo; // opcional

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa.Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Pessoa.Sexo sexo) {
        this.sexo = sexo;
    }

    private Pessoa(String nome) {
        this.nome = nome;
    }

    public static Pessoa.Builder Builder(String nome) {
        return new Pessoa.Builder(nome);
    }

    public static class Builder {

        Pessoa pessoa;

        public Builder(Pessoa pessoa) {
            this.pessoa = pessoa;
        }

        public Builder(String nome) {
            pessoa = new Pessoa(nome);
        }

        public Pessoa.Builder sexo(Pessoa.Sexo sexo) {
            pessoa.setSexo(sexo);
            return this;
        }

        public Pessoa.Builder idade(int idade) {
            pessoa.setIdade(idade);
            return this;
        }

        public Pessoa build() {
            return pessoa;
        }
    }

    @Override
    public String toString() {
        return String.format("%d, %s", id, nome);
    }

}
