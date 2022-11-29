import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        // 1
        int[] arr = new int[] {1, 2, 3};
        // 2
        double[] arr1 = {1.57, 7.654, 9.986};
        // 3
        int[] arr2 = new int[4];
        arr2[0] = 7;
        arr2[1] = 8;
        arr2[2] = 9;
        arr2[3] = 10;

        System.out.println("Задача 2");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 != 0) {
                arr[i] +=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}