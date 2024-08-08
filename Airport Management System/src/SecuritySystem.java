public class SecuritySystem {
        public void screenPassenger(Passenger passenger) {
            System.out.println("Screened passenger: " + passenger.getName());

        }
        public void screenBagagge(Baggage baggage) {
            System.out.println("Serached baggage and owner: " + baggage.getOwner().getName());

        }
        public static void notifySecurityAlert(String message) {
            System.out.println("Security alert: " + message);
        }




}
