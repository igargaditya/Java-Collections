@FunctionalInterface
interface Footballer {
    int rating();

    default void position() {
        System.out.println("Prints the position");
    }

    static void defend() {
        System.out.println("Footballer is defending");
    }

    static void attack() {
        System.out.println("Footballer is attacking");
    }
}

class Defender implements Footballer {
    private int ratingPlayer;
    private String name;

    public int getRatingPlayer() {
        return ratingPlayer;
    }

    public void setRatingPlayer(int ratingPlayer) {
        this.ratingPlayer = ratingPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Defender(int ratingPlayer, String name) {
        this.name = name;
        this.ratingPlayer = ratingPlayer;
    }

    public int rating() {
        return ratingPlayer;
    }

    public void position() {
        System.out.println(name + " is a defender");
    }

    static void defend() {
        System.out.println("Defender is Defending");
    }
}

public class Default_Static_methods {
    public static void main(String[] args) {

        Footballer f1 = new Defender(90, "Ramos");
        // Static methods of interface only accessed by the interface name
        Footballer.defend();
        Footballer.attack();
        // Static method of implentation class has no idea about the static method of
        // interface and hence no inheritance of static methods
        Defender.defend();

        // Default methods can be overwritten
        f1.position();

    }
}
