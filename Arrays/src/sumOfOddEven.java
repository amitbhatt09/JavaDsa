import java.util.Scanner;

public class sumOfOddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[]a=new int[5];
        int i,s=0,s1=0;
        for(i=0;i<=4;i++)
        {
            System.out.println("Enter no");
            a[i]=sc.nextInt();
        }
        for(i=0;i<=4;i++)
        {
            if(a[i]%2==0)
            {
                s=s+a[i];
            }
            else
            {
            s1=s1+a[i];
            }
        }
        System.out.println("The sum of the odd no.---> " +s1);
        System.out.println("The sum of the even no.---> " +s);
    }
}
