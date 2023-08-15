package ddl.atguigu01._this.exer2;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 23:31
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("操","曹");
        bank.addCustomer("备","刘");

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);

        System.out.println("账户余额为：" + bank.getCustomer(0).getAccount().getBalance());
    }
}