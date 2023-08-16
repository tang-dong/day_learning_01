package ddl.atguigu06.polymorphism.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-16 23:51
 */
public class InstanceTest {
    public static void main(String[] args) {

        InstanceTest test = new InstanceTest();

        test.method(new Student());
    }

    public void method(Person e){
        System.out.println(e.getInfo());

        //方式1：
//        if(e instanceof Graduate){
//            System.out.println("a graduated student");
//            System.out.println("a student");
//            System.out.println("a person");
//        }else if(e instanceof Student){
//            System.out.println("a student");
//            System.out.println("a person");
//        }else{
//            System.out.println("a person");
//        }

        // 方式2：
        if (e instanceof Graduate){
            System.out.println("a graduated student");
        }

        if(e instanceof Student){
            System.out.println("a student");
        }

        if(e instanceof Person){
            System.out.println("a person");
        }
    }
}