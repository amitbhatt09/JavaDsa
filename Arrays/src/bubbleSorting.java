import java.util.Scanner;

public class bubbleSorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] a= new int[5];
        int i,j;

        for (i=0;i<=4;i++)
        {
            System.out.println("Enter array");
            a[i]=sc.nextInt();
        }
        for(i=4;i>=1;i--)
        {
            for(j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }
        System.out.println("The sorted list is: ");
        for(i=0;i<=4;i++)
        {
            System.out.println(a[i]);
        }
    }
}
