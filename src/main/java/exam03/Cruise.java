package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private String passenger;



    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Cruise(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public String bookPassenger(){
    }

    public int getPriceByName(String name){

    }
    public String findPassengerByName(String name){

    }

    public String getPassengerNamesOrdered(){
        List<String> passengers = new ArrayList<>();
    }

    public double sumAllBookingCharged(){

    }

}
