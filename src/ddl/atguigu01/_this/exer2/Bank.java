package ddl.atguigu01._this.exer2;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 23:08
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        customers = new Customer[10];
    }

    public void addCustomer(String f, String l){
        Customer cust = new Customer(f,l);
        customers[numberOfCustomer++] = cust;
    }

    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }

    //获取索引位上的客户
    public  Customer getCustomer(int index){
        if (index < 0 || index >= numberOfCustomer){
            return null;
        }
        return customers[index];
    }
}