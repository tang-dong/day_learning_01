package cnn.method_more._03valuetransfer.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 20:52
 */
public class PassObject {
    public void printAreas(Circle c,int time){
        System.out.println("Radius\tArea" );
        for (int i = 1; i <= time; i++){
            System.out.print(i+"\t"+c.findArea(i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle c = new Circle();
        obj.printAreas(c,5);
    }
}