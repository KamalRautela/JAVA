import java.util.Scanner;
public class Armstrong_Number {  /* A number which is equal to the pow of number of digits
                                    for eg  153 = 1^3 + 5^3 + 3^3
                                             153 = 1 + 125 + 27 = 153*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int flag = checkArmstrong(num);
        if (flag == 1)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }

    public static int checkArmstrong(int n)
    {
        int pow = 0,sum = 0,last = 0,temp = n;
        while (temp>0)
        {
            temp = temp/10;
            pow = pow + 1;
        }
        temp = n;
        while (temp>0)
        {
            last = temp%10;
            sum = (int)(sum + Math.pow(last,pow));  // using power function from math class
            temp = temp/10;
        }
        if (sum==n)
            return 1;
        else
            return 0;
    }
}
