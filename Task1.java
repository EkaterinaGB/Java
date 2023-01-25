import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// int i = new Random().nextInt(k); //это кидалка случайных чисел!)
public static void main(String[] args) {
    int i = new Random().nextInt(2000);
    System.out.println(i);
    String z = (Integer.toBinaryString(i));
    System.out.println(z);
    int n = (z.length() - 1);
    System.out.println(n);

    ArrayList<Integer> mylist = new ArrayList<>();
        int j = i;
        while (j <= Short.MAX_VALUE) {
            if (j % n == 0) {
                mylist.add(j);
            }
            j += 1;
        }

        Object[] m1arr = mylist.toArray();
        System.out.println(Arrays.toString(m1arr));

        ArrayList<Integer> m2list = new ArrayList<>();

        int k = i;
        while (k>=Short.MIN_VALUE) {
            if (k % n != 0) {
                m2list.add(k);
            }
            k -= 1;
        }

        Object[] m2arr = m2list.toArray();
        System.out.println(Arrays.toString(m2arr));

}
    
}