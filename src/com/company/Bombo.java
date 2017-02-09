package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 25374183p on 03/02/2017.
 */
public class Bombo {

    private List<Integer> numbers = new ArrayList<>();

    public Bombo() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
    }

    public Integer giveNumber() {
        return numbers.remove(numbers.size() - 1);
    }

    public boolean numberLeft() {
        return numbers.isEmpty();
    }

}
