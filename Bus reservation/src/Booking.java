import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    String passengername;
    int busno;
    Date date;


    Booking() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Enter the passenger name : "));
        passengername= scanner.next();
        System.out.println("Enter the bus number :" );
        busno = scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = scanner.next();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");

        date = dateformat.parse(dateInput);
    }


    public boolean isAvailable(ArrayList<Booking> bookings , ArrayList<Bus>busses) {
        int capacity = 0;
        for(Bus b:busses){
            if(b.getbusno()== busno) {
                capacity = b.getCapacity();
            }

        }
        int booked =0;
        for (Booking b:bookings){
            if(b.busno==busno && date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }


}
