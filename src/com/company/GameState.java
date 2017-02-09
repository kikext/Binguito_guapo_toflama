package com.company;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by 25374183p on 03/02/2017.
 */
public class GameState {

    private Integer numberPlayer1;
    private Integer numberPlayer2;
    private Line linePlayer1;
    private Line linePlayer2;

    //Inicializa los números de los jugadores de manera aleatoria
    public void initPlayerLines() {

        linePlayer1 = new Line();

        while (true) {
            linePlayer2 = new Line();

            if (!linePlayer1.equals(linePlayer2)) {
                return;
            }
        }
    }

    public int checkNumber(int num) {

        if ()
        linePlayer1.checkNumber(num);
        linePlayer2.checkNumber(num);
        if (linePlayer1.checkNumber(num)) {
            return 1;
        } else if (numberPlayer2 == num) {
            return 2;
        } else {
            return 0;
        }
    }

    public int getPlayer1Num() { return numberPlayer1; }

    public int getPlayer2num() {
        return numberPlayer2;
    }


    public boolean isOver() {
        if (linePlayer1.isCompleted() || linePlayer2.isCompleted()) {
            return true;
        } else {
            return false;
        }
    }
}
