package indexOf;

public class EmailTester {
    public static void main(String[] args) {

        String word = "banana";
    
        System.out.println(word.indexOf("b"));   
        System.out.println(word.indexOf("a")); 
        System.out.println(word.indexOf("nan")); 
        
        System.out.println(word.indexOf("z"));   
        System.out.println(word.indexOf("B"));  
        
        Email c = new Email("cv@nhvweb.net");
        Email jojo = new Email("jojo@nhvweb.net");

        System.out.println(c.toString());

        System.out.println(c.getAtIndex());
        System.out.println(jojo.getAtIndex());    
    }
}