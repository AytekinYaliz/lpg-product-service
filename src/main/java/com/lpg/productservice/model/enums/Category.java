package com.lpg.productservice.model.enums;

public enum Category {
    KITCHEN(1),
    POWER_TOOLS(2),
    FURNITURE(3),
    ELECTRIC(4),
    WASHROOM(5),
    TEXTILES(6),
    MISC(7);

    private int numVal;

    Category(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}
