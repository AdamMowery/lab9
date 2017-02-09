/**
 * Created by adamm on 2/9/2017.
 */
public class Car {
    private String make;                    //setting variables
    private String model;
    private int year;
    private double price;



    Car(String make, String model, int year, double price) {        //Constructor to update the array with variables
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    String getMake() {
        return make;
    }                              //getters to send information back from the array


    String getModel() {
        return model;
    }


    int getYear() {
        return year;
    }


    double getPrice() {
        return price;
    }



}
