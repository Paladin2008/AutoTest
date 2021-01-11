public class Test {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int d = 2;
        int x = 7;

        int min = 0;
        int max = 0;

        if (a < b && a < d && a < x) {
            min = a;
        } else if (b < a && b < d && b < x) {
            min = b;
        } else if (d < a && d < b && d < x) {
            min = d;
        } else if (x < a && x < b && x < d) {
            min = x;
        }
        System.out.println(min);

        if (a > b && a > d && a > x) {
            max = a;
        } else if (b > a && b > d && b > x) {
            max = b;
        } else if (d > a && d > b && d > x) {
            max = d;
        } else if (x > a && x > b && x > d) {
            max = x;
        }
        System.out.println(max);
    }
}