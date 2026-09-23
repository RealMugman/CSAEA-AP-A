

public class Dog {
    
    String characterName;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog(String characterName, String breed, int age) {
        this.characterName = characterName;
        this.breed = breed;
        this.age = age; 
    }

    public void eat() {
        energyLevel += 15;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
    }
    public void sleep() {
        energyLevel += 25;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
    }
    public void bark() {
        energyLevel -= 1;
        if (energyLevel < 0) {
            energyLevel += 1;
        }
    }

    }

