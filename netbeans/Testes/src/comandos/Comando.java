package comandos;

public interface Comando {

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
