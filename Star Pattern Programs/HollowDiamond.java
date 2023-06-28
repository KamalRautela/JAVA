import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row count : ");
        int count = sc.nextInt();

        // Upper half Pattern
        for (int i=1;i<=count;i++)
        {
            for (int j=1;j<=(count-i);j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=((2*i)-1);k++)
            {
                if (k==1 || k==((2*i)-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        //Lower half pattern
        for (int i=count;i>=1;i--)
        {
            for (int j=1;j<=(count-i);j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=((2*i)-1);k++)
            {
                if (k==1|| k==((2*i)-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
