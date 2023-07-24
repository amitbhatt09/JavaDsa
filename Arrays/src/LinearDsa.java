
import java.util.Arrays;

public class LinearDsa {
    public static void main(String[] args) {
//       int [] a={1,3,5,6,34,50,6,23,34};
//       String b = Linear(a,34);
//        System.out.println(b);
        String a = "amit";
        char target = 'i';
        String result = Linear(a,target);
        System.out.println(result);

    int [][]t = {
            {22,3,4,54},
            {1,23,5,17},
            {7,0 ,9,110}
    };
    int tar =9;
    //int[] ans = TwoD(t,tar);//format is,it is returning the index position of that target element
        //System.out.println(Arrays.toString(ans));
        System.out.println(Maxi(t));
//    static String Linear(int [] a,int b)
//    {
//        for (int i :a) {
//
//                return(b+" found");
//
//
//        }
//        return("Invalid data");
    }
    static int Maxi(int[][]t) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < t.length; i++) {

            for (int j = 0; j < t[i].length; j++) {
                if (t[i][j] < min) {
                    min = t[i][j];
                }

            }

        }
        return min;
    }
    static String Linear(String a,char target)
    {
        for (int i = 0; i < a.length(); i++) {
            if(a.length()==0)
                return null;
        }
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==target)
                return ("character "+target+" found");
        }
        return "not found";
    }

}
