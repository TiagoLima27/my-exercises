package io.codeforall.bootcamp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * WordHistogram using Composition
 */
public class WordHistogramComp implements Iterable<String> {

    private Map<String,Integer> histogramData;

    public WordHistogramComp(String text){

        histogramData = new HashMap<>();

        for(String word : text.split(" ")){
            histogramData.put(word, histogramData.containsKey(word) ? histogramData.get(word) + 1 : 1);
        }
    }

    public int size(){
        return histogramData.size();
    }

    public int get(String word){
        return histogramData.get(word);
    }

    @Override
    public Iterator<String> iterator() {
        return histogramData.keySet().iterator();
    }

}
