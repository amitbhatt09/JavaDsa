import java.util.Arrays;

class AlterateNumPosiNegi {
    public int[] rearrangeArray(int[] nums) {
        int[] res= new int[nums.length];
        int[] p= new int[nums.length/2];
        int[] n= new int[nums.length/2];
        int i,j;
        i=j=0;

        for(int num:nums){
            if(num>0){
                p[i++]=num;

            }else n[j++]=num;
        }
        int k=0;
        for(int l=0;l<nums.length;l+=2){
            res[l]=p[k];
            res[l+1]=n[k];
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        AlterateNumPosiNegi al = new AlterateNumPosiNegi();
        int[]nums={3,1,-2,-5,2,-4};
       int [] result = al.rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
}