import module java.base;
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

    public Fruit(String name, boolean isRipe, int age) {
        this.name = name;
        this.isRipe = isRipe;
        this.age = age;
    }

    public void eat() {
        isEat = true;
        isRipe = true;
    }
    public void pick() {
        isRipe = true;
    }
    public void bad() {
        isRipe = false;
    }
    public void grown() {
        isHarvest = true;
        growthStage = 5;
        if (isHarvest = true) {
            System.out.println("Fruit ready for harvest");
        }
    }
    public void growing() {
        isHarvest = false; 
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
Fruit f1 = new Fruit("Apple", true, 5);
Fruit f1 = new Fruit("Bananna", true, 5);
Fruit f2 = new Fruit("Bananna", true, 5);
Fruit f3 = new Fruit("StrawBerry", true, 5);
Fruit f4 = new Fruit("Blueberry", true, 5);
Fruit f5 = new Fruit("Mango", true, 5);
f1.color;
f1.isPickedFromGround;
f1.isPickedFromTree;
f1.isRipe;
f1.isEat;
f1.isHarvest;
f1.weight;
f1.eat;
f2.pick
f1.eat();
f2.pick();
f3.bad();
f4.grown();
f5.growing();
f1.water();
f2.checkGrowth();
f1.checkWeight();