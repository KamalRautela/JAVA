import java.util.Scanner;            // importing Scanner class from util package
public class Fibonacci_Series
{
    public static void main(String[] args) {
        int num1 = 0,num2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the series count : ");
        int count = sc.nextInt();         // input value using Scanner class
        Fibonacci(num1,num2,count);          // calling Fibonacci method
    }

    public static void Fibonacci(int n1,int n2,int c)         // Fibonacci method
    {
        int n3;
        System.out.print(n1+" "+n2);
        while (c>0)
        {
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
            c = c - 2;
        }

    }
}
