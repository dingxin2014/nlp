package com.fateking.nlp.utils;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author fgm
 * @date 2018/5/15
 * @description
 */
public class Base64Util {

    public static String getBase64Image(String imgPath) {
        InputStream in = null;
        byte[] data = null;
        // 读取图片字节数组
        try {
            in = new FileInputStream(imgPath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        // 返回Base64编码过的字节数组字符串
        return encoder.encode(data);
    }


    public static void main(String[] args) {
        String ss = getBase64Image("/Users/fgm/hello_2018/nlp/src/main/resources/123.png");
        System.out.println(ss);

    }


}
