package oop.atguigu07._abstract.exer2;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 22:06
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;//月工资

    public SalariedEmployee() {
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary){
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String toString(){
        return "SalariedEmployee[" + super.toString() + "]";
    }
}