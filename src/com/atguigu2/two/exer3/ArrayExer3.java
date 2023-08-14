package com.atguigu2.two.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 0:52
 */
public class ArrayExer3 {
    public static void main(String[] args)
    {
        String[][] employees = {
                {"10", "1", "段 誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵 敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨 过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭 靖", "25", "7100"},
                {"12", "12", "黄 蓉", "27", "9600", "4800"}
        };
        System.out.println("员工类型\t" + "编号\t" + "姓名\t" + "年龄\t" + "薪资\t" + "奖金\t" + "股票");
        for (int i = 0; i < employees.length; i++)
        {
            String employeeType = employees[i][0];
            switch (employeeType) {
                case "10":
                    System.out.print("普通职员\t");
                    break;
                case "11":
                    System.out.print("程序员\t");
                    break;
                case "12":
                    System.out.print("设计师\t");
                    break;
                case "13":
                    System.out.print("架构师\t");
                    break;
            }
            for (int j = 1; j < employees[i].length; j++)
            {
                System.out.print(employees[i][j] + "\t");
            }
            System.out.println();
        }
    }
}