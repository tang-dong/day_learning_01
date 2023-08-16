package ddl.atguigu05._super.exer1;

/**
 * ClassName: Kids
 * Description:
 *      修改方法重写的练习2中定义的类Kids中employeed()方法，在该方法中调用父类ManKind的employeed()方法，
 * 然后再输出"but Kids should study and no job."
 * @author Jack Tang
 * @create 2023-08-16 23:07
 */
public class Kids extends MainKind{
    private int yearsOld;

    public Kids(){

    }

    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld){
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){

        System.out.println("I am " + yearsOld + " years old.");
    }
    public void employeed(){
        super.employeed();
        System.out.println("but Kids should study and no job.");
    }
}