import java.util.Scanner;

public class calculator {
    
    static Scanner sc = new Scanner(System.in);
    static String input;
    public static void main(String[] args)
    {   
        System.out.println("Input num1_operator_num2: ");
        do
        {
            
            input = sc.nextLine();
            Calculate(input);
            
        }while(!input.equals("exit"));

    }

    public static void Calculate(String input) {
    String Snum1 = "";
    String Snum2 = "";
    char operator = ' ';
    boolean operatorFound = false;

    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (Character.isDigit(c) || c == '.') {
            if (!operatorFound) {
                Snum1 += c;
            } else {
                Snum2 += c;
            }
        } else if (c == '+' || c == '-' || c == '*' || c == '/') {
            operator = c;
            operatorFound = true;
        }
    }

    double num1 = Double.parseDouble(Snum1);
    double num2 = Double.parseDouble(Snum2);

    switch (operator) {
        case '+': System.out.println(num1 + num2); break;
        case '-': System.out.println(num1 - num2); break;
        case '*': System.out.println(num1 * num2); break;
        case '/':
            if (num2 == 0) {
                System.out.println("Error: Division by zero");
            } else {
                System.out.println(num1 / num2);
            }
            break;
        default:
            System.out.println("Invalid operator.");
    }
}

}
