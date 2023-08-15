package cnn.constructor.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 22:04
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int i, double b, double a){
        this.id = i;
        this.balance = b;
        this.annualInterestRate = a;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void widthdraw(double amount){
        if (amount < 0 | amount > balance) {
            System.out.println("余额不足，取款失败！");
        }else {
            this.balance = balance - amount;
            System.out.println("成功取出："+amount);
        }
    }

    public void deposit(double amount){
        this.balance = balance + amount;
        System.out.println("成功存入："+amount);
    }
}