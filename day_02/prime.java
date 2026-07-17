public class prime {

    public static boolean checkPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i%j == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int ans = 0;
        for (int i = 1; i < 51; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
                ans++;
            }
        }
        System.out.print("\n"+ans);
    }
}
