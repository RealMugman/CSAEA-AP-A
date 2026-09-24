public class Athlete {

    private int strength;
    private int reactionSpeed;
    private int speed;
    private double weight;
    private String sport;
    boolean injury;
    boolean starting;
    private String name;
    double fortyYardTime;
    int bench;
    int squat;
    int deadlift;

    public Athlete(String sport, boolean starting, double weight) {
        this.sport = sport;
        this.starting = starting;
        this.weight = weight;
    }

    public void workout() {
        strength ++;
        System.out.println("Strength increased by one, Strength now at " + strength);
        if (strength >= 100) {
            strength = 100;
            System.out.println("Strength maxed out");
        }
    }
    public void trainSpeed() {
        speed ++;
        System.out.println("Speed state increased by 1, speed at " + speed);
        if (speed >= 100) {
            speed = 100;
            System.out.println("Speed maxed out");
        }
    }
    public void watchFilm() {
        reactionSpeed ++;
        System.out.println("reaction speed increased by one, reaction speed now at " + reactionSpeed);
        if (reactionSpeed >= 100) {
            reactionSpeed = 100;
            System.out.println("reaction speed maxed out");
        }
    }
    public void maxLift() {
        bench = strength * 2;
        squat = strength * 3;
        deadlift = strength * 4;
        System.out.println("Max Bench: " + bench + "Max Squat: " + squat + "Max deadlift: " + deadlift);
    }
    public void eat() {
        weight ++;
    }
    public void checkWeight() {
        System.out.println("You weigh: " + weight + "lbs");
    }

}
