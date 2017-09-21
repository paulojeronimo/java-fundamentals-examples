
interface Comando {

    public void executar(String[] args);

    static Comando criar(String comando) {
        if (comando != null && comando.length() > 0) {
            char[] chars = comando.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            comando = String.valueOf(chars);
            try {
                return (Comando) Class.forName("Comando" + comando).newInstance();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
                //Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return new ComandoNaoEncontrado();
    }
}

class ComandoNaoEncontrado implements Comando {

    @Override
    public void executar(String[] args) {
        System.out.println("java Pessoa <criar|obter|remover|listar>");
    }
}

class ComandoCriar implements Comando {

    @Override
    public void executar(String[] args) {
        System.out.println("Criando ...");
    }
}

class ComandoObter implements Comando {

    @Override
    public void executar(String[] args) {
        System.out.println("Obtendo ...");
    }
}

class ComandoRemover implements Comando {

    @Override
    public void executar(String[] args) {
        System.out.println("Removendo ...");
    }
}

class ComandoListar implements Comando {

    @Override
    public void executar(String[] args) {
        System.out.println("Listando ...");
    }
}

public class Pessoa {

    public static void main(String[] args) {
        if (args.length < 1 || args.length > 2) {
            new ComandoNaoEncontrado().executar(null);
            System.exit(0);
        }
        Comando.criar(args[0]).executar(args);
    }
}
