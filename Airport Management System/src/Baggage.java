public class Baggage {
    public Passenger owner;
    public String tagNumber;
    public String status;

    public Baggage(Passenger owner,
                   String tagNumber,
                   String status) {
        this.owner = owner;
        this.tagNumber = tagNumber;
        this.status = status;
    }
public Passenger getOwner() {
        return owner;
}
public String getTagNumber() {
        return tagNumber;
}
public String getStatus() {
        return status;
}
public void setStatus(String status) {
        this.status = status;
}
public void setOwner(Passenger owner) {
        this.owner = owner;
}
public void setTagNumber(String tagNumber) {
        this.tagNumber = tagNumber;
}

    @Override
    public String toString() {
        return "Baggage{" +
                "owner=" + owner +
                ", tagNumber='" + tagNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
