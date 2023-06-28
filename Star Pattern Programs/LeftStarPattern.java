import java.util.Scanner;
public class LeftStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row count : ");
        int count = sc.nextInt();

        for (int i=1;i<=count;i++)
        {
            for (int j=1;j<=(count-i);j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
