import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class assignment2factorialnumber {
    public static void main(String[] args) {
        int i, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number for factorial to be calculated");
        int number = sc.nextInt();
        for (i = 1; i <= number; i++)
            fact = fact * i;

        System.out.println("Factorial of "+number+" is: "+fact);

    }


}
