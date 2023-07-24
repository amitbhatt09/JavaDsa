import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,count;
        char j;
        String str = new String();
        System.out.println("Enter Name");
        str = sc.nextLine();
        for (j= 'a'; j <='z' ; j++) {
            count =0;
            for (i = 0; i <str.length() ; i++) {
                if(j==str.charAt(i))
                    count++;
            }
            if(count>0)
            {
                System.out.println(j + " comes"+ count +" times");
            }
        }

    }
}
