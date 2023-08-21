package datastructure.atguigu03.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-21 16:03
 */
public class MapTest {
    @Test
    public void test1(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("AA",123);

        System.out.println(map.get("AA"));
    }
}