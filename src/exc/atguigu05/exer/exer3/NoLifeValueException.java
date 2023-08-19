package exc.atguigu05.exer.exer3;

/**
 * ClassName: NoLifeValueException
 * Description:
 *     （1）自定义异常类NoLifeValueException继承RuntimeException
 *      ①提供空参和有参构造
 *      ②在有参构造中，需要调用父类的有参构造，把异常信息传入
 *
 * @author Jack Tang
 * @description
 * @create 2023-08-18 15:07
 */
public class NoLifeValueException extends RuntimeException{

    static final long serialVersionUID = -7034897190939L;
    public NoLifeValueException() {

    }

    public NoLifeValueException(String message) {
        super(message);
    }


}