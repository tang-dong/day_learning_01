package oop.atguigu01._static.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 17:13
 */
public class AccountTest {
    public static void main(String[] args) {

        Account acc1 = new Account();
        System.out.println(acc1);

        Account acc2 = new Account("123456",2000);

        Account.setInterestRate(0.0123);
        Account.setMinBalance(10);

        System.out.println("银行存款的利率为：" + Account.getInterestRate());
        System.out.println("银行最小存款额度为：" + Account.getMinBalance());
    }
}