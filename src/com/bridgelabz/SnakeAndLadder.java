package com.bridgelabz;

public class SnakeAndLadder {

    static final int START_POSITION = 0;
    static final int FINAL_POSITION = 100;

    static final int NO_PLAY = 0;
    static final int IS_SNAKE = 1;
    static final int IS_LADDER = 2;

    static int diceCount = 0;

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

        int playerPosition = START_POSITION;

        while (playerPosition <= FINAL_POSITION) {
            diceCount++;

            int roll = toGetDieRollNumber();
            System.out.println(roll);

            int option = toGetOption();
            switch (option) {
                case IS_SNAKE:
                    System.out.println("Snake");
                    playerPosition -= roll;
                    if (playerPosition < START_POSITION)
                        playerPosition = START_POSITION;
                    System.out.println("Player position : " + playerPosition);
                    break;
                case IS_LADDER:
                    System.out.println("Ladder");
                    playerPosition += roll;
                    System.out.println("Player position : " + playerPosition);
                    break;
                default:
                    System.out.println("No play");
                    System.out.println("Player position : " + playerPosition);
            }
        }
        System.out.println("Total Dice count : " + diceCount);
        System.out.println("Finally Player position : " + playerPosition);
    }
}