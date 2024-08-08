public class AirportManagementSystem {
    public static void main(String[] args) {




        FlightManagement flightManagement = new FlightManagement();
        Flight flight1 = new Flight("50501",
                "Ankara",
                "10:00" ,
                "17:00",
                "BJK2");
        flightManagement.addFlight(flight1);
        flightManagement.viewFlights().forEach(System.out::println);



        PassengerManagement passangerManagement = new PassangerManagement();
        Passenger passenger1 = new Passenger("SüleymanKaya", "BJK1903", "5051");
        PassengerManagement.bookTicket(passenger1);
        PassengerManagement.checkinPassenger("THK2011");
        PassengerManagement.viewPassengers("50501").forEach(System.out ::println);



        BaggageManagement baggageManagement = new BaggageManagement();
        Baggage baggage1 = new Baggage(passenger1,"SK123", "active");
        baggageManagement.checkInBaggage(baggage1);
        baggageManagement.trackBaggage("SK123");




        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.screenPassenger(passenger1);
        securitySystem.screenBagagge(baggage1);
        SecuritySystem.notifySecurityAlert("Danger Alert");



        StaffManagement staffManagement = new StaffManagement();
        Staff staff1 = new Staff("Ahmet Mithat Efendi", "Observer", "1878");
        staffManagement.addStaff(staff1);
        StaffManagement.assignShift("1878" ,"Evening");
        staffManagement.viewStaff().forEach(System.out ::println);




        AnnouncementSystem announcementSystem = new AnnouncementSystem();
        Announcement announcement1 = new Announcement("Herhangi bir bildiirim uyarısı","Alert");
        announcementSystem.addAnnouncement(announcement1);
        announcementSystem.broadcastAnnouncement();


    }
}
