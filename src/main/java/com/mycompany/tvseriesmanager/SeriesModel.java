package com.mycompany.tvseriesmanager;
public class SeriesModel {
    public String seriesName;
    public String seriesGenre;
    public int seriesAgeRestriction;

    public SeriesModel(String name, String genre, int age) {
        this.seriesName = name;
        this.seriesGenre = genre;
        this.seriesAgeRestriction = age;
    }

    @Override
    public String toString() {
        return "Series Name: " + seriesName + "\nGenre: " + seriesGenre + "\nAge Restriction: " + seriesAgeRestriction;
    }
}