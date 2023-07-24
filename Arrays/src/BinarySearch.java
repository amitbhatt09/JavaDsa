public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,5,8,10,12};
        int target = 1;
        int start =0, mid,end = arr.length-1,pos=-1;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(arr[mid] == target){
                pos = mid;
                break;
            }

            else if(arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid -1;
            }


        }
        if(pos ==-1)
        {
            System.out.println("Invalid element");
        }
        else
            System.out.println("index of "+target+" element is "+pos);

    }
}
