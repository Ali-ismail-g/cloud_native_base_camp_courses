public class Segregation {
    public static void segregate(int[] arr,int start ,int end){
        if(end<=start) return;
        int mid = (start+end)/2;
        segregate(arr,start,mid);
        segregate(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end){
        int i,j,k;
        int left_length = mid-start+1;
        int right_length = end-mid;
        int[] left_array = new int[left_length];
        int[] right_array = new int[right_length];

        for(i=0;i<left_length;i++){
         left_array[i] = arr[start+i];
        }
        for(j=0;j<right_length;j++){
            right_array[j] = arr[mid+j+1]; //start after the mid by 1
        }
        i=0;
        j=0;
        k=start;
        while(i<left_length &&left_array[i]<=0 ){
            arr[k] = left_array[i];
            i++;
            k++;
        }
        while(j<right_length &&right_array[j]<=0 ){
            arr[k] = right_array[j];
            j++;
            k++;
        }
        while(i<left_length){
            arr[k] = left_array[i];
            i++;
            k++;
        }
        while(j<right_length){
            arr[k] = right_array[j];
            j++;
            k++;
        }
    }
}
