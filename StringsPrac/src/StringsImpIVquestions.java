public class StringsImpIVquestions {
    public static void main(String[] args) {
        String str = "hello";
        String str1="world";
        System.out.println("Before swapping ");
        System.out.println("a is "+str);
        System.out.println("b is "+str1);
        str = str+str1;//helloworld
        str1 = str.substring(0,5);
        str=str.substring(5);

        System.out.println("After swapping");
        System.out.println("a is "+str);
        System.out.println("b is "+str1);

    }
}
