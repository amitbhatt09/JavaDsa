import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        System.out.println(isAnagram("art","RAT"));
    }
    public static boolean isAnagram(String s1, String s2){
        String str1 = s1.replaceAll("\\s"," ");
        String str2 = s2.replaceAll("\\s"," ");

        if(str1.length()!=str2.length())
        {
        }

        else{
            char []arr1=str1.toLowerCase().toCharArray();
            char []arr2=str2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);
        }
        return false;
    }
}
