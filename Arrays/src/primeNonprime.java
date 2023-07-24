import java.util.Scanner;

public class primeNonprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int i, k, c;
        System.out.println("Write numbers ");

        for (i = 0; i <= 4; i++) {

            a[i] = sc.nextInt();
        }
        for (i = 0; i <= 4; i++) {
            c = 0;
            for (k = 1; k <= a[i]; k++) {
                if (a[i] % k == 0) ;
                {
                    c++;
                }
            }

                if (c == 2) {
                    System.out.println(a[i] + " is prime");
                } else {
                    System.out.println(a[i] + " is not prime");
                }
            }
        }
    }





