package com.atguigu2.two;

/*
 * 二维数组的基本使用（难点） （承接TwoArrayTest.java）
 * 
 *  @author 尚硅谷-宋红康
 *  @create 13:18
 * 
 */

public class TwoArrayTest1 {
	public static void main(String[] args) {

		//5. 数组元素的默认初始化值
		int arr[][] = new int[3][4];
		System.out.println(arr[0]); //地址值
		System.out.println(arr[0][1]); //初始为0

		int arr2[][] = new int[3][];
		System.out.println(arr2[0]); //null
		//System.out.println(arr2[0][1]); //报错

		//6. 数组的内存解析


	}
}
