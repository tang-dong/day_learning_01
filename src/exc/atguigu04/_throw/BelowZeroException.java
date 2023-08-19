package exc.atguigu04._throw;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 14:43
 */
public class BelowZeroException extends Exception{

    static final long serialVersionUID = -3387516999948L;

    public BelowZeroException() {

    }

    public BelowZeroException(String name){
        super(name);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}