package com.atguigu3.common_algorithm.exer4;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 14:57
 */

//案例：
//
//        使用简单数组
//        (1)创建一个的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
//        (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
//        (3)显示array1的内容。
//        (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。
//        (5)打印出array1。
//
//        思考：array1和array2是什么关系？
//        【answer】array1和array2是两个变量，共同指向了堆空间中的同一个数组结构。即二者的地址值相同。
//
//        拓展：修改题目，实现array2对array1数组的复制

public class Array_al_exer4 {
    public static void main(String[] args) {
        //1.创建一个的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
        int[] array1,array2,array3;
        //2.使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
        array1 = new int[]{2,3,5,7,11,13,17,19};
        //3.显示array1的内容。
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        //4.赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。
//        array2 = array1;
//        for (int i = 0; i < array2.length; i++) {
//            if (i % 2 == 0) array2[i] = i;
//        }
//        System.out.println();
//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2[i] + "\t");
//        }

        System.out.println();
        //5.array3对array1进行复制，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。
        array3 = new int[array1.length];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}