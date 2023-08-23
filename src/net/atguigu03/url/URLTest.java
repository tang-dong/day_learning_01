package net.atguigu03.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-23 0:34
 */
public class URLTest {
    public static void main(String[] args) {
        String str = "http://192.168.21.107:8080/examples/abcd.jpg?name=Tom";

        try {
            URL url = new URL(str);
        /*
            * - public String getProtocol( )   获取该URL的协议名
            - public String getHost( )      获取该URL的主机名
            - public String getPort( )      获取该URL的端口号
            - public String getPath( )      获取该URL的文件路径
            - public String getFile( )       获取该URL的文件名
            - public String getQuery(  )    获取该URL的查询名
        *
        * */

            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getPath());
            System.out.println(url.getFile());
            System.out.println(url.getQuery());


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}