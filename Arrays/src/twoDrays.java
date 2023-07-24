import java.util.Scanner;
import java.lang.*;

public class twoDrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int i, j;
        for (i = 0; i <= 2; i++)
        {
            for (j = 0; j <= 2; j++)
            {
                System.out.println("Enter number ");
                a[i][j] = sc.nextInt();

            }
        }
        for (i = 0; i <= 2; i++)
        {
            for (j = 0; j <= 2; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
    }
}

