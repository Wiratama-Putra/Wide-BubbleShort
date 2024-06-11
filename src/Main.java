public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 6, 5, 7, 10, 9, 8};

        bubbleSort(array);

        System.out.print("Sorted array : ");
        printArray(array);
    }

    public static void bubbleSort(int[] array){
        boolean swap;
        for (int i = 0; i < array.length - 1; i++) {
            swap = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
    }

    public static void printArray(int[] array){
        for(int a : array){
            System.out.print(a+" ");
        }
    }
}