public class FizzBuzz {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i < n + 1; i++) {
            if ((i % 3 == 0) && (i % 5 != 0)) {
                System.out.println(i + "fizz");
            } else if ((i % 3 != 0) && (i % 5 == 0)) {
                System.out.println(i + "buzz");
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + "FizzBuzz");
            }
        }
    }
}
