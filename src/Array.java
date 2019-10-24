import java.util.Random;

public class Array {


    public static int[] createArray(int arrayLength) {
        Random random = new Random();
        int array[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static void showInfo(int[] array) {
        for (int i = 0; i < (2 * array.length); i++) {
            if (i < array.length) {
                System.out.print(array[i] + " ");
            } else
                System.out.print(array[2 * array.length - 1 - i] + " ");
        }
    }
}