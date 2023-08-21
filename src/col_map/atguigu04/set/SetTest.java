package col_map.atguigu04.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ClassName: SetTest
 * Description:
 *
 */
public class SetTest {
    @Test
    public void test1(){
        Set set = new HashSet();

        set.add("AA");
        set.add(123);
        set.add("BB");
        //当我们使用System.out.println()方法打印一个对象时，实际上会隐式地调用该对象的toString()方法。
        //这是因为println()方法需要将对象转换为字符串形式进行输出。
        System.out.println(new Person("Tom",12));
        System.out.println(new Person("Tom",12));
        //执行时会调用equals方法，还应重写hashCode()方法，以保证相等的对象具有相同的哈希码，以便在哈希表等数据结构中正常工作。
        set.add(new Person("Tom",12));
        set.add(new Person("Tom",12));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        System.out.println(set.contains(new Person("Tom", 12)));
    }

    @Test
    public void test2(){
        Set set = new LinkedHashSet();

        set.add("AA");
        set.add("AA");
        set.add(new Person("Tom",12));
        set.add(123);
        set.add("BB");

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
