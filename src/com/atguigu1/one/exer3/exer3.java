package com.atguigu1.one.exer3;

import java.util.Scanner;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-13 23:27
 */
public class exer3 {

    public static String isGrad(int score)
    {
        String status = "";
        if (score < 60) {
            status = "D";
        }else if (score >= 60 && score < 75) {
            status = "C";
        }else if (score >= 75 && score < 80) {
            status = "B";
        }else {
            status = "A";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int num_s = input.nextInt();  //学生人数
        int[] stu = new int[num_s];
        System.out.println("请输入" + num_s + "个成绩：");
        int max = 0;
        for (int i = 0; i < num_s; i++)
        {
            stu[i] = input.nextInt();
            if (stu[i] >= max) max = stu[i];
        }
        System.out.println("最高分是：" + max);
        for(int i = 0; i < num_s; i++)
        {
            System.out.println("student " + i + " score is " + stu[i] + "  grade is " + isGrad(stu[i]));
        }

    }
}