import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();

        int result = Fact(num);
        System.out.println("Factorial of "+num+" is : "+result);
    }
    public static int Fact(int n)
    {
        int fact = 1;
        while (n>1)
        {
            fact = fact * n;
            n = n-1;
        }
        return fact;
    }
}
