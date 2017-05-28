package ServiceImpl;

import DAO.InjectionDAO;
import Service.InjectionService;

/**
 * Created by jzy on 2017/5/28.
 */
public class InjectionServiceImpl  implements InjectionService{

    private InjectionDAO injectionDAO;

    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public void save(String arg)
    {
        System.out.println("Service接收参数："+arg);
        arg=arg+":"+this.hashCode();
        injectionDAO.save(arg);
    }
}
