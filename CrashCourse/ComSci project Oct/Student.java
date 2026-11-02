public class Student { 
    private String name;
    private double gpa; 
    private boolean isEnrolled;
    private int gradeLevel;

    public Student(String name, int gradeLevel, double gpa, boolean isEnrolled) {
        this.name = name;
        this.gradeLevel = gradeLevel; 
        this.gpa = gpa; 
        this.isEnrolled = isEnrolled;
    }
        public String toString() {
            return "student name: " + name + ",Grade: " + gradeLevel + ", Gpa: " + gpa + ", Enrolled: " + isEnrolled;
        }
        public boolean matchingEmail(String email, String exDomain) {
            int atIndex = email.indexOf("@");
            if (atIndex == -1) {
                return false; 
            }
            String domain = email.substring(atIndex + 1);
            return domain.equals(exDomain); 
        }
        public boolean updateGpa(double pointsAdded) {
            if (!isEnrolled) {
                return false;
            }
            this.gpa += pointsAdded;
            if (this.gpa > 4.0) {
                this.gpa = 4.0;
            }
            return true; 
        }
        public double checkGpa() {
            return gpa;
        }
        public String getName() {
            return name; 
        }  
}