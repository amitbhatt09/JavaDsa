import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter name to check vowels in it ");
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int num = str.length();
        for (int i = 0; i < num; i++) {
            if(str.charAt(i) == 'a'||str.charAt(i)  =='e'||str.charAt(i)  =='i'||str.charAt(i)  =='o'||str.charAt(i)  =='u'||str.charAt(i)  =='A'||str.charAt(i)  =='E'||str.charAt(i)  =='I'||str.charAt(i)  =='O'||str.charAt(i)  =='U')
            {
                System.out.println(str.charAt(i)  +" is a vowel");
            }
            else
                System.out.println(str.charAt(i) +"is Not a vowel");
        }
    }
}