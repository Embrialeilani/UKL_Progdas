import java.util.ArrayList;
import java.util.List;

public class Syulit2 {

    public static void main(String[] args) {
        int[] array = {4, 5, -7, 8, -9, 3};
        
        List<Integer> negatif = cariElemenNegatif(array);
        
        if (negatif.isEmpty()) {
            System.out.println("Array tidak mengandung elemen negatif.");
        } else {
            System.out.print("Array mengandung elemen negatif: ");
            for (int i = 0; i < negatif.size(); i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(negatif.get(i));
            }
            System.out.println();
        }
    }

    public static List<Integer> cariElemenNegatif(int[] array) {
        List<Integer> negatif = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negatif.add(array[i]);
            }
        }
        
        return negatif;
    }
}


