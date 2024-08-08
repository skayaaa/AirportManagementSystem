import java.util.ArrayList;
import java.util.List;

public class BaggageManagement {
    public List<Baggage> baggages;
    public BaggageManagement() {
        this.baggages= new ArrayList<>();
    }
public void checkInBaggage(Baggage baggage) {
        baggages.add(baggage);
}

public void updateBaggageStatus(String tagNumber,
                                String status) {
        for (Baggage baggage : baggages) {
            if (baggage.getTagNumber().equals(tagNumber)) {
                baggage.setStatus(status);
                break;
            }
        }
}
public Baggage trackBaggage(String tagNumber) {
        for (Baggage baggage : baggages) {
            if (baggage.getTagNumber().equals(tagNumber)) {
                return baggage;
            }
        }
    return null;
    }

public List<Baggage> reportLostBaggage(String flightNumber) {
        List<Baggage> lostBaggage = new ArrayList<>();
        for (Baggage baggage : baggages) {
            if (baggage.getOwner().getFlightNumber().equals(flightNumber) && baggage.getStatus() == "Lost") {
                lostBaggage.add(baggage);
            }
        }
return lostBaggage;
    }


}
