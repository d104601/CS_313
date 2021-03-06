package inheritance;

/**
 * a class that extends Computer,
 * i.e. Computer is a "superclass" of this class
 * and Laptop is a "subclass" of Computer
 */
public class Laptop extends Computer {
    //addtional instance variables
    private int batteryLeft; //in percent
    private boolean isCharging; //note conventional boolean names

    //new default constructor
    public Laptop()
    {
        super(); //call to superclass default constructor, super calls must be first line in constructor
        batteryLeft = 100;
    }

    //new constructor with parameters
    public Laptop(long ram, int speed, int hDDspace, int batteryLeft, boolean isCharging)
    {
        super(ram, speed, hDDspace);
        this.batteryLeft = batteryLeft;
        this.isCharging = isCharging;
    }


    public int getBatteryLeft() {
        return batteryLeft;
    }

    public void setBatteryLeft(int batteryLeft) {
        this.batteryLeft = batteryLeft;
    }

    public boolean isCharging() {
        return isCharging;
    }

    public void setCharging(boolean charging) {
        isCharging = charging;
    }
}
