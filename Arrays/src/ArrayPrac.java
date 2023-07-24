import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int [] [] arr1 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1 [i][j] = sc.nextInt();
            }
        }
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(Arrays.toString(arr1[i]));
//        }
        for(int [] a :arr1){
            System.out.println(Arrays.toString(a));
        }
    }
}
