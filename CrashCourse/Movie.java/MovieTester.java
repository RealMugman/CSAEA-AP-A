class Movie {
   	String = movieName;
	Double = movieRating;
 
   	public Movie(String movieName, Double movieRating) {
		this.movieName = movieName
		this.movieRating = movieRating
 
   public void printInfo() {
      System.out.println(movieName + " — Rating: " + movieRating);
   }
}
}
public class MovieTester {
   public static void main(String[] args) {
      Movie one = new Movie("Inception", 9);
      Movie two = new Movie("Interstellar", 8);
      Movie three = new Movie("Tenet", 7);
      one.printInfo();
      two.printInfo();
      three.printInfo();
   }
}
