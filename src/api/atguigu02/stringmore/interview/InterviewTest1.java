package api.atguigu02.stringmore.interview;

/**
 * @author shkstart
 * @create 23:08
 */
public class InterviewTest1 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");

        operate(a, b);

        System.out.println(a + "," + b);//AB,ABx
    }

    public static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x; //这个是直接将x的地址值赋值给了y
        y.append('x');
    }
}
