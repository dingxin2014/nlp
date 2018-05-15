package com.fateking.nlp.character;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 *  文字识别
 */
@Component
public class CharacterRecognition {

    public static void main(String[] args) {
        process();
    }

    public static void process() {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr("11244497", "VnAAa6B1RGv0U05pUytqh3vk",
                "DEsmvKoucVD8h6qmYmWHNPobXTBxHhQq");

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);


        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "log4j.properties");

        // 调用接口
        String path = "/Users/dingxin/Dev/workspace/nlp/src/main/resources/static/test.jpg";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
    }

}
