import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static Scanner scnr = new Scanner(System.in);
    private static ArrayList<Car> carlist1 = new ArrayList<>();             //Setting up the Car arrays
    private static ArrayList<UsedCar> carlist2 = new ArrayList<>();
    private static int input = 0;

    public static void main(String[] args) {


        while (input != 4) {
            instructions();                                 // Getting information on what the user wants to do and dedicating input to the switch
            switch (input) {

                case 1: {
                    addVehicle();
                    break;
                }
                case 2: {
                    removeVehicle();
                    break;
                }
                case 3: {
                    listVehicles();
                    break;
                }

            }


        }


    }

    private static void instructions() {                                //Prompting the user with instructions and advising of options
        System.out.println(" ");
        System.out.println("What would you like to do?\n1. Add a car\n2. Remove a car\n3. Print your car list\n4. To exit");
        input = scnr.nextInt();
        scnr.nextLine();
    }

    private static void addVehicle() {
        String make;
        String model;
        int year;
        double price;
        System.out.println("Is this a new or used car? 1.new 2.used");         //Getting user input on the vehicle and populating the variables
        input = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Enter the make of your car: ");
        make = scnr.nextLine();
        System.out.print("Enter the model of your car: ");
        model = scnr.nextLine();
        System.out.print("Enter the year of your car: ");
        year = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Enter the price of your car: ");
        price = scnr.nextDouble();
        if (input == 1) {
            carlist1.add(new Car(make, model, year, price));                //After all variables populated running a if statement to update the correct array
        } else {
            System.out.print("Enter the mileage of your car: ");
            int mileage = scnr.nextInt();
            scnr.nextLine();
            carlist2.add(new UsedCar(make, model, year, price, mileage));
        }
        System.out.println(" ");
        System.out.println("Success!!!");

    }

    private static void removeVehicle() {
        int carnumber;
        System.out.println("Is this a new or used car? 1.new 2.used");       // Getting the vehicle array list number to delete depending on new or used car
        input = scnr.nextInt();
        scnr.nextLine();
        if (input == 1) {
            System.out.print("Enter the number of the car you would like to remove: ");
            carnumber = scnr.nextInt();
            carnumber = carnumber - 1;
            scnr.nextLine();
            carlist1.get(carnumber);
            System.out.println("Are you sure you want to delete");
            System.out.format("%-15s%-15s%-15s%-15s", carlist1.get(carnumber).getMake(), carlist1.get(carnumber).getModel(), carlist1.get(carnumber).getYear(), carlist1.get(carnumber).getPrice());

            System.out.println("");
            System.out.println("1. Yes / 2. No");
            input = scnr.nextInt();
            scnr.nextLine();
            if (input == 1) {
                carlist1.remove(carnumber);
            }

        } else if (input == 2) {
            System.out.print("Enter the number of the car you would like to remove: ");
            carnumber = scnr.nextInt();
            carnumber = carnumber - 1;
            scnr.nextLine();
            System.out.println("Are you sure you want to delete the");
            System.out.format("%-15s%-15s%-15s%-15s%-15s", carlist2.get(carnumber).getMake(), carlist2.get(carnumber).getModel(), carlist2.get(carnumber).getYear(), carlist2.get(carnumber).getPrice(), carlist2.get(carnumber).getMileage());

            System.out.println("");
            System.out.println("1. Yes / 2. No");
            input = scnr.nextInt();
            scnr.nextLine();
            if (input == 1) {
                carlist2.remove(carnumber);
            }
        }
    }

    private static void listVehicles() {
        for (int i = 0; i < carlist1.size(); i++) {              //Printing the array list for the user to see what they have

            System.out.format("%-3s%-15s%-15s%-15s%-15s", (i + 1), carlist1.get(i).getMake(), carlist1.get(i).getModel(), carlist1.get(i).getYear(), carlist1.get(i).getPrice());
            System.out.println("");
        }
        for (int i = 0; i < carlist2.size(); i++) {

            System.out.format("%-3s%-15s%-15s%-15s%-15s%-15s", (i + 1), carlist2.get(i).getMake(), carlist2.get(i).getModel(), carlist2.get(i).getYear(), carlist2.get(i).getPrice(), carlist2.get(i).getMileage());
            System.out.println("");
        }
    }


}