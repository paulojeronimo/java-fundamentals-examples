package pessoa.entidades;

public class ErroDeValidacao extends RuntimeException {
    public ErroDeValidacao(String msg) {
        super(msg);
    }
}
