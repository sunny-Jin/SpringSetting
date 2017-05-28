package ServiceImpl;

/**
 * Created by jzy on 2017/5/28.
 */
public class HelloWorld {
    private String name;

    public void setName(String name)
    {
        this.name=name;
    }

    public void hello()
    {
        System.out.println("你好:"+this.name);
    }
}
