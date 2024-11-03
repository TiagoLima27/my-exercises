package io.codeforall.bootcamp;

import java.util.HashMap;
import java.util.Iterator;

/**
 * WordHistogram using inheritance
 */
public class WordHistogram extends HashMap<String, Integer> implements Iterable<String> {

    public WordHistogram(String line) {

        for (String word : line.split(" ")) {

            if (!containsKey(word)) {
                put(word, 1);
            } else {
                put(word, get(word) + 1);
            }
        }
    }

    @Override
    public Iterator<String> iterator() {
        return keySet().iterator();
    }

}
