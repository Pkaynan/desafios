package sort;

import java.util.Random;

public class Mergesort {

    public static void main(String[] args) {
        Random random = new Random();

        int array[] = new int[10];

        preenchendoArray(array, random);

        printArray(array, 2);

        mergeAndSort(array, 0, array.length - 1);

        printArray(array, 1);
    }

    static void mergeAndSort(int array[], int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeAndSort(array, left, middle);
            mergeAndSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    static void merge(int array[], int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[middle + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    static int[] preenchendoArray(int array[], Random random) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    static void printArray(int[] array, int organizado) {

        switch (organizado) {
            case 1:
                System.out.println("\norganizado: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                break;
            case 2:
                System.out.println("desorganizado: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                break;

            default:
                break;
        }
    }
}
