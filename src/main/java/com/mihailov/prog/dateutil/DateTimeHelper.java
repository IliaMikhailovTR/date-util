package com.mihailov.prog.dateutil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeHelper {

    public static String toFormat(LocalDateTime val, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return val.format(formatter);
    }

    public static String toFormat(LocalDateTime val, DateTimePattern pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern.toString());
        return val.format(formatter);
    }

    public static LocalDateTime toLocalDateTime(String val, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(val, formatter);
    }

    public static LocalDateTime toLocalDateTime(String val, DateTimePattern pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern.toString());
        return LocalDateTime.parse(val, formatter);
    }
}
