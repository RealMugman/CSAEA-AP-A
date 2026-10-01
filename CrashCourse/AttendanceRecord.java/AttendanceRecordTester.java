class AttendanceRecordTester {
   public static void main(String[] args) {
      P1 new = Attendance("Jordan", 4);
	   P2 new = Attendance("Riley" , 7);
 
      P1.markPresent();
 
      System.out.println(P1 + "\n" + P2);
   }
}

public class AttendanceRecord {
   private String name;
   private int daysPresent;
 
   public AttendanceRecord(String n, int d) {
      name = n;
      daysPresent = d;
   }
 
   public void markPresent() {
      daysPresent++;
   }
 
   public void printAttendance() {
      System.out.println(name + " — Days Present: " + daysPresent);
   }
}
