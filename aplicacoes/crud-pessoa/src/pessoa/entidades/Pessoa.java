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
        return new Pessoa.Builder(nome.trim());
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

        public Pessoa.Builder sexo(final String sexo) {
            String sexoUppercase = sexo.trim().toUpperCase();
            switch (sexoUppercase) {
                case "M":
                case "MASCULINO":
                    return sexo(Sexo.MASCULINO);
                case "F":
                case "FEMININO":
                    return sexo(Sexo.FEMININO);
                default:
                    throw new ErroDeValidacao(
                        String.format("O sexo informado (%s) é inválido!", sexo));
            }
        }

        public Pessoa.Builder idade(String idade) {
            try {
                return idade(Integer.parseInt(idade.trim()));
            } catch (NumberFormatException e) {
                throw new ErroDeValidacao(
                        String.format("A idade (%s) informada é inválida!", idade));
            }
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
        return String.format("%d, %s, %s, %s", id, nome, idade, sexo);
    }

}
