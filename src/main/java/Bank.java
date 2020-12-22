import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank {
    public static int timesPaid = 7;

    static void creditBank(int credit, int period) throws IOException {

        if (credit > 0 && timesPaid > period){
            timesPaid--;
            System.out.println("Ваша задолженность = " + credit);
            System.out.println("Внесите сумму для погашения:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int repayment = Integer.parseInt(reader.readLine());
            creditBank(credit-repayment, 0);
            if (timesPaid == 0 && credit > 0 && credit != 0){
                System.out.println("Пожалуйста внесите " + credit);

            }
        }
        else if (credit < 0){
            System.out.println("Ваша переплата = " + credit);
        }
        else if (credit == 0) {
            System.out.println("Ваша задолженность погашенна");
        }
    }

    public static void main(String[] args) throws IOException {
        int credit = 700;
        creditBank(credit, 0);
    }
}
