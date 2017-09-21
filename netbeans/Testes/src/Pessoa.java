public class Pessoa {
    public static void main(String[] args) {
        if (args.length < 1 || args.length > 2) {
            mostrarUtilizacao();
            System.exit(0);
        }
            
        switch (args[0]) {
            case "criar": criar(args); break;
            case "remover": remover(args); break;
            default:
                mostrarUtilizacao();
        }
    }

    private static void mostrarUtilizacao() {
        System.out.println("java Pessoa <criar|obter|remover|listar>");
    }

    private static void criar(String ... args) {
        System.out.println("Criando ...");
    }

    private static void remover(String ... args) {
        System.out.println("Removendo ...");
    }
}