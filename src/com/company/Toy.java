package com.company;

public class Toy extends Character{

    private String name = "Bonni";
    private String color = "white";
    private String type = "Squeaky rubber toy";
    private String sound = "wowo";




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void bonniMSound(){
        System.out.println("Bonni makes sound.");
    }
}
