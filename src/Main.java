//import java.sql.PreparedStatement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arr2.add( (int) ( 33 + Math.random() * (77  + 1 - 33 ))  );
        }

        for (int a = 0; a < arr2.size() ; a++) {
            for (int i = 0; i < arr2.size() -1; i++) {
                if (dalybaBeLiekanos(arr2.get(i)) > dalybaBeLiekanos(arr2.get(i + 1))) {
                    int t1 = arr2.get(i);
                    arr2.set(i, arr2.get(i + 1));
                    arr2.set(i + 1, t1);
                }
            }
        }


        public static int dalybaBeLiekanos(int duotasSkaicius) {
            int sveikasSkaicius = 0;

            for (int i = 2; i < duotasSkaicius; i++) {
                if ((duotasSkaicius % i) == 0) {
                    sveikasSkaicius++;
                } else sveikasSkaicius = sveikasSkaicius;
            }

            return sveikasSkaicius;
        }



    }
}



