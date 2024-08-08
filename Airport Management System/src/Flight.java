public class Flight {
    public String flightNumber;
    public String destination;
    public String arrivalTime;
    public String departureTime;
    public String gateNumber;
    public boolean isCancelled;



    public Flight(String flightNumber,
                  String destination,
                  String arrivalTime,
                  String departureTime,
                  String gateNumber) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.gateNumber = gateNumber;
        this.isCancelled = false;

    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber() {
        this.flightNumber = flightNumber;

    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = this.destination;
    }
    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = this.arrivalTime;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = this.departureTime;
    }
    public String getGateNumber() {
        return gateNumber;
    }
    public void setGateNumber(String gateNumber) {
        this.gateNumber = this.gateNumber;
    }
    public boolean isCancelled() {
        return isCancelled;
    }
    public void setiscancellec() {
        this.isCancelled = true;
    }
@Override
    public String toString() {
        return "Flight{"
                + "flightNumber='" + flightNumber + '\''
                + ", destination='" + destination + '\''
                + ", arrivalTime='" + arrivalTime + '\''
                + ", departureTime='" + departureTime + '\''
                + ", gateNumber='" + gateNumber + '\''
                + ", isCancelled=" + isCancelled + '}';

}

}
