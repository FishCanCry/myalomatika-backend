package com.cryfish.myalomatika.list;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public enum Level {

    LEVEL_1(1, "Просто 4", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4});
        put(1, new Integer[]{-1, 1, 2, 3});
        put(2, new Integer[]{-2, -1, 1, 2});
        put(3, new Integer[]{-3, -2, -1, 1});
        put(4, new Integer[]{-4, -3, -2, -1});
        put(5, ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY);
        put(6, ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY);
        put(7, ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY);
        put(8, ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY);
        put(9, ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY);
    }}),
    LEVEL_2(2, "Просто 5", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4, 5});
        put(1, new Integer[]{-1, 1, 2, 3, 4, 5});
        put(2, new Integer[]{-2, -1, 1, 2, 5});
        put(3, new Integer[]{-3, -2, -1, 1, 5});
        put(4, new Integer[]{-4, -3, -2, -1, 5});
        put(5, new Integer[]{-5, 1, 2, 3, 4});
        put(6, new Integer[]{-1, -5, 1, 2, 3});
        put(7, new Integer[]{-1, -2, -5, 1, 2});
        put(8, new Integer[]{-1, -2, -3, -5, 1});
        put(9, new Integer[]{-1, -2, -3, -4, -5});
    }}),
    LEVEL_3(3, "Просто 6", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4, 5, 6});
        put(1, new Integer[]{-1, 1, 2, 3, 5, 6});
        put(2, new Integer[]{-1, -2, 1, 2, 5, 6});
        put(3, new Integer[]{-1, -2, -3, 1, 5, 6});
        put(4, new Integer[]{-1, -2, -3, -4, 5});
        put(5, new Integer[]{-5, 1, 2, 3, 4});
        put(6, new Integer[]{-1, -5, -6, 1, 2, 3});
        put(7, new Integer[]{-1, -2, -5, -6, 1, 2});
        put(8, new Integer[]{-1, -2, -3, -5, -6, 1});
        put(9, new Integer[]{-1, -2, -3, -4, -5, -6});
    }}),
    LEVEL_4(4, "Просто 7", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4, 5, 6, 7});
        put(1, new Integer[]{-1, 1, 2, 3, 5, 6, 7});
        put(2, new Integer[]{-1, -2, 1, 2, 5, 6, 7});
        put(3, new Integer[]{-1, -2, -3, 1, 5, 6});
        put(4, new Integer[]{-1, -2, -3, -4, 5});
        put(5, new Integer[]{-5, 1, 2, 3, 4});
        put(6, new Integer[]{-1, -5, -6, 1, 2, 3});
        put(7, new Integer[]{-1, -2, -5, -6, -7, 1, 2});
        put(8, new Integer[]{-1, -2, -3, -5, -6, -7, 1});
        put(9, new Integer[]{-1, -2, -3, -4, -5, -6, -7});
    }}),
    LEVEL_5(5, "Просто 8", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        put(1, new Integer[]{-1, 1, 2, 3, 5, 6, 7, 8});
        put(2, new Integer[]{-1, -2, 1, 2, 5, 6, 7});
        put(3, new Integer[]{-1, -2, -3, 1, 5, 6});
        put(4, new Integer[]{-1, -2, -3, -4, 5});
        put(5, new Integer[]{-5, 1, 2, 3, 4});
        put(6, new Integer[]{-1, -5, -6, 1, 2, 3});
        put(7, new Integer[]{-1, -2, -5, -6, -7, 1, 2});
        put(8, new Integer[]{-1, -2, -3, -5, -6, -7, -8, 1});
        put(9, new Integer[]{-1, -2, -3, -4, -5, -6, -7, -8});
    }}),
    LEVEL_6(6, "Просто 9", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        put(1, new Integer[]{-1, 1, 2, 3, 5, 6, 7, 8});
        put(2, new Integer[]{-1, -2, 1, 2, 5, 6, 7});
        put(3, new Integer[]{-1, -2, -3, 1, 5, 6});
        put(4, new Integer[]{-1, -2, -3, -4, 5});
        put(5, new Integer[]{-5, 1, 2, 3, 4});
        put(6, new Integer[]{-1, -5, -6, 1, 2, 3});
        put(7, new Integer[]{-1, -2, -5, -6, -7, 1, 2});
        put(8, new Integer[]{-1, -2, -3, -5, -6, -7, -8, 1});
        put(9, new Integer[]{-1, -2, -3, -4, -5, -6, -7, -8, -9});
    }}),
    LEVEL_7(7, "Брат 1", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        put(1, new Integer[]{-1, 1, 2, 3, 5, 6, 7, 8});
        put(2, new Integer[]{-2, -1, 1, 2, 5, 6, 7});
        put(3, new Integer[]{-3, -2, -1, 1, 5, 6});
        put(4, new Integer[]{-4, -3, -2, -1, 1, 5});
        put(5, new Integer[]{-5, -1, 1, 2, 3, 4});
        put(6, new Integer[]{-6, -5, -1, 1, 2, 3});
        put(7, new Integer[]{-7, -6, -5, -2, -1, 1, 2});
        put(8, new Integer[]{-8, -7, -6, -5, -3, -2, -1, 1});
        put(9, new Integer[]{-9, -8, -7, -6, -5, -4, -3, -2, -1});
    }}),
    LEVEL_8(8, "Брат 2", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        put(1, new Integer[]{-1, 1, 2, 3, 5, 6, 7, 8});
        put(2, new Integer[]{-2, -1, 1, 2, 5, 6, 7});
        put(3, new Integer[]{-3, -2, -1, 1, 2, 5, 6});
        put(4, new Integer[]{-4, -3, -2, -1, 1, 2, 5});
        put(5, new Integer[]{-5, -2, -1, 1, 2, 3, 4});
        put(6, new Integer[]{-6, -5, -2, -1, 1, 2, 3});
        put(7, new Integer[]{-7, -6, -5, -2, -1, 1, 2});
        put(8, new Integer[]{-8, -7, -6, -5, -3, -2, -1, 1});
        put(9, new Integer[]{-9, -8, -7, -6, -5, -4, -3, -2, -1});
    }}),
    LEVEL_9(9, "Брат 3", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        put(1, new Integer[]{-1, 1, 2, 3, 4, 5, 6, 7, 8});
        put(2, new Integer[]{-2, -1, 1, 2, 3, 5, 6, 7});
        put(3, new Integer[]{-3, -2, -1, 1, 2, 3, 5, 6});
        put(4, new Integer[]{-4, -3, -2, -1, 1, 2, 3, 5});
        put(5, new Integer[]{-5, -3, -2, -1, 1, 2, 3, 4});
        put(6, new Integer[]{-6, -5, -3, -2, -1, 1, 2, 3});
        put(7, new Integer[]{-7, -6, -5, -3, -2, -1, 1, 2});
        put(8, new Integer[]{-8, -7, -6, -5, -3, -2, -1, 1});
        put(9, new Integer[]{-9, -8, -7, -6, -5, -4, -3, -2, -1});
    }}),
    LEVEL_10(10, "Брат 4", new HashMap<>() {{
        put(0, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        put(1, new Integer[]{-1, 1, 2, 3, 4, 5, 6, 7, 8});
        put(2, new Integer[]{-2, -1, 1, 2, 3, 4, 5, 6, 7});
        put(3, new Integer[]{-3, -2, -1, 1, 2, 3, 4, 5, 6});
        put(4, new Integer[]{-4, -3, -2, -1, 1, 2, 3, 4, 5});
        put(5, new Integer[]{-5, -4, -3, -2, -1, 1, 2, 3, 4});
        put(6, new Integer[]{-6, -5, -4, -3, -2, -1, 1, 2, 3});
        put(7, new Integer[]{-7, -6, -5, -4, -3, -2, -1, 1, 2});
        put(8, new Integer[]{-8, -7, -6, -5, -4, -3, -2, -1, 1});
        put(9, new Integer[]{-9, -8, -7, -6, -5, -4, -3, -2, -1});
    }});

    private final int id;
    private final String name;
    private final HashMap<Integer, Integer[]> validDigits;
    private static final Logger log = LogManager.getLogger(Level.class);

    Level(int id, String name, HashMap<Integer, Integer[]> validDigits) {
        this.id = id;
        this.name = name;
        this.validDigits = validDigits;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static Level valueOf(int id) {
        for (Level level : Level.values()) {
            if (level.getId() == id) {
                return level;
            }
        }
        return null;
    }

    public static Level valueOfByName(String name) {
        for (Level level : Level.values()) {
            if (level.getName().equalsIgnoreCase(name)) {
                return level;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }

    public Integer[] getValidDigits(int digitResult) {
        log.debug("digitResult: " + digitResult);

        return validDigits.get(digitResult);
    }
}
