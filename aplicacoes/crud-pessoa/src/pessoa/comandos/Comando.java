package pessoa.comandos;

import pessoa.dao.DAO;

public interface Comando<T> {

    public void executar(String[] args);

    public void setDAO(DAO<T> dao);
    public DAO<T> getDAO();
    
    static <T> Comando criar(String comando, DAO<T> dao) {
        
        if (comando != null && comando.length() > 0) {
            char[] chars = comando.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            comando = String.valueOf(chars);
            try {
                Comando objComando = (Comando) Class.forName(
                        Comando.class.getPackage().getName()
                        + ".Comando" + comando).newInstance();
                objComando.setDAO(dao);
                return objComando;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
                //Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return new ComandoNaoEncontrado();
    }

}
