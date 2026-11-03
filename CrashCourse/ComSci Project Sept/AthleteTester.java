public class AthleteTester {
    public static void main(String[] args) {

        Athlete a = new Athlete("football", true, "Jeff", false);
        Athlete b = new Athlete("Soccer", false, "Nigel", true);

        a.checkState();
        

        a.rest(9,true);
        a.workout();
        a.workout();
        a.trainSpeed();
        a.watchFilm();
        a.watchFilm();
        a.watchFilm();
        a.maxLift();
        a.fortyTime();
        a.eat(2.3);
        a.checkWeight();

        a.checkState();


        b.checkState();

        b.rest(5, true);
        b.getName();
        b.setName("Jack");
        b.trainSpeed();
        b.maxLift();
        b.fortyTime();
        b.checkWeight();

        b.checkState();

    }
}
