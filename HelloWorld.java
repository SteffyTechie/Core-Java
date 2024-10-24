 import java.util.Scanner;
interface Reverse {
    int check(int number) throws InvalidNumberException;
}
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     try {
        System.out.println("Enter a number:");
        int number = sc.nextInt();   
        Reverse reverse = (n) -> {
            if (n < 0) {
                throw new InvalidNumberException("Negative numbers are not allowed");
            }
            
            int rev = 0;
            for(;n!=0;n=n/10) {
                int sum = n % 10;
                rev = rev * 10 + sum;
                            }
            return rev;
        };
	 int reversedNumber = reverse.check(number);
           
            System.out.println("Reversed number: " + reversedNumber);
        } catch (InvalidNumberException e) {
         
            System.out.println("Error: " + e.getMessage());
        }
    }
}
