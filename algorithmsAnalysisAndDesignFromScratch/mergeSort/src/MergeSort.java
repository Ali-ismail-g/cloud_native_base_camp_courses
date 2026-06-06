public class MergeSort {
    public static void sort(int[] arr,int left, int right){
        if(left >= right) return;
        int mid = left + (right-left)/2;
        //sort left half
        sort(arr,left,mid);
        //sort right half
        sort(arr,mid+1,right);
        //merge
        merge(arr,left,mid,right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        //create 2 arrays
        int n1= mid - left + 1;
        int n2= right - mid;
        int[] left_arr = new int[n1];
        int[] right_arr = new int[n2];
        //copy data
        for(int i=0;i<n1;i++){
            left_arr[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            right_arr[j]=arr[mid+1+j];
        }
        // Merge arrays
        int i=0;
        int j=0;
        int k=left;
        while(i<n1&&j<n2){
            if(left_arr[i]<=right_arr[j]){
                arr[k] = left_arr[i];
                i++;
            }else{
                arr[k] = right_arr[j];
                j++;
            }
            k++;
        }
        //copy the remaining elements
        while(i<n1){
            arr[k] = left_arr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right_arr[j];
            j++;
            k++;
        }
    }
}
