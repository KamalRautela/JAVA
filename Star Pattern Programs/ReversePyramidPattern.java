import java.util.Scanner;
public class ReversePyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row count : ");
        int count = sc.nextInt();

        for (int i=count;i>=1;i--)
        {
            for (int j=1;j<=(count-i);j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=((2*i)-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
