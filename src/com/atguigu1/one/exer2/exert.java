package com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-13 23:23
 */
public class exert {
    public static void main(String[] args) {
//        用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
//        {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
        String[] str = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        System.out.println(str[index-1]);
    }
}