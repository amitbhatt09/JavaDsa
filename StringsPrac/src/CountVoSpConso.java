import java.util.Scanner;

public class CountVoSpConso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int v=0,sp=0,co=0;
        int num = str.length();
        for (int i = 0; i < num; i++) {
            if(str.charAt(i) == 'a'||str.charAt(i)  =='e'||str.charAt(i)  =='i'||str.charAt(i)  =='o'||str.charAt(i)  =='u'||str.charAt(i)  =='A'||str.charAt(i)  =='E'||str.charAt(i)  =='I'||str.charAt(i)  =='O'||str.charAt(i)  =='U')
            {
                v++;
            }
            else if (str.charAt(i)==' '){
                sp++;
            }
            else {
                co++;
            }

        }
        System.out.println("Number of vowels are "+v);
        System.out.println("Number of consonants are "+co);
        System.out.println("Number of spaces are "+sp);

    }
}
