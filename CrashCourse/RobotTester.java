public class RobotTester {
    public static void main(String[] args) {
        // Object specific instance of a class
        // Instantiation new + constructer call
        Robot r1 = new Robot("bobby", "Rx28Bs2", 18.2);
        Robot r2 = new Robot("Billy", "B25kc3a", 32.4);

        Robot r3 = r1;
        System.out.println(r3);
        r3.setName("bobby");
        System.out.println(r1.getName());

        System.out.println(r1 == r3); // True
        System.out.println(r1 == r2); // False
        System.out.println(r1.equals(r3)); // True

    }
}
