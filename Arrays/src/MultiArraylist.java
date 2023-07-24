import java.util.Arrays;

public class MultiArraylist {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(sc.nextInt());
//            }
//        }
//        System.out.println(list);

        int[] arr = {1, 4, 6, 7, 80, 2,3};
//            swap(arr, 1, 4);
            reverse(arr,arr[0],arr[arr.length-1]);
            System.out.println(Arrays.toString(arr));
//            System.out.println(Arrays.toString(arr));
//        System.out.println(maxi(arr,0,4));


    }

        static void swap(int[] arr, int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
//    static int maxi(int[] arr,int start, int end) {
//        int m = arr[0];
//        for (int i = start; i <end; i++) {
//            if (m < arr[i] && m != arr[i]) {
//               m=arr[i];
//            }
//        }
//        return m;
//    }
    static int[] reverse(int []arr,int start,int end)
    {
         start= arr[0];
         end = arr[arr.length-1];
         for (int i = 0; i <arr.length ; i++) {
         swap(arr, start, end);
        }
         start++;
         end--;
        return arr;
    }


}
