package cnn.method_more._02args;

/**
 * @author 尚硅谷-宋红康
 * @create 23:23
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();

    }

    public void print(int ... nums){
        System.out.println("1111");
    }
    //等价的
//    public void print(int[] nums){
//
//    }

    //可变个数的形参最多在一个方法的形参列表中出现一次
    public void print(int i, int ... nums){

    }

    //报错
//    public void print(int ... nums, int i){
//
//    }


}
