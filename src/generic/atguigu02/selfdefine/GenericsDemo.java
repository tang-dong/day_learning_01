package generic.atguigu02.selfdefine;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-21 0:59
 */

class Notepad<K,V>{       // 此处指定了两个泛型类型
    private K key ;     // 此变量的类型由外部决定
    private V value ;   // 此变量的类型由外部决定
    public K getKey(){
        return this.key ;
    }
    public V getValue(){
        return this.value ;
    }
    public void setKey(K key){
        this.key = key ;
    }
    public void setValue(V value){
        this.value = value ;
    }
}


public class GenericsDemo {
    public static void main(String[] args) {
        Notepad<String,Integer> t = new Notepad<String, Integer>();
        t.setKey("tom");
        t.setValue(20);
        System.out.println("姓名：" + t.getKey() + "\t年龄：" + t.getValue());

    }
}