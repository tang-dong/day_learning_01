package generic.atguigu02.selfdefine;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-21 1:07
 */
interface Info<T>{  // 在接口上定义泛型
    public T getVar(); // 定义抽象方法，抽象方法的返回值就是泛型类型
}

class InfoImpl<T> implements Info<T> {
    private T var;

    public InfoImpl(T var){
        this.setVar(var);
    }

    @Override
    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}

public class GenericsDemo1{
    public static void main(String[] args) {
        Info<String> i = new InfoImpl<String>("Tom");
        System.out.println("内容：" + i.getVar());
    }

}