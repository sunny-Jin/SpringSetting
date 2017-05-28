package DAOImpl;

import DAO.InjectionDAO;

/**
 * Created by jzy on 2017/5/28.
 */
public class InjectionDAOImpl implements InjectionDAO {
    public void save(String arg) {
        System.out.println("数据保存"+arg);
    }
}
