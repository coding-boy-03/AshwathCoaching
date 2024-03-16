public class AddWithoutOper {

    public void add(int a, int b) {
        int carry = 0, sum;
        while (b != 0) {
            sum = a ^ b;
            carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        AddWithoutOper obj = new AddWithoutOper();
        obj.add(5, 5);
    }
}
