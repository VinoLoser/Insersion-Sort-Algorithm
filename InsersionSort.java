public class InsersionSort {
    public static void main(String[] args) {
        int[] array = {1,5,7,8,4,3};
        for (int i = 1; i < array.length; i++) {
            insert(array, i, array[i]);
        }
        for (int v : array) {
            System.out.println(v);
        }
    }

    public static void insert(int[] array, int arrayLength, int num) {
        int pos = arrayLength - 1;
        for (; pos >= 0; pos--) {
            if (num < array[pos]) {
                array[pos + 1] = array[pos];
            } else {
                break;
            }
        }
        array[pos + 1] = num;
    }
}