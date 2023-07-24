import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []a = new int[5];
        int i;
        for (i = 0; i <=4 ; i++)
        {
            System.out.println("Enter numbers ");
            a[i]=sc.nextInt();
        }
        System.out.println("Array is : ");
        for ( i = 0; i <=4; i++) {
            System.out.println(a[i]);

        }

    }
}