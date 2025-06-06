package com.example.datastoregrpcmicroservice.config;

import java.util.Objects;

public class KeyHelper {

    private static final String defaultPrefix = "app";

    private static String prefix = null;

    public static void setPrefix(String keyPrefix) {
        prefix = keyPrefix;
    }

    public static String getKey(String key) {
        return getPrefix() + ":" + key;
    }

    public static String getPrefix() {
        return Objects.requireNonNullElse(prefix, defaultPrefix);
    }
}
