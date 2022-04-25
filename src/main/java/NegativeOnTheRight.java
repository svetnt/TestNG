public class NegativeOnTheRight {

    public int[] negativeOnTheRight(int[] arr) {
        int countNegative = 0;
        for (int i : arr) {
            if (i < 0) {
                countNegative++;
            }
        }
        int[] rezult = new int[arr.length];
        int j = 0, k = arr.length - countNegative;
        for (int i : arr) {
            if (i >= 0) {
                rezult[j] = i;
                j++;
            } else {
                rezult[k] = i;
                k++;
            }
        }
        return rezult;
    }
}
