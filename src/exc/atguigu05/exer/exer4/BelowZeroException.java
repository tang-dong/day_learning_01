package exc.atguigu05.exer.exer4;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 15:29
 */
public class BelowZeroException extends Exception{

    static final long serialVersionUID = -33875169939948L;

    public BelowZeroException() {

    }

    public BelowZeroException(String message) {
        super(message);
    }

}