package col_map.atguigu03.list.exer2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-20 16:59
 */
public class ListTest {
    public static void main(String[] args) {
        //1.创建集合，集合存放随机生成的30个小写字母
        ArrayList list = new ArrayList();

        for (int i = 0; i < 30; i++){
            //'a' - 'z'  [97,122]
            list.add((char)(Math.random() * (122 - 97 + 1) + 97) + " "); //随机生成数在 97 - 122 之间的数字
        }

        System.out.println(list);

        int aCount = listTest(list,"a");
        int bCount = listTest(list,"b");
        int cCount = listTest(list,"c");
        int xCount = listTest(list,"x");

        System.out.println("a:" + aCount);
        System.out.println("b:" + bCount);
        System.out.println("c:" + cCount);
        System.out.println("x:" + xCount);

    }

    public static int listTest(Collection coll, String s){
        int count = 0;
        for (Object o : coll){
            if (s.equals(o)) count++;
        }

        return count;
    }
}