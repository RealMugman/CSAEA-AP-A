public class Athlete {

    private int strength;
    private int reactionSpeed;
    private int speed;
    private double weight = 160.0;
    private String sport;
    boolean injury;
    boolean starting;
    private String name;
    double fortyYardTime;
    int bench;
    int squat;
    int deadlift;

    public Athlete(String sport, boolean starting, boolean injury) {
        this.sport = sport;
        this.starting = starting;
        this.injury = injury;
    }

    public void workout() {
        weight -= 1.0;
        if (speed < 100) {
            speed ++;
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
    public void eat() {
        weight = weight + 1.0;
    }
    public void checkWeight() {
        System.out.println("You weigh: " + weight + " lbs");
    }
    public void fortyTime() {
        if (speed == 100) {
            fortyYardTime = 4.2;
            System.out.println("Forty yard time is " + fortyYardTime);
        }
        if (speed > 100) {
            fortyYardTime = 4.6;
            System.out.println("Forty yard time is " + fortyYardTime);
        }
        if (speed > 50) {
            fortyYardTime = 5.0;
        }

    }

}
