package com.atguigu2.two.exer2;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 0:42
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];

        int arr2[][] = new int[3][2];
        int arr3[][] = new int[4][3];

        //arr2 = arr1; //编译不通过，类型都不匹配
        //arr2 = arr3; //这个可行

        //arr2[0] = arr1; //这个也可行

        //arr2[0][0] = arr1;  //报错
        System.out.println(arr1); //[I@4554617c    int类型的一维数组
        System.out.println(arr2); //[[I@74a14482   int类型的二维数组



    }
}