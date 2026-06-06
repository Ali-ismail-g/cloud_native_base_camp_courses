import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        MergeSort.sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}