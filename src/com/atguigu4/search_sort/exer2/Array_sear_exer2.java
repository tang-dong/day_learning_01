package com.atguigu4.search_sort.exer2;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 15:54
 */

//案例2：二分法查找
//
//        定义数组：int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
//        查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
public class Array_sear_exer2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int num = 5;
        int left = 0;
        int right = arr.length;
        int index = -1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] > num){
                right = mid - 1;
            }else if (arr[mid] < num) {
                left = mid + 1;
            }else if (arr[mid] == num){
                index = mid;
                break;
            }
        }
        if (index == -1){
            System.out.println("查找失败！");
        }else {
            System.out.println("查找成功！索引为：" + index);
        }
    }
}