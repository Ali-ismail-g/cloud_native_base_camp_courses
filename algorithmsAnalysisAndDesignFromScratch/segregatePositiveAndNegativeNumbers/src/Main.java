import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,-9,8,-4,1,-6};
        Segregation.segregate(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}