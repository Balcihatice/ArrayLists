package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_01 {
    public static void main(String[] args) {
         /*
        Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
         */

        List<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(3);
        arr.add(56);
        arr.add(21);
        arr.add(5);

        int sum = 0;

        for (int w : arr) {
            sum += w;
        }
        System.out.println(sum);
    }
}
