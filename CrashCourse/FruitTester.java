public class FruitTester {
    public static void main(String[] args) {

        Fruit apple = new Fruit("Apple", true, 1);
        Fruit Bananna = new Fruit("Bannana", false, 0);

        apple.water();
        Bananna.checkWeight();
    }
}
