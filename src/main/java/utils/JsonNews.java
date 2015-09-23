package utils;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import exception.Loger;

import java.io.IOException;
import java.util.Map;

/**
 * @author GQY
 *         json工具类，处理json
 *         Created by GQY on 2015/9/16.
 */
public class JsonNews {
    private static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
    }

    /**
     * Json 转Object
     *
     * @param jsonString json 字符串
     * @param objClass   接收对象
     * @return 返回对象
     */
    public static Object jsonToObject(final String jsonString, Class<?> objClass) {
        try {
            return objectMapper.readValue(jsonString, objClass);
        } catch (IOException e) {
            Loger.logger.warn("Json->Object解码错误！");
            return null;
        }
    }

    /**
     * object 转json
     * @param jsonObject 需要转化的obj对象
     * @return 转化后的json字符串
     */
    public static String objectToJson(Object jsonObject){
        try {
            return objectMapper.writeValueAsString(jsonObject);
        } catch (JsonProcessingException e) {
            Loger.logger.warn("Map->String解码错误！");
        }
        return null;
    }
}
