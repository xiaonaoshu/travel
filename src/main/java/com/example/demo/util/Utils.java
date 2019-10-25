package com.example.demo.util;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.DigestUtils;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 工具类
 */
public class Utils {

    public static final String hexDigits[] = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
    /**
     * md5加密
     * @param data
     */
    public static String getMd5Str(String data) {
        return DigestUtils.md5DigestAsHex(data.getBytes());
    }

    public static JSONObject getJsonResponse(HashMap<String, Object> data,Integer code) {
        return getJsonResponse(data, "请求成功",code);
    }

    public static JSONObject getJsonResponse(HashMap<String, Object> data, String message,Integer code) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", code);
        jsonObject.put("message", message);
        if (data != null) {
            jsonObject.put("data", new JSONObject(data));
        }
        return jsonObject;
    }
    public static JSONObject getJsonResponse(Integer code) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", "请求成功");
        jsonObject.put("code", code);
        return jsonObject;
    }

    private static String byteArrayToHexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }

        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    public static String MD5Encode(String origin, String charsetname) {
        String resultString = null;
        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charsetname == null || "".equals(charsetname)) {
                resultString = byteArrayToHexString(md.digest(resultString
                        .getBytes()));
            } else {
                resultString = byteArrayToHexString(md.digest(resultString
                        .getBytes(charsetname)));
            }
        } catch (Exception exception) {
        }
        return resultString;
    }

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("A");
        objects.add("B");
        objects.add("C");
        objects.add("D");
        objects.add("E");
        List<Object> objects1 = objects.subList(4, objects.size());
        System.out.println(objects1+""+objects.size());
    }
}
