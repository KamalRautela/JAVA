import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your number : ");
        num = sc.nextInt();
        int flag = checkPrime(num);           // calling checkPrime method
        if (flag==1)
            System.out.println(" Not a prime number");
        else
            System.out.println("Prime number");
    }
    public static int checkPrime(int n)
    {
        int i = 2;
        if(n<i)
        {
            return 1;  // return statement
        }
        while (n>i)
        {
            if (n%i==0)
            {
                return 1;
            }
            i = i + 1;   // Incrementation
        }
        return 0;
    }
}
