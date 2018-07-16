package com.company;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {


        System.out.println("Type Knock Knock");

//        int counter= 0;
//        Character[] characters = new Character[10];
//        characters[0] = matt;
//        counter++;


        Date date = new Date();


        Man matt = new Man();
        Dog jojo = new Dog();
        Toy bone = new Toy();


        Scanner inputReader = new Scanner(System.in);
        String input = "";
        while (!input.equals("Exit")) {
            input = inputReader.nextLine();
            switch (input) {


                case "Knock Knock":
                    knockMethod(date);
                    break;


                case "1":
                    System.out.println("Character Name:- " + matt.getName());
                    System.out.println("Character Age:- " + matt.getAge());
                    System.out.println("Character's Pet:- " + matt.getPet());
                    if (matt.getRunDistance() != 0) {
                        System.out.println("Character's running Distance:- " + matt.getRunDistance());
                    }
                    try {

                        FileInputStream fstream = new FileInputStream("Maninfo.txt");
                        DataInputStream in = new DataInputStream(fstream);
                        BufferedReader br = new BufferedReader(new InputStreamReader(in));
                        String strLine;
                        while ((strLine = br.readLine()) != null) {

                            System.out.println(strLine);
                        }

                        in.close();
                    } catch (Exception e) {
                        System.out.println("Error" + e.getMessage());

                    }
                    System.out.println("Log:- Character info opened On " + date);


                    while (!input.equals("8")) {
                        input = inputReader.nextLine();
                        switch (input) {


                            case "1":
                                System.out.println("HI my name is " + matt.getName() + ". I am just going for run with my dog " + jojo.getName() + ". Bye!!");
                                System.out.println("Log:-Matt introduces himself");
                                break;
                            case "2":
                                System.out.println("Please input name");
                                matt.setName(inputReader.nextLine());
                                System.out.println("Log:-Name Changed");
                                break;
                            case "3":
                                System.out.println("Please input Running Distance");
                                matt.setRunDistance(inputReader.nextInt());
                                inputReader.nextLine();
                                System.out.println("Log:-Run Changed. On " + date);
                                break;
                            case "4":
                                matt.throwBonni(jojo, bone);
                                System.out.println("Log:- dog caught the ball at " + date);
                                break;
                            case "5":
                                matt.comeHere(jojo);
                                break;
                            default:
                                input = "8";
                                System.out.println("You exited the "+matt.getName()+" section");
                                knockMethod(date);
                                break;

                        }
                    }


                    break;
                case "2":
                    System.out.println("Character Name:- " + jojo.getName());
                    System.out.println("Character Age:- " + jojo.getColor());
                    System.out.println("Character's Pet:- " + jojo.getBread());
                    try {

                        FileInputStream fstream = new FileInputStream("doginfo.txt");
                        DataInputStream in = new DataInputStream(fstream);
                        BufferedReader br = new BufferedReader(new InputStreamReader(in));
                        String strLine;
                        while ((strLine = br.readLine()) != null) {

                            System.out.println(strLine);
                        }

                        in.close();
                    } catch (Exception e) {
                        System.out.println("Error" + e.getMessage());

                    }
                    System.out.println("Log:- Character info opened On " + date);


                    while (!input.equals("8")) {
                        input = inputReader.nextLine();
                        switch (input) {

                            case "1":
                                System.out.println("Wowo.....wo .wo:- " + jojo.getName() + ".");
                                System.out.println("Translation:- My name is " + jojo.getName() + ".");
                                System.out.println("Log:-Dog Introduction. On " + date);
                                break;
                            case "2":
                                jojo.throwBone(matt);
                                System.out.println("Log:-Matt threw bone at " + date);
                                break;
                            case "3":
                                System.out.println("Please input name");
                                jojo.setName(inputReader.nextLine());
                                System.out.println("Log:-Name Changed");
                                break;
                            default:
                                input = "8";
                                System.out.println("You exited the "+jojo.getName()+" section");
                                knockMethod(date);
                                break;

                        }

                    }


                    break;
                case "3":
                    System.out.println("Character Name:- " + bone.getName());
                    System.out.println("Character Age:- " + bone.getColor());
                    System.out.println("Character's Pet:- " + bone.getType());
                    try {

                        FileInputStream fstream = new FileInputStream("toyinfo.txt");
                        DataInputStream in = new DataInputStream(fstream);
                        BufferedReader br = new BufferedReader(new InputStreamReader(in));
                        String strLine;
                        while ((strLine = br.readLine()) != null) {

                            System.out.println(strLine);
                        }

                        in.close();
                    } catch (Exception e) {
                        System.out.println("Error" + e.getMessage());

                    }
                    System.out.println("Log:- Character info opened On " + date);


                    while (!input.equals("8")) {
                        input = inputReader.nextLine();
                        switch (input) {

                            case "1":
                                System.out.println("Toy's name is " + bone.getName() + ".");
                                System.out.println("Log:-Toy Introduction. On " + date);
                                break;
                            case "2":
                                System.out.println("Please input name");
                                bone.setName(inputReader.nextLine());
                                System.out.println("Log:-Name Changed on " + date);
                                break;
                            case "3":
                                jojo.putFoToy(jojo, bone);
                                System.out.println("Log:-Action took place on" + date);
                                break;
                            default:
                                input = "8";
                                System.out.println("You exited the "+bone.getName()+" section");
                                knockMethod(date);


                        }

                    }


                    break;


//

//                case "Add character":
//                    if(counter<characters.length){
//                        characters[counter] = new Man();
//                        counter++;
//                    }else{
//                        System.out.println("Array is full");
//                    }
//                    break;
                case "Exit":
                    //inputReader.close();
                    break;
                default:
                    System.out.println("Unknown Command");

            }
        }


    }

    public static void knockMethod(Date date) {
        try {

            FileInputStream fstream = new FileInputStream("menu1.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {

                System.out.println(strLine);
            }

            in.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());

        }
        System.out.println("Log:- Menu Items opened. On " + date);
    }


}
