import java.util.Arrays;

public class ShiftZerosNew {
    public static void main(String[] args) {
            int[] arr = {2,4,0,5,0,0,6,7,8,0};
            int[]n = Shift(arr);
        System.out.println(Arrays.toString(n));
    }
    static int [] Shift(int[] arr)
    {
        if(arr.length==1)
            return arr;

        int [] newArray = new int[arr.length];
        int count =0;
        for(int num : arr)
        {
            if(num!=0)
            {
                newArray[count] = num;
                count++;
            }
        }
        return newArray;
    }

}
