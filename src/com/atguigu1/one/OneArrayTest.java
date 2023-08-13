package com.atguigu1.one;

/**
 * 一维数组的基本使用
 */
public class OneArrayTest {
	
	public static void main(String args[]) {
		//1. 数组的声明与初始化
		//1.1 数组的声明
		double[] price;
		//1.2 数组的初始化
		price = new double[]{12.11,13.22,15.65,66.56};

		String[] foods;
//		foods = new String[4]{"拌海蜇","龙须菜","炝冬笋","玉兰片"};

		foods = new String[4];
		foods[0] = "拌海蜇"; foods[1] = "龙须菜"; foods[2] = "炝冬笋"; foods[3] = "玉兰片";

		//其他正确的方式
		int arr[] = new int[4];
		int[] arr1 = {1,2,3,4};

		//2. 数组元素的调用
		System.out.println(foods[0]);

		//3. 数组的长度
		System.out.println(price.length);

		//4. 如何遍历数组


	}

}
