import java.util.Scanner;

public class selectionSorting {
    public static void main(String[] args) {
        int[]a= new int[5];
        Scanner sc= new Scanner(System.in);
        int i,j;
        for (i = 0;i<=4;i++)
        {
            System.out.println("Enter numbers in the array ");
            a[i]=sc.nextInt();
        }
        for(i=0;i<=3;i++)
        {
            for(j=i+1;j<=4;j++)
            {
                if(a[i]>a[j])
                {
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        }
        System.out.println("The sorted array is ");
        for(i=0;i<=4;i++)
        {
            System.out.println(a[i]);
        }
    }
}
