import java.util.Scanner;

public class characterSorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char[]a=new char[10];
        char temp;
        int i,j;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the array with character ");
            a[i]=sc.nextLine().charAt(0);
        }
        for(i=9;i>=0;i--)
        {
        for(j=0;j<i;j++)
        {
            if(a[j]>a[j+1])
            {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
            }
        }
        System.out.println("the sorted list: ");
        {

        }
        }
    }