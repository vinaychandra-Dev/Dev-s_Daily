public class PrimeInRange {
    public static void main(String args[]) {
        int start = 10;
        int end = 50;

        System.out.println("\t *** Prime Numbers in Range ***");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static  boolean isPrime(int num) {

        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Is a prime number
    }

}
