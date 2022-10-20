package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists_02 {
    public static void main(String[] args) {
        // Bir tamsayi ArrayLists olusturun ve 5`ten onceki tum list ogelerin toplamini yazdirin


        List<Integer> arr = new ArrayList<>();
        arr.add(17);
        arr.add(3);
        arr.add(56);
        arr.add(21);
        arr.add(5);
        arr.add(30);

        int sum = 0;

        for (int w : arr) {

            if (w==5){
                break;
            }
            sum += w;
        }

        System.out.println(sum);


















    }
}
