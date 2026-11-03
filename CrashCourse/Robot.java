public class Robot {
    // private instance variable
    private String name;
    private String serial;
    private double battery;
    private boolean isOn;

    // Constructers
    // special method Starting point for new objects
    // Parameters Name, Seriel, Battery 
    public Robot(String name, String serial, double battery) {
        // This: seperates Instance variables from parameters 
        this.name = name;
        this.serial = serial;
        this.battery = battery; 
        // Defualt state
        this.isOn = false; 
    }

    // Getter / Accessor
    public String getName() {
        return name;
    }

    public double getBattery() {
        return battery;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String toString() {
        return name + " [" + serial + " ]";  
    }

    public boolean serialContains(String part) {
        return serial.indexOf(String part) {
            r
        }

        }
}
