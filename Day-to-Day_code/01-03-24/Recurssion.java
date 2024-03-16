/**
 * Recurssion
 */
/**
 * AddRec
 */

public class Recurssion {

    public static int SumBtwTer(int str, int end) {
        if (end > str) {
            return str + SumBtwTer(str + 1, end);
        }
        return str;
    }

    public static int SumBtwTer2(int str, int end) {
        if (end > str) {
            return end + SumBtwTer2(str, end - 1);

        }
        return end;
    }
    // ????/////////////////////////////

    public static int AddRec(int k) {
        if (k > 0) {
            return k + AddRec(k - 1);
        } else {
            return 0;
        }
    }

    public static int AddRec2(int k) {
        if (k == 0) {
            return 0;
        } else {
            return k + AddRec2(k - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println("Sum upto Kth first Method term :" + AddRec(10));
        System.err.println("Sum upto kth Second Method term :" + AddRec2(10));
        System.out.println("Sum between two numbers 1st Tec: " + SumBtwTer(5, 10));
        System.out.println("Sum betweem two Numbers 2nd Tecq :" + SumBtwTer2(5, 10));
    }

}