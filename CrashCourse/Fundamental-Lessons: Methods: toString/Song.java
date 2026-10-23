public class Song {

    // Attributes, Instance Variable ... Hold Data for each song instance
    private String title;
    private String artist;
    private int plays; 

    // Constructer

    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;
        plays = 0;
    }

    // Methods. Behaviors

    public void play() {
        plays++;
    }
    public int  getPlays() {
        return plays;
    }
    public String toString(){
        return title + "By" + artist + "-" + plays + "plays"; 
    }



}