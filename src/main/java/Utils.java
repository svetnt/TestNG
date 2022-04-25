import java.util.ArrayList;
import java.util.Arrays;

public class Utils {
    public static void main(String[] args) {

        String[] arr1s = {"Russ", "Turk", "German", "China"};
        int[] arr1 = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] arr2 = {8, 9, 4, 2};
        System.out.println(Arrays.toString(ReverseArray(arr2)));

    }

    /*9.8 Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
     Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
      и среднее среди всех значений между 2-мя индексами.
     */

    public static int[] MinMaxAve(int[] arr, int ind1, int ind2) {
        int[] rezult = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        int sum = 0;
        try {
            for (int i = ind1; i <= ind2; i++) {
                if (arr[i] < rezult[0]) {
                    rezult[0] = arr[i];
                }
                if (arr[i] > rezult[1]) {
                    rezult[1] = arr[i];
                }
                sum += arr[i];
            }
            rezult[2] = sum / (ind2 - ind1 + 1);
            return rezult;
        } catch (Exception e) {
            System.out.println("Ошибка данных");
            return null;
        }
    }

    /*  9.9 	Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает
    массив общих элементов.   */
    public static Integer[] Intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            for (int i : arr1) {
                for (int j : arr2) {
                    if (j == i) {
                        list.add(i);
                        break;
                    }
                }
            }
            Integer[] rezult = new Integer[list.size()];
            list.toArray(rezult);
            return rezult;
        } catch (Exception e) {
            System.out.println("Ошибка данных");
            return null;
        }
    }

   /*10.	Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает
   значения пиковых элементов (элементы, которые больше своих соседей).
    Test Data:{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}*/

    public static Integer[] PeakElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            if (arr[0] > arr[1]) {
                list.add(arr[0]);
            }
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    list.add(arr[i]);
                }
            }
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                list.add(arr.length - 1);
            }
            Integer[] rezult = new Integer[list.size()];
            list.toArray(rezult);
            return rezult;
        } catch (Exception e) {
            System.out.println("Ошибка данных");
            return null;
        }
    }

    /*11. Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает
     “перевернутый” массив. Test Data:{2, 7, 3, 10} → {10, 3, 7, 2}*/
    public static int[] ReverseArray(int[] arr) {
        int[] rezult = new int[arr.length];
        int j = 0;
        try {
            for (int i = arr.length - 1; i >= 0; i--) {
                rezult[j] = arr[i];
                j++;
            }
            return rezult;
        } catch (Exception e) {
            System.out.println("Ошибка данных");
            return null;
        }
    }

    public static String searshIndex(String[] arr, int ind) {
        try {
            return arr[ind];
        } catch (ArrayIndexOutOfBoundsException ex) {
            return "выход за пределы массива";
        }
    }

    public static int searshIndex(int[] arr, int ind) throws ArrayIndexOutOfBoundsException {
        try {
            return arr[ind];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("выход за пределы массива");
            return 0;
        }
    }


}
