package com.company;

import java.util.Scanner;

/**
 * Created by 25374183p on 03/02/2017.
 */
public class GameRunner {

    private GameState game;
    private Player player1;
    private Player player2;
    private Bombo bombo;

    Scanner scanner = new Scanner(System.in);

    public void run() {
        game = new GameState();
        bombo = new Bombo();

        game.initPlayerLines();

        player1 = new Player(GamePrinter.readPlayerName(1));
        player2 = new Player(GamePrinter.readPlayerName(2));

        GamePrinter.printNameNumber1(player1, game);
        GamePrinter.printNameNumber2(player2, game);

        int result = 0;

        while (!game.isOver()) {
            int num = bombo.giveNumber();
            GamePrinter.printNumberIs(num);
            result = game.checkNumber(num);

            GamePrinter.printEnterToContinue();
            scanner.nextLine();
        }

        if (result == 1) {
            GamePrinter.printWinner(player1);
        } else {
            GamePrinter.printWinner(player2);
        }
    }

}
