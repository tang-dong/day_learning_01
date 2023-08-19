package exc.atguigu04._throw;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 14:46
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        // CTRL+ALT+T
        try {
            s1.regist(10);
            s1.regist(-10);
            System.out.println(s1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

class Student{
    int id;

    public void regist(int id) throws Exception{
        if (id > 0){
            this.id = id;
        }else {
            throw new BelowZeroException("输入的id非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" + "id = " + id + "}";
    }
}