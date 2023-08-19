package api.atguigu02.stringmore.interview;

/**
 * @author shkstart
 * @create 23:21
 */
public class InterviewTest2 {
    public static void stringReplace(String text){ //这个不能改变原来的 textString
        text = text.replace('j','i');
    }
    public static void bufferReplace(StringBuffer text){
        text.append("C");
        text = new StringBuffer("Hello"); //重新创建了一个新地址
        text.append("World!");
    }

    public static void main(String[] args) {
        String textString = new String("java");
        StringBuffer textBuffer = new StringBuffer("java");

        stringReplace(textString);
        bufferReplace(textBuffer);

        System.out.println(textString + textBuffer);//

    }
}
