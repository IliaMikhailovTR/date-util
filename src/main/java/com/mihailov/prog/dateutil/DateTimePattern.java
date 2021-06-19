package com.mihailov.prog.dateutil;

public enum DateTimePattern {
    DATE_TIME_COMMON("dd.MM.yyyy HH:mm:ss"),
    DATE_TIME_COMMON_REVERSE("yyyy.MM.dd HH:mm:ss"),
    DATE_TIME_COMMON_YEAR_TWO_DIGITS("dd.MM.yy HH:mm:ss");

    private final String pattern;

    DateTimePattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return pattern;
    }
}
