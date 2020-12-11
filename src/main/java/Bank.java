import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank {
    static void creditBank(int credit) throws IOException {
        int result;

        //result = credit - repayment;
        if (credit > 0){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int repayment = Integer.parseInt(reader.readLine());
            System.out.println(credit - repayment +" - Ваша задолженность" );
            creditBank(credit-repayment);
        }
        else if (credit < 0){
            System.out.println("Ваша переплата = " + credit);
        }
        else {
            System.out.println("Ваша задолженность погашенна");
        }
    }

    public static void main(String[] args) throws IOException {
        int credit = 700;
        creditBank(credit);
    }
}
