import java.util.Scanner;

public class Calc {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = getInt();
        int n2 = getInt();
        char operation = getOper();
        int res = calc(n1, n2, operation);
        System.out.println("Result: " +res);
    }


    public static int getInt() {
        System.out.println("Enter number:");
        int num;
        if(scanner.hasNext()){
            num = scanner.nextInt();
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

    public static int calc(int n1, int n2, char operation) {
        int res;
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
