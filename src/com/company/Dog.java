package com.company;

public class Dog extends Character{

    private String name = "Jojo";
    private String color = "White";
    private String bread = "Dalmatian";

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

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public  void catchB(Toy toy) {
       System.out.println("I caught a " + toy.getName() +".");
    }

    public void coming(){
        System.out.println("Wowo I am coming.");
    }

    public void throwBone(Man man){
        System.out.println("Throw Bonni for me....");
        man.throwingB();
    }

    public void putFoToy(Dog dog,Toy toy){
        System.out.println(dog.getName()+" puts feet on "+toy.getName());
        toy.bonniMSound();

    }
}
