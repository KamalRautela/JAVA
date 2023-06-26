import java.util.Scanner;
public class Pallindrome_Number
{                             // A number which is same as its reverse for eg 202 = 202 (reverse)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();

        int flag = check_Pallindrome(num);   // calling checkPallindrome method
        if (flag==1)
            System.out.println("Pallindrome Number");
        else
            System.out.print("Not a Pallindrome Number");

    }

    public static int check_Pallindrome(int n)
    {
        int temp = n;
        int result = 0;
        int rem;
        while (temp>0)
        {
            rem = temp%10;
            result = (result*10) + rem;
            temp = temp/10;
        }
        if (result == n)
            return 1;
        else
            return 0;
    }
}
