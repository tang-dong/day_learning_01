package ddl.atguigu01._this.exer2;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 23:07
 */
public class Account {
    private double balance;

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if (amt < 0){
            System.out.println("输入错误！");
        }else {
            this.balance += amt;
            System.out.println("成功存入："+amt);
        }
    }

    public void withdraw(double amt){
        if (amt < 0 | amt > this.balance){
            System.out.println("输入错误或者余额不足！");
        }else {
            this.balance -= amt;
            System.out.println("成功取出：" + amt);
        }
    }
}