public class SortArray {

    public int[] sortArray(int[] arr) {

        for (int j = 0; j < arr.length - 1; j++) {
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                int val;
                if (arr[i] < arr[i - 1]) {
                    val = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = val;
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
        }
        return arr;
    }
}
