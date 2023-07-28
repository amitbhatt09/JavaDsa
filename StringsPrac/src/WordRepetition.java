import java.util.Scanner;

public class WordRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check it's repetition");
        String str = sc.nextLine();
        int len = str.length();
        int count,i;
        char j;
        for ( j = 'a'; j <= 'z'; j++) {
            count=0;
            for (i = 0; i < len; i++) {
                if(str.charAt(i)==j||j==Character.toLowerCase(str.charAt(i))){
                    count++;
                }

            }
            if(count>0)
            {
                System.out.println(j+" comes "+count+" times");
            }

        }


    }
}
