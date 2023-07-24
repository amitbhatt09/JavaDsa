

public class TargetSort {
    public static void main(String[] args) {
        int[] arr = {12,19,32,45,50,61,78};
        int start =0;
        int end = arr.length-1;

        int tar = 78;

        while(start<=end)
        {
            int mid = (start + (end))/2;
            if(arr[mid]==tar)
            {
                System.out.println("Element is in "+mid);
                break;
            }
            else if(arr[mid]>tar)
            {
                end = mid -1;
            }
            else {
                start = mid +1;
            }

        }


    }
}
