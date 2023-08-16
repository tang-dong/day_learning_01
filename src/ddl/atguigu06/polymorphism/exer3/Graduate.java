package ddl.atguigu06.polymorphism.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-16 23:50
 */
public class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school +"\nmajor:"+major;
    }
}