package CrashCourse;

public class Fruit {
    String name;
    boolean isSweet;
    boolean isSour;
    String color;
    int age;
    boolean isPickedFromGround;
    boolean isPickedFromTree;
    boolean isRipe;
    boolean isEat;
    boolean isHarvest;

    public void fruit(String name, boolean isRipe, int age) {
        this.name = name;
        this.isRipe = isRipe;
        this.age = age;
    }

    public void eat() {
        isEat = true;
    }
    public void Pick() {
        isRipe = true;
    }
    public void Bad() {
        isRipe = false;
    }
    public void Grown() {
        isHarvest = true;
    }
    public void Growing() {
        isHarvest = false; 
    }
}


