package com.atguigu4.search_sort.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 16:10
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        arr = bubble_Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    //从小到大排序
    public static int[] bubble_Sort(int[] nums){
        boolean flag = true;  //假设数组已经是有序的
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    //如果数组发生了交换，说明数组还没有排好序
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return nums;
    }
}