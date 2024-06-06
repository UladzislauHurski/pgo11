public class Car implements Comparable<Car> {
    private String modelName;
    private int yearOfProduction;

    public Car(String modelName, int yearOfProduction) {
        this.modelName = modelName;
        this.yearOfProduction = yearOfProduction;
    }

    public int compareTo(Car car) {
        return Integer.compare(this.yearOfProduction, car.getYearOfProduction());
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
