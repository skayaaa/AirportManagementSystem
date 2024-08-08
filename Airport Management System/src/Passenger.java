public class Passenger {
    public String name;
    public String passportNumber;
    public String flightNumber;
    public boolean checkedIn;






    public Passenger(String name,
                     String passportNumber,
                     String flightNumber) {
            this.name = name;
            this.passportNumber = passportNumber;
            this.flightNumber = flightNumber;
            checkedIn = false;
    }
public String getName() {
        return name;
}
public void setName(String name) {
        this.name = name;

}
public String getPassportNumber() {
        return passportNumber;
}
public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
}
public String getFlightNumber() {
        return flightNumber;
}
public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
}
public boolean isCheckedIn() {
        return checkedIn;
}
public void checkIn() {
        checkedIn = true;
}

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", checkedIn=" + checkedIn +
                '}';
    }
}
