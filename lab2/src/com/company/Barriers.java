package com.company;

public enum Barriers {
    Wall1(1, "Стену 1", 10),
    Wall2(1, "Стену 2", 10000),
    Wall3(1, "Стену 3", 10),
    Wall4(1, "Стену 1", 10000),
    Wall5(1, "Стену 1", 10000),
    Track1(2, "Дорожку 1", 100);


    private int type;
    private String title;
    private int dimension;

    public int getType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

    public int getDimension() {
        return this.dimension;
    }

    private Barriers(int type, String title, int length) {
        this.title = title;
        this.type = type;
        this.dimension = length;
    }
}
