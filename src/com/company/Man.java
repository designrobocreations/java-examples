package com.company;

public class Man extends Character {

    private String name = "Matt";
    private int age = 30;
    private String pet = "Dog";
    private int runDistance = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public void throwBonni(Dog dog, Toy toy) {
        System.out.println("I threw the Bonni!!");
        dog.catchB(toy);
    }

    public void comeHere(Dog dog) {
        dog.coming();
    }

    public void throwingB() {
        System.out.println("I threw Bonni");
    }
}
