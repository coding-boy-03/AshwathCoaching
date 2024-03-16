public class MultiWithoutOper {

    public static int multi(int a, int b) {
        if (b == 0) {
            return 0;
        } else {

            return a + multi(a, b - 1);
        }
    }

    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("Multiple of " + a + " and " + b + " is: " + multi(a, b));

    }
}
