package com.mihailov.prog.dateutil;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DateTimeHelperTest {

    @Test
    void toFormat1Test() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "dd.MM.yyyy HH:mm:ss";
        String expectedValue = "19.06.2021 14:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toFormat1TestNotEquals() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "dd.MM.yyyy HH:mm:ss";
        String expectedValue = "19.06.2025 18:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }


    @Test
    void toFormat2Test() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "yyyy.MM.dd HH:mm:ss";
        String expectedValue = "2021.06.19 14:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toFormat2TestNotEquals() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "yyyy.MM.dd HH:mm:ss";
        String expectedValue = "2025.06.19 18:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }


    @Test
    void toFormat3Test() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "dd.MM.yy HH:mm:ss";
        String expectedValue = "19.06.21 14:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toFormat3TestNotEquals() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "dd.MM.yy HH:mm:ss";
        String expectedValue = "19.06.25 18:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    void toFormat1EnumTest() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON;
        String expectedValue = "19.06.2021 14:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toFormat1EnumTestNotEquals() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON;
        String expectedValue = "19.06.2025 18:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }


    @Test
    void toFormat2EnumTest() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON_REVERSE;
        String expectedValue = "2021.06.19 14:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toFormat2EnumTestNotEquals() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON_REVERSE;
        String expectedValue = "2025.06.19 18:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }


    @Test
    void toFormat3EnumTest() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON_YEAR_TWO_DIGITS;
        String expectedValue = "19.06.21 14:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toFormat3EnumTestNotEquals() {
        LocalDateTime val = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON_YEAR_TWO_DIGITS;
        String expectedValue = "19.06.25 18:15:16";
        String actualValue = DateTimeHelper.toFormat(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime1Test() {
        String val = "19.06.2021 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "dd.MM.yyyy HH:mm:ss";
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime1TestNotEquals() {
        String val = "19.06.2025 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "dd.MM.yyyy HH:mm:ss";
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime2Test() {
        String val = "2021.06.19 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "yyyy.MM.dd HH:mm:ss";
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime2TestNotEquals() {
        String val = "2025.06.19 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "yyyy.MM.dd HH:mm:ss";
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime3Test() {
        String val = "19.06.21 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "dd.MM.yy HH:mm:ss";
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime3TestNotEquals() {
        String val = "19.06.25 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        String pattern = "dd.MM.yy HH:mm:ss";
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime1EnumTest() {
        String val = "19.06.2021 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON;
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime1EnumTestNotEquals() {
        String val = "19.06.2025 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON;
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime2EnumTest() {
        String val = "2021.06.19 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON_REVERSE;
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime2EnumTestNotEquals() {
        String val = "2025.06.19 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON_REVERSE;
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime3EnumTest() {
        String val = "19.06.21 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON_YEAR_TWO_DIGITS;
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toLocalDateTime3EnumTestNotEquals() {
        String val = "19.06.25 14:15:16";
        LocalDateTime expectedValue = LocalDateTime.of(2021, 6, 19, 14, 15, 16);
        DateTimePattern pattern = DateTimePattern.DATE_TIME_COMMON_YEAR_TWO_DIGITS;
        LocalDateTime actualValue = DateTimeHelper.toLocalDateTime(val, pattern);
        assertNotEquals(expectedValue, actualValue);
    }
}
