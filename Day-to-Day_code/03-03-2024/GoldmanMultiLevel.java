/**
 * GoldmanMultiLevel
 * This challenge implements levels of friendship in java classes Acquaintance A
 * person one knows slightly but who is not a close friend. Friend A person with
 * whom one has a close bond best friend A persons closest friend.
 * As the level
 * of Friendship increase you get to know more about the person. one the basic
 * of knowledge you have about a person: Bestfriend>friend>acquaintance.
 * Implement these levels in terms of 3 java classes class Acquaintance : Has an
 * attribute name (variable of type String) Constructor: Acquaintance (String
 * name) Has a method public void getstatus which prints "[name] is just an
 * acquaintance.\n" class Friend class friend inherits class Acquaintance
 * constructor:Friend(string name,String home town) has attribute
 * hometown(variable of type string) has a method public void getstatus which
 * prints "[name ]is a friend and he is from [home Town].\n" class BestFriend
 * class BestFriend inherits class Friend constructor:Best Friend(String
 * name,String homeTown,String FavourtieSong) Has attribute "favoriteSong"
 * (variable of type String) have a method public void getStatus which prints
 * "[name] is my best friend.he is from [home town] and his favorite song is
 * [favoriteSong]." sample input 4 Acquaintance jaded Friend jake florid
 * BestFriend Ryan utah Dangerous Friend Davis Texas sample output jaden is just
 * an acquaintance. jake is a friend he is from Florida.Ryan is my best
 * friend.He is from utah and his favorite song is Dangerous.David is a friend
 * and he is from Texas
 */
class Acquaintance {
    public String name;

    // constructor for Acquaintance Class
    public Acquaintance(String name) {
        this.name = name;
    }

    // method to print status of acquaintance
    public void getStatus() {
        System.out.println(name + " is just an acquaintance.");
    }

}

class Friend extends Acquaintance {
    public String hometown;

    // constructor for Friend Class
    public Friend(String name, String homeTown) {
        super(name);
        this.hometown = homeTown;
    }

    @Override
    public void getStatus() {
        System.out.print("Name : " + name + " is a friend and he is from " + hometown + ".\n");
    }
}

class BestFriend extends Friend {
    public String favoriteSong;

    // constructor for BestFriend Class
    public BestFriend(String name, String homeTown, String favoriteSong) {
        super(name, homeTown);
        this.favoriteSong = favoriteSong;
    }

    @Override
    public void getStatus() {
        System.out.println("Name : " + name + "is a Best friend and he is from" + hometown
                + ".\nHis favourite song is " + favoriteSong + "");
    }
}

/*
 * 
 */
public class GoldmanMultiLevel {
    public static void main(String[] args) {
        Acquaintance a = new Acquaintance("Ashwath");
        Friend f = new Friend("Abhi", "Delhi");
        BestFriend bf = new BestFriend("Puneeth", "Bangalore", "Yeh Hai Dillagi");
        a.getStatus();
        f.getStatus();
        bf.getStatus();

    }

}
