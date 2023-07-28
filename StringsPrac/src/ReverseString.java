import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string ");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        System.out.println("Original name "+reverse("Amit bhatt"));
//        int len = str.length();
//        The time complexity of this is 0(N)
//        char [] arr = str.toCharArray();
//        int left =0;
//        int right = len-1;
//        while(left<right)
//        {
//            char temp = arr[left];
//            arr[left]= arr[right];
//            arr[right]=temp;
//            left++;
//            right--;
//
//
//        }
//        String reverseName = new String(arr);
        // The time complexity of this is 0(N^2)
//        char ch;
//        String nstr =" ";
//        for (int i = 0; i < len; i++) {
//            ch=str.charAt(i);
//            nstr=ch+nstr;
//
//        }
//        System.out.println("Reversed sentence is "+nstr);



    }
    public static String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
}
