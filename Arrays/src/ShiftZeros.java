import java.util.Arrays;

public class ShiftZeros {
    public static void main(String[] args) {
     int []arr= {1,2,0,4,0,5,9};
     int[] n = shiftZeros(arr);
     System.out.println(Arrays.toString(n));
    }
    static int[] shiftZeros(int []arr)
    {
        int m = Search(arr);
        for(int i=m;i<arr.length-1;i++)
        {
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        return arr;
    }
       static int Search(int []arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0)
                    return i;
        }
        return -1;
    }
}
