package com.atguigu2.two;

/**
 * 二维数组的基本使用（难点）
 *
 * @author 尚硅谷-宋红康
 * @create 13:08
 */
public class TwoArrayTest {
	public static void main(String[] args) {
		//1. 数组的声明与初始化

		// 方式一：静态初始化：数组变量的赋值和数组元素的赋值同时进行
		int[][] arr2 = new int[][]{{2,3,3},{4,5,5}};

		//方式二：动态初始化1：数组变量的赋值和数组元素的赋值分开进行
		int[][] arr = new int[2][3];
		//方式二：动态初始化2
		int[][] arr3 = new int[2][];

		//其他正确的写法
		int arr4[][] = new int[][]{{2,3},{4,5}};
		int[] arr5[] = new int[][]{{2,3},{4,5}};
		int arr6[][] = {{2,3},{4,5}};


		//2. 数组元素的调用
		System.out.println(arr2[0][1]);


		//3. 数组的长度
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);

		//4. 如何遍历数组
		for (int i = 0; i < arr2.length; i++)
		{
			for (int j = 0; j < arr2[0].length; j++)
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}


	}
}
