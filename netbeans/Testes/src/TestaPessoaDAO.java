
import dao.DAO;
import dao.PessoaDAO;
import entidades.Pessoa;
import java.util.Collection;

public class TestaPessoaDAO {

    static void assertEquals(int valorEsperado, int valorObtido) {
        assertEquals(String.format("O valor esperado (%d) deveria ser igual a %d",
                valorEsperado, valorObtido), valorEsperado, valorObtido);
    }

    static void assertEquals(String msg, int valorEsperado, int valorObtido) {
        if (valorEsperado != valorObtido) {
            throw new RuntimeException(msg);
        }
    }

    static void assertNotNull(Object o) {
        assertNotNull("O objeto não deveria ser nulo", o);
    }
    
    static void assertNotNull(String msg, Object o) {
        if (o == null) {
            throw new RuntimeException(msg);
        }
    }

    static void testaCriarERemover() {
        System.out.println("testCriarERemover iniciado");

        DAO<Pessoa> dao = new PessoaDAO();

        Pessoa manuel = Pessoa.Builder("Manuel").build();
        dao.criar(manuel);
        assertEquals("O id do Manuel deveria ser 0", 0, manuel.getId());

        Pessoa jose = Pessoa.Builder("José").build();
        dao.criar(jose);
        assertEquals(1, jose.getId());

        dao.remover(manuel);

        Pessoa paulo = Pessoa.Builder("Paulo").build();
        dao.criar(paulo);
        assertEquals("O id do Paulo deveria ser 2", 2, paulo.getId());

        System.out.println("testCriarERemover finalizado com sucesso!");
    }

    public static void testaListar() {
        System.out.println("testaListar iniciado");

        DAO<Pessoa> dao = new PessoaDAO();

        Pessoa manuel = Pessoa.Builder("Manuel").build();
        dao.criar(manuel);
        Pessoa jose = Pessoa.Builder("José").build();
        dao.criar(jose);

        Collection<Pessoa> pessoas = dao.listar();
        assertNotNull("A coleção de pessoas não deveria ser nula", pessoas);
        assertEquals(2, pessoas.size());
        System.out.println("testaListar finalizado com sucesso!");
    }

    public static void main(String args[]) {
        try {
            testaCriarERemover();
            testaListar();
        } catch (Throwable t) {
            System.out.println("Algum teste falhou. Mensagem: " + t.getMessage());
        }
    }
}
