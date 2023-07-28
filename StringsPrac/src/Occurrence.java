public class Occurrence {
    public static void main(String[] args) {
        String str = "As per the studies peoples have been living since 1000 years";
        System.out.println(str.indexOf('s',2));
        System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s')+1) +1));
    }
}
