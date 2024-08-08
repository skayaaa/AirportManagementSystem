import java.util.ArrayList;
import java.util.List;

public class PassengerManagement {
    public List<Passenger> passengers;
    public PassengerManagement() {
        this.passengers = new ArrayList<>();
    }
public  void bookTicket(Passenger passenger) {
        passengers.add(passenger);
}
public void checkinPassenger(String passportNumber, Passenger passenger) {
        for (Passenger passengers : passengers) {
            if (passenger.getPassportNumber().equals(passportNumber)) {
                passenger.checkIn();
                break;

            }
        }
    }


public Passenger generateBoardingPass(String passportNumber) {
        for (Passenger passenger : passengers) {
            if (passenger.getPassportNumber().equals(passportNumber)) {
                return passenger;
            }
        }
return null;
    }
public List<Passenger> viewPassengers(String flightNumber) {
        List<Passenger> flightPassengers = new ArrayList<>();
        for (Passenger passenger : passengers) {
            if (passenger.getPassportNumber().equals(flightNumber)) {
                flightPassengers.add(passenger);
            }
        }
return flightPassengers;
}
























}
