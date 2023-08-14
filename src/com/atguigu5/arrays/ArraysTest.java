package com.atguigu5.arrays;

import java.util.Arrays;

/**
 * 
 * 测试数组的工具类：Arrays的使用 （了解）
 *
 * @author 尚硅谷-宋红康
 * @create 13:20
 */
public class ArraysTest {
	public static void main(String[] args) {
		//1. boolean equals(int[] a,int[] b)：比较两个数组的元素是否依次相等
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,3,4,5};

		System.out.println(arr1 == arr2); //这个比的是地址

		boolean isEquals = Arrays.equals(arr1,arr2); //这个比的是内容
		System.out.println(isEquals); //true

		//2. String toString(int[] a):输出数组元素信息。
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));

		//3.void fill(int[] a,int val):将指定值填充到数组之中。
		Arrays.fill(arr2,1);
		System.out.println(Arrays.toString(arr2));

		//4. void sort(int[] a):使用快速排序算法实现的排序
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));


		//5. int binarySearch(int[] a,int key):二分查找
		//使用前提：当前数组必须是有序的
		int index = Arrays.binarySearch(arr1, 2);
		System.out.println(index);


	}
}
