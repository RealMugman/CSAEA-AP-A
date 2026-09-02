package CrashCourse;

public class CrashCourse {   //Class header
    
    public static void main(String[] args){

        // comments 

         /*Multiline
        comment
        here */

        System.out.print("Hello");
        System.out.println("world"); //auto prints on a new line
        System.out.println("Hello world"); 

        //variable declarations
        //Primative variables 
        int a; 
        double b; //decimal, or float
        boolean c; //true or false 

        a = 4;
        b = 5.5; 
        c = false; //lowercase 

        //Arithmetic operators
        // + - / * %
        // += -= /= %= 

        int d = 3;
        d += 7;
        System.out.println("d = " + d);
        
        // increment and decrement by one:
        // -- ++ 
        d --; 
        d ++;
        d ++;
        System.out.print("d is now equal to" + d);

        //Comparisons (always return true or false)
        // < > <= >= == != 
        System.out.println(4 < 5); 
    }

}
