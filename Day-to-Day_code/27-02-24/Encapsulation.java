/**
 * Encapsulation
 */
public class Encapsulation {

    private int x; // Private member variable

    public void setX(int x) {
        this.x = x; // Accessing the member variable using this keyword
    }

    public int getX() {
        return x; // Returning the value of the member variable
    }

    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();

        System.out.println("Value before setting: " + e1.getX());
        e1.setX(5);
        System.out.println("\nValue after setting: " + e1.getX());

    }
}