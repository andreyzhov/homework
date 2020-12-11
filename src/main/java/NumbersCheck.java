import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num(Integer.parseInt(reader.readLine()));
    }
    public static void num (int num){
        isPositive(num);
        isPrime(num);
        isDivision(num,2);
        isDivision(num,3);
        isDivision(num,5);
        isDivision(num,6);
        isDivision(num,9);
    }
    private static void isPositive(int positive){
        if (positive > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    private static void isPrime (int prime){
        for (int i = 2; i < prime; i++) {
                if ( prime % i == 0) {
                    System.out.println("This number is not prime!");
                    return;
                }
        }
        System.out.println("Prime");
    }
    private static void isDivision (int num, int division){
        if (num % division == 0){
            System.out.println("remainder of the division = 0");
        }
        else {
            System.out.println("remainder of division is " + num % division);
        }
    }

}