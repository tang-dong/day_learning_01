package com.atguigu4.search_sort.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 15:35
 */
//案例1：数组的扩容:
//
//        现有数组 int[] arr = new int[]{1,2,3,4,5};
//        现将数组长度扩容1倍，并将10,20,30三个数据添加到arr数组中，如何操作?
    //    对重新创建一个新的数组，然后将元素一个一个重新的复制进去
public class Array_sear_exer1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        //扩容一倍
        int[] newArr = new int[arr.length << 1];
        //或
        //int[] newArr = new int[arr.length * 2];

        //将原来的数组中的元素复制到新的数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length + 1 - 1] = 10;
        newArr[arr.length + 2 - 1] = 20;
        newArr[arr.length + 3 - 1] = 30;

        for (int i = 0; i < arr.length + 3; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}