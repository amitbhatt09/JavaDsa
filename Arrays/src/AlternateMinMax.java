import java.util.Arrays;

public class AlternateMinMax {
    public static void main(String[] args) {
        int []arr = {1,3,4,5,8,10};
        int n=arr.length;
        int [] arr1 = new int[n];
        int max = arr[n-1];
        int min = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr1[i] = max;
            arr1[i+1] = min;
        }
        max--;
        min++;
        System.out.println(Arrays.toString(arr1));

    }
}
