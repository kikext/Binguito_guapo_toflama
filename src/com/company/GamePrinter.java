package com.company;

import java.util.Scanner;

/**
 * Created by 25374183p on 03/02/2017.
 */
public class GamePrinter {

    private static Scanner scanner = new Scanner(System.in);
    
    public static String readPlayerName(int numberPlayer) {
        if (numberPlayer == 1) {
            System.out.println("Introduce Player1's name:");
            return scanner.nextLine();
        } else if (numberPlayer == 2){
            System.out.println("Introduce Player2's name:");
            return scanner.nextLine();
        } else {
            //TODO lanzar excepcion
            return "ERROR";
        }
    }

    public static void printSelectName2() { System.out.println("Introduce Player2's name:"); }

    public static void printNumberIs(int num) { System.out.println("The number is " + num); }

    public static void printEnterToContinue() { System.out.println("Press enter to continue"); }

    public static void printNameNumber1(Player player, GameState game) { System.out.println("Player 1: " + player.getName() + ". Number: " + game.getPlayer1Num()); }

    public static void printNameNumber2(Player player, GameState game) { System.out.println("Player 2: " + player.getName() + ". Number: " + game.getPlayer2num()); }

    public static void printWinner(Player player) { System.out.println("The printWinner is " + player.getName()); }

}
