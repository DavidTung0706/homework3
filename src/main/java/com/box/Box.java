package com.box;

public class Box {
    protected String boxname;
    protected float length;
    protected float width;
    protected float height;

    protected Box(String boxname, float length, float width, float height) {
        this.boxname = boxname;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getBoxname() {
        System.out.println(boxname);
        return boxname;
    }

    protected boolean validate(float length, float width, float height) {
        if (length <= this.length &&
                width <= this.width && height <= this.height) {
            return true;
        } else {
            return false;
        }
    }
}
