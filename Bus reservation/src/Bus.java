import java.util.*;
public class Bus {
    private int busno;
    private boolean ac;
    private int capacity; // get and set methods

    Bus(int no ,boolean ac , int cap){
        this.busno=no;
        this.ac=ac;
        this.capacity=cap;

    }




    public void setCapacity(int cap){ // mutator method
        capacity = cap;
    }
    public boolean getac() { // accessor method
        return ac;
    }
    public void setac(boolean val){ // mutator method
        ac = val;
    }
    public int getbusno() { // accessor method
        return busno;
    }
    public int getCapacity() { // accessor method
        return capacity;
    }
    /*public void setbusno(int no){ // mutator method
        busno = no;
    }*/
    public void displaybusinfo(){
        System.out.println("Bus no:" + busno + "   ac :" + ac + "  Total capacity:" + capacity);
    }
}
