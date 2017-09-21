
import dao.DAO;
import dao.PessoaDAO;
import entidades.Pessoa;

public class TestaPessoaDAO {
    static DAO<Pessoa> dao = new PessoaDAO();

    static void assertEquals(String msg, int valorEsperado, int valorObtido) {
        if (valorEsperado != valorObtido)
            throw new RuntimeException(msg);
    }
    
    static void testaCriar() {
        System.out.println("testCriar iniciado");

        Pessoa manuel = Pessoa.Builder("Manuel").build();
        dao.criar(manuel);
        assertEquals("O id do Manuel deveria ser 0", 0, manuel.getId());

        Pessoa jose = Pessoa.Builder("José").build();
        dao.criar(jose);
        assertEquals("O id do José deveria ser 1", 1, jose.getId());
        
        System.out.println("testCriar finalizado com sucesso!");
    }
    
    public static void main(String args[]) {
        try {
            testaCriar();
        } catch (Throwable t) {
            System.out.println("Algum teste falhou. Mensagem: " + t.getMessage());
        }
    }
}