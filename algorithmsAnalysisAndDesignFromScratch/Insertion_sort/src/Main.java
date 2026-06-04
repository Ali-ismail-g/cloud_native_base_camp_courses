public class Main {
    public static void main(String[] args) {
        int[] arr = {5,9,4,1};
        InsertionSort.printArr(arr);
        InsertionSort.insertionSort(arr);
        System.out.println("----------");
        InsertionSort.printArr(arr);
    }
}