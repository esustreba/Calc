import java.util.Formatter;
import java.util.Scanner;

public class Calc {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double n1 = getInt();
        double n2 = getInt();
        char operation = getOper();
        double res = calc(n1, n2, operation);

        Formatter fmt = new Formatter();
        fmt.format("%f ", res);
        System.out.println("Result: " +fmt);
    }


    public static double getInt() {
        System.out.println("Enter number:");
        double num;
        if(scanner.hasNext()){
            num = scanner.nextDouble();
        }else {
            System.out.println("Incorrect number. Try again.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOper() {
        System.out.println("Enter operation:");
        char operation;
        if(scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Incorrect operation. Try again.");
            scanner.next();
            operation = getOper();
        }
        return operation;
    }

    public static double calc(double n1, double n2, char operation) {
        double res;
        switch (operation){
            case '+':
                res = n1+n2;
                break;
            case '-':
                res = n1-n2;
                break;
            case '*':
                res = n1*n2;
                break;
            case '/':
                res = n1/n2;
                break;

            default:
                System.out.println("Try again");
                res = calc(n1, n2, getOper());
        }

        return res;
    }
}
