package pessoa.comandos;

import pessoa.dao.DAO;

public abstract class ComandoAbstrato<T> implements Comando<T> {
    private DAO<T> dao;
    
    @Override
    public void setDAO(DAO dao) {
        this.dao = dao;
    }

    @Override
    public DAO<T> getDAO() {
        return dao;
    }
}
