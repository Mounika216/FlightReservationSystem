import  java.util.*;
public class Main {
    public static void main(String[] args) {

        Flight f = new Flight(87,"Air India",300,3);
        System.out.println(f.getFlightDetails());
        System.out.println(f.checkAvailability());
        f.updateBookedSeats(300);
        System.out.println(f.checkAvailability());

        Passenger p = new Passenger(1,"devi","8776657636",
                                    "sample@gmail.com","gandhinagar", "vijayawada","AP");
        System.out.println(p.getAddress().getAddressDetails());
        System.out.println(p.getContact().getContactDetails());
        System.out.println(p.getId());

        String arrivalTime = "21/01/01 23:23:34";
        String departureTime ="20/12/31 5:23:32";
        RegularTicket rt = new RegularTicket("13232","Vijayawada",
                "visakhapatnam",f,
                departureTime,arrivalTime,p,213,6000,false,null);
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getFlightDuration());
        rt.setStatusCancelled();
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getSpecialService());
        rt.updateSpecialService(null);

        String[] touristLocations = {"Iceland","Bali","Vietnam"};
        TouristTicket tt = new TouristTicket("13232","Vijayawada",
                "visakhapatnam",f,
                departureTime,arrivalTime,p,213,6000,false,a,touristLocations);
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getFlightDuration());
        tt.setStatusCancelled();
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getHotelAddress().getAddressDetails());
        for (String s: tt.touristLocations){
            System.out.println(s);
        }




    }
}
