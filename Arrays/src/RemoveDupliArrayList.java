import java.util.*;

public class RemoveDupliArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(3);
        num.add(4);
        num.add(4);
        num.add(4);
        num.add(5);
        num.add(5);
        System.out.println("Before removal of duplicates " +num);
//        ArrayList <Integer> unique =new ArrayList<>();
//        for (int i = 0; i < num.size(); i++) {
//            if(!unique.contains(num.get(i)))
//            {
//                unique.add(num.get(i));
//            }
//        }
//

        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        list.addAll(num);
        num.clear();
        num.addAll(list);
        System.out.println("After removal of duplicates "+list);
    }

}
