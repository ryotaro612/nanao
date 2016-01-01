package com.ranceworks.nanao.vsm;


public class TitleScore {
    private String key;
    private double score;

    TitleScore(String key, double score) {
        this.key = key;
        this.score = score;
    }

    public String getKey() {
        return key;
    }

    public double getScore() {
        return score;
    }
}
