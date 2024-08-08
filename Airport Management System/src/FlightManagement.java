import java.util.ArrayList;
import java.util.List;

public class FlightManagement {
    private List<Flight> flights;
    public FlightManagement() {
        this.flights = new ArrayList<>();

    }
    public void addFlight(Flight flight) {
        flights.add(flight);

    }
    public void updateFlight(String flightNumber,
                             Flight updatedFlight) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                flight.setDestination(updatedFlight.getDestination());
                flight.setArrivalTime(updatedFlight.getArrivalTime());
                flight.setDepartureTime(updatedFlight.getDepartureTime());
                flight.setGateNumber(updatedFlight.getGateNumber());
                break;

            }
        }
    }

public void cancelFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                flight.isCancelled();
                break;
            }
        }
}


    public List<Flight> viewFlights() {
        return flights;
    }
}
