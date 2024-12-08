import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 5.1");
        System.out.println("Задача 1");

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double[] array2 = new double[3];
        array2[0] = 1.57;
        array2[1] = 7.654;
        array2[2] = 9.986;

        int[] array3 = {5, 8, 15};

        System.out.println("Задача 2");

        System.out.print("Элементы array1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Элементы array2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Элементы array3: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i < array3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 3");

        System.out.print("Элементы array1 в обратном порядке: ");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Элементы array2 в обратном порядке: ");
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.print("Элементы array3 в обратном порядке: ");
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }

        System.out.println("Преобразованный массив: " + Arrays.toString(array1));
    }
}