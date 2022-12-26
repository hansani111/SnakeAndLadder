package com.bridgelabz;

public class SnakeAndLadder {

    static final int STARTING_POSITION = 0;
    
    static int toGetDieRollNumber(){
        int randomCheck = (int) (1 + Math.random() * 6);
        return  randomCheck;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Problems");

        int playerPosition =0;
        System.out.println("initial position is : "+playerPosition);

        int randomCheck = toGetDieRollNumber();
        System.out.println("number between 1 to 6 : "+randomCheck);
    }
}
