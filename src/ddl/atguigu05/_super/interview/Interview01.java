package ddl.atguigu05._super.interview;

/**
 * 判断运行结果
 *
 */
public class Interview01 {

    public static void main(String[] args) {
        new A(new B());  // B  A  AB
    }
}

class A {
    public A() {
        System.out.println("A");
    }

    public A(B b) {
        this();
        System.out.println("AB");
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}

//class B extends A{
//    public B() {
//        System.out.println("B");
//    }
//}