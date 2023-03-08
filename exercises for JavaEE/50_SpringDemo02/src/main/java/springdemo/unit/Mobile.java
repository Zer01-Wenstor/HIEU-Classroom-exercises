package springdemo.unit;

public class Mobile {
    String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String read() {
        return " reading by " + brand;
    }
}
