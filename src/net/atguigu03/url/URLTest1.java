package net.atguigu03.url;

import org.junit.Test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-23 0:39
 */
public class URLTest1 {
    /*
     * 需求：将URL代表的资源下载到本地
     * */
    @Test
    public void test1(){
        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;

        try {
            //1.获取URL实例
            URL url = new URL("http://127.0.0.1:8080/src/net/pic.jpg");
            //2.建立与服务器端的连接
            urlConnection = (HttpURLConnection) url.openConnection();
            //3.获取输入流、创建输出流
            is = urlConnection.getInputStream();
            File file = new File("src/net/dest.jpg");
            fos = new FileOutputStream(file);
            //4.读写数据
            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
            System.out.println("文件下载完成");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (is != null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (urlConnection != null){
                urlConnection.disconnect();
            }
        }
    }
}