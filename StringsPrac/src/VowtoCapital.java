public class VowtoCapital {
    public static void main(String[] args) {
        String str = "amit bhatt is very good boy";
        StringBuilder modifiedStr = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                c = Character.toUpperCase(c);
            }
            modifiedStr.append(c);
        }

        System.out.println("Modified string: " + modifiedStr.toString());
    }
}
