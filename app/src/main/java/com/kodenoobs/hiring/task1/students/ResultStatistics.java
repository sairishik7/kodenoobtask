package com.kodenoobs.hiring.task1.students;


import java.util.Map;

public class ResultStatistics {

    private final Map<String,Integer> minimum;
    private final Map<String, Integer> maximum;
    private final Map<String, Double> average;

    public ResultStatistics(Map<String,Integer> minimum, Map<String, Integer> maximum, Map<String, Double> average) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.average = average;
    }

    public Map<String,Integer> getMinimum() {
        return minimum;
    }

    public Map<String,Integer> getMaximum() {
        return maximum;
    }

    public Map<String, Double> getAverage() {
        return average;
    }
}
