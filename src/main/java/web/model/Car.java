package web.model;

public class Car {
    private String model;
    private int year;
    private String series;

    public Car(String model, int year, String series) {
        this.model = model;
        this.year = year;
        this.series = series;
    }
    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getSeries() {
        return this.series;
    }
}
