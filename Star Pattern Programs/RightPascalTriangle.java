import java.util.Scanner;
public class RightPascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row count : ");
        int count = sc.nextInt();

        // Upper Half
        for (int i=1;i<=count;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Half
        for (int i=1;i<=count;i++)
        {
            for (int j=1;j<=(count-i);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
