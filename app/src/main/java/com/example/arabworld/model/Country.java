package com.example.arabworld.model;

@SuppressWarnings("unused")
public class Country {
    private String name;
    private String capital;
    private String landArea;
    private String population;
    private String link;

    public Country(String name, String capital, String landArea, String population, String link) {
        this.name = name;
        this.capital = capital;
        this.landArea = landArea;
        this.population = population;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLandArea() {
        return landArea;
    }

    public void setLandArea(String landArea) {
        this.landArea = landArea;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", landArea=" + landArea +
                ", population=" + population +
                ", link='" + link + '\'' +
                '}';
    }
}
