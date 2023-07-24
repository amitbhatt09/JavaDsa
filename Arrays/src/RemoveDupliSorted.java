import java.util.Arrays;

public class RemoveDupliSorted {
    public static void main(String[] args) {
        int []a ={1,2,2,3,4,4,4,5,6,6};
        int [] b= new int[10];
        int j =0;
        for(int i = 0;i<9;i++)
        {
            if(a[i]!=a[i+1])
            {
                b[j]= a[i];
                j++;
            }
            b[j]=a[9];
        }
        System.out.println(Arrays.toString(b));
    }
}
