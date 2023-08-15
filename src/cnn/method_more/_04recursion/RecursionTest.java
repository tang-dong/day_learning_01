package cnn.method_more._04recursion;

/**
 * @author 尚硅谷-宋红康
 * @create 16:57
 */
public class RecursionTest {

    public static int getSum(int num){
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }

    //递归的方法
    public static int getSum1(int num){
        if (num == 1){
            return 1;
        }else {
            return getSum1(num-1) + num;
        }
    }

    public static void main(String[] args) {
        System.out.println(getSum(100));
    }

}
