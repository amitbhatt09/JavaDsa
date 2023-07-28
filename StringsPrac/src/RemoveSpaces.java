public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "My name is amit bhatt";
        String newStr =" ";
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)!=' ')&&(str.charAt(i)!='\t'))
            {
                newStr+=str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
