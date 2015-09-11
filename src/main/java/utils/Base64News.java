package utils;

import exception.Loger;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @author GQY
 *         Base64 编码
 *         Created by GQY on 2015/9/11.
 */
public class Base64News extends Loger {
    public static String getEncodString(String string) {
        Base64.Encoder encode = Base64.getEncoder();
        try {
            return encode.encodeToString(string.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            logger.error("Base64 加密错误！", e);
            return null;
        }
    }

    public static String getDecodeString(String string) {
        Base64.Decoder decoder = Base64.getDecoder();
        try {
            return new String(decoder.decode(string.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            logger.error("Base64 解密错误！", e);
            return null;
        }
    }
}
