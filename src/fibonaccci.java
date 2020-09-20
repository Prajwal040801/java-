import java.util.Scanner;

public class fibonaccci {
    public static void main(String[] args) {
        int count,num1=0,num2=1;

        System.out.println("Enter the number of elements i the sequence: ");
        Scanner sc = new Scanner(System.in);
        count=sc.nextInt();
        System.out.println("Fibonacci series of "+count+" numbers: ");
        int i=1;
        while(i<=count)
        {
            System.out.println(num1+" ");
            int sumOfPrevTwo =num1+num2;
            num1=num2;
            num2=sumOfPrevTwo;
            i++;
        }
    }
}
