import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        System.out.println("Enter array");
        int []arr ={1,2,3,4};
        int sum=arr[0];
        int i;
        for(i=1;i<4;i++)
        {
            sum=sum+arr[i];
            arr[i]=sum;
        }

            System.out.print(Arrays.toString(arr));


    }
}
