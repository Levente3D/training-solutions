package week15day05;

public class CovidCasesPerCountry {

    private String country;
    private int population;
    private int number;

    public CovidCasesPerCountry(String country, int population, int number) {
        this.country = country;
        this.population = population;
        this.number = number;
    }

    public void addCases(int newCases){
        number += newCases;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getNumber() {
        return number;
    }
}
