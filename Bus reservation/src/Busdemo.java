import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class Busdemo {
    public static void main(String[] args){
        //System.out.println("Enter 1 to book and Enter 2 to exit");
        //Bus busses[]=new Bus[50]; // Array list - collection
        //ArrayList<Integer>nums = new ArrayList<Integer>();
        /*nums.add(6);
        nums.add(8);
        nums.add(9);*/
        ArrayList<Bus> busses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        busses.add(new Bus(1,true,2));
        busses.add(new Bus(2,false, 54));
        busses.add(new Bus(3,true,48));

        int useropt = 1;
        Scanner scanner = new Scanner(System.in);

        for(Bus b:busses){
            b.displaybusinfo();
        }
        while (useropt==1){
            System.out.println("Enter 1 to book and Enter 2 to exit");
            //scanner.nextInt();
            useropt=scanner.nextInt();
            if(useropt==1){
                //System.out.println("Booking...");
                try {
                    Booking booking = new Booking();
                    if(booking.isAvailable(bookings,busses)){
                        bookings.add(booking);
                        System.out.println("your booking is confirmed.");
                    }
                    else{
                        System.out.println("Sorry . bus is full. Try another bus");
                    }
                } catch (ParseException e) {
                    throw new RuntimeException(e); //  error handling in parse in Booking.java
                }

            }
        }
    }
}
