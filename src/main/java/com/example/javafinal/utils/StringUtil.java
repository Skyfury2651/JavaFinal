package com.example.javafinal.utils;

import java.util.UUID;

public class StringUtil {
    public static String generateAccessToken(){
        return UUID.randomUUID().toString();
    }
}
