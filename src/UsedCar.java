/**
 * Created by adamm on 2/9/2017.
 */
public class UsedCar extends Car {
    private int mileage;
    public UsedCar(String make, String model, int year, double price) {
        super(make, model, year, price);
    }

    UsedCar(String make, String model, int year, double price, int mileage) {
        super(make, model, year, price);
        this.mileage = mileage;
    }

    int getMileage() {
        return mileage;
    }
}
