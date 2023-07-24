public class AgnosticBS {
    public static void main(String[] args) {
//        int []arr={90,88,78,67,56,44,40,30,20,10,4,3,1};
        int [] arr={1,2,3,4,5,6,22,33,44,55,67,70,80,100};
        int target = 67;
        System.out.println("Index of target "+target+" is "+search(arr,target));
    }
    static int search(int [] arr, int target) {
        boolean isAsc = arr[0]<arr[arr.length-1];
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
              if(target==arr[mid]){
                  return mid;
              }

              if(isAsc){
                  if(target>arr[mid])
                  {
                      start = mid +1;
                  } else {
                      end = mid-1;
                  }
              }
              else {
                  if(target>arr[mid])
                  {
                     end = mid -1;
                  } else{
                      start = mid+1;
                  }
              }


        }
        return -1;
    }
}
