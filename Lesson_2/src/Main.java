import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Task_1
//        Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

        int[] array = new int[5];
        fillArray(array);
        System.out.println(printArray(array));
        System.out.println(countEvens(array));
        System.out.println(minAndMaxDiff(array));
        System.out.println(hasNull(array));
    }
    public static void fillArray(int[] arr){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0, 11);
        }
    }

    public static String printArray(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            stringBuilder.append(" ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                count+=1;
        }
        return count;
    }

//    Task_2
//    Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.

    public static int minAndMaxDiff(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return max - min;
    }

//    Task_3
//    Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

    public static boolean hasNull(int[] arr) {
        boolean hasNull = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 && arr[i + 1] == 0)
                hasNull = true;
        }
        return hasNull;
    }
}