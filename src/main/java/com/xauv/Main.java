package com.xauv;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author ling yue
 * @Date 2020/9/27 16:07
 * @Desc description
 */
@Slf4j
public class Main {
    public static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {
       // AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(processNickName("1234"));

    }

    private static String processNickName(String nickName) {
        if (StringUtils.isBlank(nickName)) {
            return "匿名用户";
        }
        char[] chars = nickName.toCharArray();
        if (chars.length == 1) {
            return String.valueOf(chars);
        }
        if (chars.length == 2) {
            chars[0] = '*';
            return String.valueOf(chars);
        }
        for (int i = 1; i <= chars.length - 2; i++) {
            chars[i] = '*';
        }
        nickName = String.valueOf(chars);
        return nickName;
    }
}