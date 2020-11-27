import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int operand1 = Integer.parseInt(reader.readLine());
        String sign = reader.readLine();
        int operand2 = Integer.parseInt(reader.readLine());
        switch (sign) {
            case "*":{
                System.out.println(operand1 * operand2);
                break;
            }
            case "/":{
                System.out.println(operand1 / operand2);
                break;
            }
            case "+":{
                System.out.println(operand1 + operand2);
                break;
            }
            case "-": {
                System.out.println(operand1 - operand2);
                break;
            }
            case "%":{
                System.out.println(operand1 % operand2);
                break;
            }
            default:{
                System.out.println("Enter the logical operator");
                break;
            }
        }
    }
}