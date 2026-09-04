package CrashCourse;

import java.util.ArrayList;

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
        System.out.println(7 == 4);
        System.out.println(1 != 2); 

        // logical opperators
        // !     &&    ||
        // Not  ANd    OR

        boolean e = false; boolean f = true;

        // predict output: true or false?

        System.out.println(!e); // True
        System.out.println(!e && f); // False
        System.out.println(!e || f); // True
        System.out.println(e || f && !e); // True 

        System.out.println(e && f); //Short curcuits after checking e -- Java does not need to

        // Casting (converting)
        int g = (int)5.5;
        System.out.println(g);
        double h = (double)5/6;
        System.out.println(h);
        
        //Strings
        
        String s1 = "Goodnight";
        String s2 = " and "; 
        String s3 = "Goodbye"; 
        String result = s1 + s2 + s3;
        result += ", Cowboy ."; 
        System.out.println(result + '\n');

        //
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

        arry1[0] = 11;
        arry1[1] = 2;

        System.out.println("Remainder: " + arry1[0] % arry1[1]);

        int[] arry2 = {32, 52, 3, 64, 32};
        System.out.println(arry2);
        
        //2D arrays (grid or a table)

        int[][] arrayGrid1 = new int[4][3];
        // 0 0 0
        // 0 0 0
        // 0 0 0
        // 0 0 0 

        System.out.println("Rows:" + arrayGrid1.length);
        System.out.println("Collumns:" + arrayGrid1[0].length);

        int[][] arryGrid2 = { {7, 8, 9},
                               {4, 5, 6},
                               {1, 2, 3} };
        
        System.out.println(arryGrid2[0][1] + arryGrid2[2][2]); //access number 8 
        System.out.println(arryGrid2[2][2]);

        System.out.println(arryGrid2);

        // ARRAY LISTS
        // Can be any size. Los of built-in functions to help.
        // Avoid primitive data types. Special classes for Integer, Double, boolean, Strong. Called "wrapped"

        ArrayList<String> arrylst = new ArrayList<>();

        arrylst.add("Word 1");
        arrylst.add("Word 2");
        arrylst.add("Word 3");
        arrylst.remove(0);
        arrylst.add(0, "Word 4");
        arrylst.set(2, "Word 5");

        System.out.println(arrylst);
        System.out.println(arrylst.size());
        System.out.println(arrylst.get(2));




        }

}
