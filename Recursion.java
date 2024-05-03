public class Recursion {
    public static int h(int n) {
        if (n < 3) {
            return 1;
        }

        int[] h = new int[n + 1];
        h[0] = h[1] = h[2] = 1;

        for (int i = 3; i <= n; i++) {
            h[i] = h[i - 1] + 6 * h[i - 2] - h[i - 3];
        }

        return h[n];
    }

    public static void main(String[] args) {
        System.out.println("h(100) = " + h(100));
    }
}
