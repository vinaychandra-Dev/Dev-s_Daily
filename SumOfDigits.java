public class SumOfDigits {
    public static void main(String args[]){

        int num  = 1234;
        int sum = 0;

        System.out.println("The Original Number is : " + num);

        while(num > 0){
            int digit = num % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            num /= 10; // Remove the last digit
        }

        System.out.println("The Sum of the Digits is : " + sum);

    }
}
