package com.atguigu4.search_sort.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 15:42
 */
public class Array_sear_exer_2 {
    public static void main(String[] args) {

//        案例：数组的缩容：
//
//        现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素。

        int[] arr={1,2,3,4,5,6,7};
//        for (int i = 4; i < arr.length - 1; i++) {
//            arr[i] = arr[i+1];
//        }
//
//        //修改最后一个元素
//        arr[arr.length - 1] = 0;

        //方式2：新建数组，新的数组的长度比原有数组的长度少1
        int newArr[] = new int[arr.length-1];

        for (int i = 0; i < 4; i++){
            newArr[i] = arr[i];
        }
        for (int i = 4; i < arr.length - 1; i++) {
            newArr[i] = arr[i+1];
        }

        //遍历
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + "\t");
        }
    }
}