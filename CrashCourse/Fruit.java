package CrashCourse;

public class Fruit {
    private String name;
    private boolean isSweet;
    private boolean isSour;
    String color;
    private int age;
    boolean isPickedFromGround;
    boolean isPickedFromTree;
    boolean isRipe;
    boolean isEat;
    boolean isHarvest;
    private int growthStage; // 1 - 5
    double weight; // oz 

    public void fruit(String name, boolean isRipe, int age) {
        this.name = name;
        this.isRipe = isRipe;
        this.age = age;
    }

    public void eat() {
        isEat = true;
        isRipe = true;
    }
    public void Pick() {
        isRipe = true;
    }
    public void Bad() {
        isRipe = false;
    }
    public void Grown() {
        isHarvest = true;
        growthStage = 5;
        if (isHarvest = true) {
            System.out.println("Fruit ready for harvest")
        }
    }
    public void Growing() {
        isHarvest = false;
        growthStage < 5; 
    }
    public void water() {
        growthStage += 1;
        weight += 1.0; 
        if (growthStage == 5) {
            isHarvest = true;
            System.out.println("Fruit ready for harvest");
        }
    }
    public void checkGrowth() {
        System.out.println("The fruit is at" + growthStage);
    }
    public void checkWeight() {
        System.out.println("The fruit weighs" + weight);
    }
}


