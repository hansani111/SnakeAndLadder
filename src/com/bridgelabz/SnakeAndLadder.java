package com.bridgelabz;

public class SnakeAndLadder {

    static final int STARTING_POSITION = 0;
    
    static final int NO_PLAY = 0;
    static final int IS_SNAKE = 1;
    static final int IS_LADDER = 2;

    static int toGetDieRollNumber() {
        int randomCheck = (int) (1 + Math.random() * 6);
        return randomCheck;
    }

    static int toGetOption() {
        int randomCheck1 = (int) (1 + Math.random() * 3);
        return randomCheck1;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Problems");

        int playerPosition = 0;
        System.out.println("initial position is : " + playerPosition);

        int randomCheck = toGetDieRollNumber();
        System.out.println("number between 1 to 6 : " + randomCheck);

        int randomCheck1 = toGetOption();

        switch (randomCheck1) {
            case IS_SNAKE:
                System.out.println("snake");
                playerPosition -= randomCheck1;
                break;
            case IS_LADDER:
                System.out.println("ladder");
                playerPosition += randomCheck1;
                break;
            default:
                System.out.println("no play");
        }
        System.out.println("player option : " +playerPosition);
    }
}
