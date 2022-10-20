package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_03 {
    public static void main(String[] args) {

        // Bir tamsayı listesindeki tüm çift sayıların çarpımını yazdiriniz.

        List<Integer> arrList = new ArrayList<>();

        arrList.add(4);
        arrList.add(35);
        arrList.add(3);
        arrList.add(14);
        arrList.add(5);
        arrList.add(18);

        System.out.println(arrList);

        int carpim = 1;

        for (int w : arrList) {

            if (w % 2 == 0) {
                carpim = carpim * w;
            }
        }
        System.out.println("Sayilarin carpimi : " + carpim);
    }
}
