package com.javaspringwebsocket.helper;

import com.google.gson.Gson;

public class JsonToObject {
    public  static <T> T toObject(String json, Class<T> clazz) {
        Gson gson = new Gson();
        return gson.fromJson(json, clazz);
    }
}
