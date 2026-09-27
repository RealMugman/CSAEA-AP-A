public class Athlete {

    private int strength = 50;
    private int reactionSpeed = 50;
    private int speed = 50;
    private double weight = 160.0;
    private String sport;
    private boolean injury;
    private boolean starting;
    private String name;
    private double fortyYardTime;
    private int bench;
    private int squat;
    private int deadlift;

    public Athlete(String sport, boolean starting, String name, boolean injury) {
        this.sport = sport;
        this.starting = starting;
        this.name = name;
        this.injury = injury;
    }

    public void workout() {
        weight -= 1.0;
        if (strength < 100) {
            strength ++;
        }
        System.out.println("Strength increased by 1, Stength at " + strength);
        if (strength == 100) {
            System.out.println("Strength maxed out");
        }
    }
    public void trainSpeed() {
        weight -= 1.5;
        if (speed < 100) {
            speed ++;
        }
        System.out.println("Speed state increased by 1, speed at " + speed);
        if (speed == 100) {
            System.out.println("Speed maxed out");
        }
        
    }
    public void watchFilm() {
        if (reactionSpeed < 100) {
            reactionSpeed ++;
        }
        System.out.println("reaction speed increased by one, reaction speed now at " + reactionSpeed);
        if (reactionSpeed == 100) {
            System.out.println("Reaction speed maxed out");
        }
    }
    public void maxLift() {
        bench = strength * 2;
        squat = strength * 3;
        deadlift = strength * 4;
        System.out.println("Max Bench: " + bench + " " + "Max Squat: " + squat + " " + "Max deadlift: " + deadlift);
    }
    public void eat(double poundsGained) {
        this.weight += poundsGained;
        System.out.println("Pounds gained: " + poundsGained + " lbs");
    }
    public void checkWeight() {
        System.out.println("You weigh: " + weight + " lbs");
    }
    public void fortyTime() {
    if (speed >= 100) {
        fortyYardTime = 4.2;
    }
    else if (speed >= 50) {
        fortyYardTime = 4.6;
    } 
    else if (speed >= 25) {
        fortyYardTime = 5.0;
    } 
    else {
        fortyYardTime = 6.0;
    }
    
    System.out.println("Forty yard time is " + fortyYardTime);  
    }
    public void checkState() {
        System.out.println("Athlete Name: " + name + 
        "  Sport: " + sport + 
        "  Weight: " + weight + 
        " lbs  Starting: " + starting + 
        "  Injured: " + injury + 
        "  Speed: " + speed + 
        "  Strength: " + strength);
    }
    public void rest(int hourSlept, boolean goodMeal) {
        if (hourSlept >= 8 && goodMeal == true) {
            this.injury = false;
            System.out.println("Injury healed, cleared for play");
        } else {
            System.out.println("Injury not healed, get more sleep and eat better");
        }
    }

}
