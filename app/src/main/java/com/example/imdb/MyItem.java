package com.example.imdb;

public class MyItem {
    private String name;
    private String desc;
    private int icon;

    public MyItem(String name, String desc, int icon) {
        this.name = name;
        this.desc = desc;
        this.icon = icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return getName();
    }
}
