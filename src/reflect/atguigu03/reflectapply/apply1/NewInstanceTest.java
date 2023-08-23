package reflect.atguigu03.reflectapply.apply1;

import cnn.memory.Person;
import org.junit.Test;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-23 21:53
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException{

        Class clazz = Person.class;

        //创建Person类的实例
        Person per = (Person) clazz.newInstance();

        System.out.println(per);
    }
}