package CrashCourse;

public class knight {

    // 1. Data/Attributes
    String charactername;
    int health;
    int energyLevel;
    boolean isHoly;
    int Strength;
    boolean hasWeapon;
    int speed;

    // 2. Constuctor special method, only runs when we CREATE a Knight object.
    public knight(String charactername, int health, boolean isHoly) {
        this.charactername = charactername;
        this.health = health;
        this.isHoly = isHoly;
    }

    // 3. Behaviors
    public void eat() {
        energyLevel += 25;
        if (energyLevel > 100) {
            energyLevel = 100;
        } 
    }

    public void breakWeapon() {
        hasWeapon = false;
        health /= 2;
    }

    public void workOut() {
        Strength += 1;
        energyLevel -= 10;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health > 0){
            System.out.println("You died");
        }
    }
}
