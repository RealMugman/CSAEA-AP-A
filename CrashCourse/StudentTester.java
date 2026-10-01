class Student {
   	String = studentName;
	Int = studentGrade; 
 
   public Student(String studentName, int studentGrade) {
		this.studentName = studentName;
		this.studentGrade = studentGrade; 
	
 
   public void printInfo() {
      System.out.println(StudentName + " — Grade " + studentGrade);
   }
}
 
// Tester class that creates and displays students
public class StudentTester {
   public static void main(String[] args) {
      Student one = new Student("Jordan", 9);
      Student two = new Student("Taylor", 10);
      Student three = new Student("Morgan", 11);
 
      one.printInfo();
      two.printInfo();
      three.printInfo();
   }
}
