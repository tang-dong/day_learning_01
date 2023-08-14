package com.atguigu3.common_algorithm.exer5;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 15:10
 */

//案例：
//        定义数组：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
//        如何实现数组元素的反转存储？你有几种方法。

public class Array_al_exer5 {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        //第一种
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int a : arr){
            System.out.print(a + "\t");
        }
        System.out.println();

        //第二种
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--){
            newArr[arr.length - 1 - i] = arr[i];
        }
        //遍历
        for (int a : newArr){
            System.out.print(a + "\t");
        }
    }
}