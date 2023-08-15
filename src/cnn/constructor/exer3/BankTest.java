package cnn.constructor.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 22:11
 */
public class BankTest {
    public static void main(String[] args) {
        Account account = new Account(1000,2000,0.0123);
        Customer cust = new Customer("Jane","Smith");

        cust.setAccount(account);
        account.deposit(100);
        account.widthdraw(960);
        account.widthdraw(2000);

        System.out.println("Customer ["+ cust.getFirstName()+ "," + cust.getLastName() + "] has a account: id is " + account.getId() +
                ", annualInterestRate is "+ account.getAnnualInterestRate() + ", balance is 1140.0");
    }
}