package com.atguigu3.common_algorithm.exer2;


/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 14:10
 */

//案例：评委打分
//
//        分析以下需求，并用代码实现：
//
//        （1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5,4,6,8,9,0,1,2,7,3
//
//        （2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
public class Array_al_exer2 {
    public static void main(String[] args) {
        int[] score = new int[]{5,4,6,8,9,0,1,2,7,3};
        int sum = 0;
        int max = score[0];
        int min = score[0];
        for (int i = 0; i < score.length; i++)
        {
            sum += score[i];
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
        }
        sum = sum - max - min;
        System.out.println("选手最后得分为: " + sum/8.0);
    }
}