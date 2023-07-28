import java.util.Scanner;

public class ReplaceStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String find,replace;
        System.out.println("what to replace");
        find = sc.nextLine();
        System.out.println("what to enter in place");
        replace = sc.nextLine();
        System.out.println("the new String is \n"+str.replace(find,replace));

    }
}
