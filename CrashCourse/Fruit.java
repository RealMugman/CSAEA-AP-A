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
    }
    public void Growing() {
        isHarvest = false; 
    }
}


