package com.cryfish.myalomatika.list;

public enum Lang {

    RU("ru-RU"),
    US("en-US");

    private final String name;

    Lang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
