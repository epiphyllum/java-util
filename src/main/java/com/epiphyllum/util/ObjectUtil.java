package com.epiphyllum.util;

import java.lang.reflect.Constructor;

/**
 * Created by hary on 15/12/10.
 */
public class ObjectUtil {

    @SuppressWarnings("unchecked")
    public static <T> T getObject(Class<T> tclass, String clsName, Object[] args) {
        try {
            Class klasss = Class.forName(clsName);
            Class[] klasses = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                klasses[i] = args[i].getClass();
            }
            Constructor<T> constructor = klasss.getConstructor(klasses);
            return constructor.newInstance(args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
