package com.ctrip.ccard.creditcard.vcc.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public  class JacksonUtil {

    private static ObjectMapper mapper = new ObjectMapper();
    private JacksonUtil(){}
    private static ObjectMapper getObjectMapper() {
        //忽略反序列化未知属性的异常
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        //允许解析非标准的JSON串，不带引号的
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        //属性未NULL 不参与序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapper;
    }

    public static String object2JsonString(Object object){
        try {
            ObjectMapper objectMapper = getObjectMapper();
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T>T str2Object(String content,Class<T> valueType){
        try {
            ObjectMapper objectMapper = getObjectMapper();
            return objectMapper.readValue(content,valueType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String,Object> object2Map(Object object){
        try {
            ObjectMapper objectMapper = getObjectMapper();
            String jsonStr = objectMapper.writeValueAsString(object);
            Map<String,Object> map = objectMapper.readValue(jsonStr,Map.class);
            return map;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
