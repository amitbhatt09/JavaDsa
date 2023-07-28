import java.util.Arrays;

public class RemoveExtras {
    public static void main(String[] args) {
        String str = "こんにちは元気ですか amit 465454564563";
        //regular Expression [^a-zA-z0-9] ^ sign means not
        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
//The ^ symbol inside the square brackets negates the character class, making it match characters that are NOT in the specified range.
//"": This is the replacement string provided in the replaceAll() method. It's an empty string, which means that any
//        character matching the pattern in step 3 will be replaced with nothing (i.e., removed from the original string).