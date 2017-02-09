package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by 36580307A on 07/02/2017.
 */
public class Line {

    private List<Integer> numbers = new ArrayList<>();
    private Map<Integer, Boolean> hits = new HashMap<>();

    public Line() {
        //El constructor tiene que inicializar el array con 4 numeros del 0 al 9 que sean diferentes entre si

        for (int i = 0; i < 4; i++) {
            while (true) {
                int number = ThreadLocalRandom.current().nextInt(0, 10);
                if (!numbers.contains(number)) {
                    numbers.add(number);
                    break;
                }
            }
        }

        for (Integer number:numbers) {
            hits.put(number, false);
        }

    }

    public boolean checkNumber(int number) {
        //Este método checkea si el numero pasado por el parámetro está presente en el arraylist
        //Si está presente, entonces actualiza el array de hits

        if (hits.containsKey(number)){
            hits.put(number, true);
            return true;
        }
        return false;

    }

    public boolean isCompleted() {
        //Devuelve cierto si se ha completado la linea

        for (Boolean present:hits.values()) {
            if (!present) {
                return false;
            }
        }
        return true;

    }

    public boolean numberHit(int number) {

        return hits.getOrDefault(number, false);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (numbers != null ? !numbers.equals(line.numbers) : line.numbers != null) return false;
        return hits != null ? hits.equals(line.hits) : line.hits == null;
    }

    @Override
    public int hashCode() {
        int result = numbers != null ? numbers.hashCode() : 0;
        result = 31 * result + (hits != null ? hits.hashCode() : 0);
        return result;
    }
}
