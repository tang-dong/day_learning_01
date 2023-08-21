package io.atguigu01.file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-21 17:45
 */
public class Exer02 {
    /*
     * 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
     * */
    @Test
    public void test1(){
        File dir = new File("playgirl.jpg");
        //方式1：
//        String[] listFiles = dir.list();
//        for (String s : listFiles){
//            if (s.endsWith(".png")){
//                System.out.println(s);
//            }
//        }

        //方式2：
        String[] listFiles = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {//name:即为子文件或子文件目录的名称
//                if(name.endsWith(".jpg")){
//                    return true;
//                }else{
//                    return false;
//                }

                return name.endsWith(".jpg");
            }
        });

        for(String s : listFiles){
            System.out.println(s);
        }
    }
}