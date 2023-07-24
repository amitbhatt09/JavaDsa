public class PeakInMountainArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,3,2,1,0,-1};
        int max = -123242;

            for (int i = 0; i < arr.length; i++) {
                if(max<arr[i]){
                    max = arr[i];
                }
            }
        System.out.println(max);


    }
}
