import java.util.Scanner;

public class assignment1switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b,res;
        char op;
        System.out.println("Enter the value of a and b: ");


        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the operator: ");
        op = sc.next().charAt(0);
        switch (op) {
            case '+':
                res = a+b;

                break;

            case '-':

                res = a-b;
                break;

            case '*':

                res = a*b;
                break;

            case'/':

                res = a/b;
                break;
            default:
                System.out.println("Invalid");
                return;


        }
        System.out.println(a+""+op+""+b+": "+res);
    }
}

