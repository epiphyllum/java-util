package com.epiphyllum.util;

/**
 * Created by hary on 15/12/10.
 */
public interface Enumerate<T>{
    T getValue();

    static <M extends Enum<M> & Enumerate<?>> M parse(Class<M> clazz, Object value) {
        for (M enumValue : clazz.getEnumConstants()) {
            if (enumValue.getValue().equals(value)) {
                return enumValue;
            }
        }
        throw new RuntimeException(String.format("No enum value for %s found from class %s", value, clazz.getSimpleName()));
    }
}
