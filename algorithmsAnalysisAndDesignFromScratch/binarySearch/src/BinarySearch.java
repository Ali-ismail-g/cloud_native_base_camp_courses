public class BinarySearch {
    public static int search(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;


        while(low<=high){
            int mid = low + (high - low)/ 2;
            if(arr[mid] == key) return arr[mid];
            else {
                if(key > arr[mid]){
                    low = mid + 1;
                } else if (key < arr[mid]) {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
