package reflect.atguigu01.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-23 0:59
 */
public class ReflectionTest {
    /*
     * 使用反射之前可以执行的操作
     * */
    @Test
    public void test1(){
        Person p1 = new Person();
        System.out.println(p1);

        p1.age = 10;
        System.out.println(p1.age);

        p1.show();
    }

    /*
     * 使用反射完成上述的操作
     * */
    @Test
    public void test2() throws Exception{
        //1.创建Person类的实例
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
        System.out.println(p1);

        //2.调用属性  --- 在属性名中找到 age 的属性
        Field ageField = clazz.getField("age");
        ageField.set(p1,10);
        System.out.println(ageField.get(p1));

        //3.调用方法 ---- 在类名中找到 show 的方法
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(p1);
    }

    /*
     * 出了Person类之后，就不能直接调用Person类中声明的private权限修饰的结构（属性、方法、构造器）
     * 但是，我们可以通过反射的方式，调用Person类中私有的结构  ---> 暴力反射
     *
     * */
    @Test
    public void test3() throws Exception {
        //1. 调用私有的构造器，创建Person的实例
        Class clazz = Person.class;
        Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);
        Person p1 = (Person)cons.newInstance("Tom",12);
        System.out.println(p1);

        //2.调用私有的属性
        Field nameFiled = clazz.getDeclaredField("name");
        nameFiled.setAccessible(true);
        nameFiled.set(p1,"Jerry");
        System.out.println(nameFiled.get(p1)) ;

        //3.调用私有的方法
        Method showNationMethod = clazz.getDeclaredMethod("showNation", String.class);
        showNationMethod.setAccessible(true);
        String info = (String) showNationMethod.invoke(p1, "CHN");
        System.out.println(info);
    }

}