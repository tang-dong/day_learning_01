package reflect.atguigu03.reflectapply.apply2;

import reflect.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author shkstart
 * @create 14:45
 */
public class OtherTest {

    //（熟悉）获取运行时类的内部结构2：父类、接口们、包、带泛型的父类、父类的泛型等
    //1. 获取运行时类的父类
    @Test
    public void test1() throws ClassNotFoundException{
        Class clazz = Class.forName("reflect.atguigu03.reflectapply.data.Person");
        Class superClass = clazz.getSuperclass();
        System.out.println(superClass);
    }
    //2. 获取运行时类实现的接口
    @Test
    public void test2() throws ClassNotFoundException{
        Class clazz = Class.forName("reflect.atguigu03.reflectapply.data.Person");

        Class[] interfaces = clazz.getInterfaces();
        for (Class c : interfaces){
            System.out.println(c);
        }
    }
    //3. 获取运行时类所在的包
    @Test
    public void test3() throws ClassNotFoundException{
        Class clazz = Class.forName("reflect.atguigu03.reflectapply.data.Person");

        Package pkg = clazz.getPackage();
        System.out.println(pkg);

    }
    //4. 获取运行时类的带泛型的父类
    @Test
    public void test4() throws ClassNotFoundException{
        Class clazz = Class.forName("reflect.atguigu03.reflectapply.data.Person");
        Type subclass = clazz.getGenericSuperclass();
        System.out.println(subclass);
    }

    //5. 获取运行时类的父类的泛型 (难)
    @Test
    public void test5() throws ClassNotFoundException{
        Class clazz = Class.forName("reflect.atguigu03.reflectapply.data.Person");
        //获取带泛型的父类（Type是一个接口，class实现了次接口）
        Type superclass = clazz.getGenericSuperclass();
        //如果父类是带泛型的，则可以转为ParameterizedType
        ParameterizedType paramType = (ParameterizedType) superclass;
        //调用getActualTypeArguments()获取泛型的参数，结果是一个数组，因为可能有多个泛型参数
        Type[] arguments = paramType.getActualTypeArguments();
        //获取泛型参数的名称
        System.out.println(((Class)arguments[0]).getName());
    }


}
