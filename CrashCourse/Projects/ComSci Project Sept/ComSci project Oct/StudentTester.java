public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("Big Nate", 10, 3.2, true);
        Student s2 = new Student("James Kocose", 11, 4.0, false);
        Student s3 = new Student("Stanial manion", 9, 2.7, true);

        s1.toString();
        s1.matchingEmail("BigNate", "@nhv.web");
        s1.updateGpa(0.1);
        s1.checkGpa();
        s1.getName();
        System.out.println(s1);

        s2.toString();
        s2.matchingEmail("JamesKocose", "@gmail.com");
        s2.updateGpa(.04);
        s2.checkGpa();
        s2.getName();
        System.out.println(s2);
    }
}
