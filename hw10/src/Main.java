public class Main {
    public static void main(String[] args) {

        int a = 387;
        int b = 6381;
        int r = 0;
        int gcd = 1;
        boolean found = false;
        while (found == false) {
            r = a % b;
            if (r == 0) {
                found = true;
                gcd = b;
            }
            else {
                a = b;
                b = r;
            }
        }
        System.out.println(gcd);
    }
}