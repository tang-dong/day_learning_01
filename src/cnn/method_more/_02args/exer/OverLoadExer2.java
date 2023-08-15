package cnn.method_more._02args.exer;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 20:02
 */
public class OverLoadExer2 {
//    练习：可变形参的方法
//    n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
    public String concat(String operator, String ...strs){
        String result = "";

        for (int i = 0; i < strs.length; i++){
            if (i == 0){
                result += strs[i];
            }else {
                result += (operator + strs[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        OverLoadExer2 test = new OverLoadExer2();
        String info = test.concat("-","hello","world");
        System.out.println(info); //hello-world

        System.out.println(test.concat("/","hello"));
        System.out.println(test.concat("-"));

    }
}