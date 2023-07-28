import java.util.Scanner;

public class StartingToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String str = sc.nextLine();
        String s = "";
        String []words = str.split("\\s");
        for(String w :words)
        {
            String first = w.substring(0,1);
            String rest = w.substring(1);
            s=s+first.toUpperCase()+rest+" ";
        }
        System.out.println(s.trim());
        }
    }

