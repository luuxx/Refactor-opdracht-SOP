package com.fontys.softwarecraftsmanship;

public class Part {
    
    public final String type;
    public final double price;

    private final String title;

    private String subtype = null;
    private int size = -1;
    private double speed = -1.0;

    public Part(String type, String title, double price, String subtype, int size, double speed) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
        this.size = size;
        this.speed = speed;
    }

    // Memory
    public Part(String type, String title, double price, String subtype, int size) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
        this.size = size;
    }
    
    // Casing
    public Part(String type, String title, double price, String subtype) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.subtype = subtype;
    }
    
    // Processor
    public Part(String type, String title, double price, double speed) {
        this.type = type;
        this.title = title;
        this.price = price;
        this.speed = speed;
    }
    
    // Motherboard
    public Part(String type, String title, double price) {
        this.type = type;
        this.title = title;
        this.price = price;
    }

    public boolean isOfType(String typeToCheck){
        return type.equals(typeToCheck);
    }
}
