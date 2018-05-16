package com.fateking.nlp;

import com.baidu.aip.face.AipFace;
import com.fateking.nlp.utils.Base64Util;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fgm
 * @date 2018/5/15
 * @description
 */
public class FaceTests {


    //设置APPID/AK/SK
    public static final String APP_ID = "11244509";
    public static final String API_KEY = "itvCOpzO3QoRvfjxI1gjAcZB";
    public static final String SECRET_KEY = "IUHQRLvgCEKKZe7C2EYXhSlMYgaK1GA9";

    public static void main(String[] args) throws JSONException {
        // 初始化一个AipFace
        AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
        HashMap<String,String> options=new HashMap();
        options.put("face_field","age,beauty,expression,faceshape,gender,glasses,landmark,race,quality,facetype,parsing");


        // 调用接口
        String path= Base64Util.getBase64Image("/Users/fgm/hello_2018/nlp/src/main/resources/456.jpg");
               JSONObject res = client.detect(path, "BASE64",options);
        System.out.println(res.toString(2));

    }
}
