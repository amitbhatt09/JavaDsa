import java.util.Scanner;

public class add2arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a= new int[5];
        int[] b= new int[5];
        int[] c= new int[5];
        int i;
        for(i=0;i<=4;i++)
        {
            System.out.println("Enter values");
            a[i]=sc.nextInt();
        }
        for(i=0;i<=4;i++)
        {
            System.out.println("Enter values");
            b[i]=sc.nextInt();
        }
        for(i=0;i<=4;i++)
        {
            c[i]=a[i]+b[i];
            System.out.println("The sum of the array is " + c[i]);
        }

    }
}

