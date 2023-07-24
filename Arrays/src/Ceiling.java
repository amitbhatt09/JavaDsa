public class Ceiling
{
    public static void main(String[] args) {
        int []arr={90,88,78,67,56,44,40,30,20,10,4,3,1};

//        System.out.println(start>end?"decreasing":"increasing");
        int target = 68;
        System.out.println("Index of target "+target+" is "+search(arr,target));
    }
    static int search(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;


        while(start<=end) {
            int mid = start +(end - start)/2;
            if(target<arr[mid])
            {
                start = mid +1;
            }
            else if(target>arr[mid])
            {
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
