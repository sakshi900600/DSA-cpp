import java.util.*;
public class sorting {



    public static void mergeSort(int arr[], int si, int ei){
        if(si < ei){
        // int mid = (si+(ei-si)) /2;
        int mid = (si+ei) /2;
        mergeSort(arr, si, mid);  
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
        }
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[] = new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // rest elem
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(int x=0,y=si; x<temp.length; x++,y++){
            arr[y] = temp[x];
        }
    }


    public static void quickSort(int arr[], int si, int ei){
        if(si < ei){
            int pivot = partition(arr,si,ei);

            quickSort(arr, si, pivot-1);
            quickSort(arr, pivot+1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i= si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // put i at it correct index;
        int temp = arr[i+1];
        arr[i+1] = arr[ei];
        arr[ei] = temp;
        return i+1;
    }


    // counting sort --------------------------------
    public static void countingSort(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }

        int count[] = new int[max+1];
        Arrays.fill(count, 0);

        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }

        // cumulative count
        for(int i=1; i<count.length; i++){
            count[i] = count[i] + count[i-1];
        }

        int output[] =  new int[n];
        for(int i=n-1; i>=0; i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]] = count[arr[i]]--;
        }

        // copy output to arr
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }

    // heap sort --------------------------------
    public static void heapify(int arr[], int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int arr[]){
        int n = arr.length;

        // build heap
        for(int i=n/2 - 1; i>=0; i--){
            heapify(arr, n, i);
        }

        // extract elements from heap
        for(int i=n-1; i>=0; i--){
            // move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    // radix sort --------------------------------
    public static void countingSortForRadix(int arr[], int exp){
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // store count of occurrences
        for(int i=0; i<n; i++){
            count[(arr[i]/exp) % 10]++;
        }

        // change count[i] so that it contains actual position of this digit in output[]
        for(int i=1; i<10; i++){
            count[i] += count[i-1];
        }

        // build the output array
        for(int i=n-1; i>=0; i--){
            output[count[(arr[i]/exp) % 10] - 1] = arr[i];
            count[(arr[i]/exp) % 10]--;
        }

        // copy the output array to arr[]
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }   

    public static void radixSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        // do counting sort for every digit
        for(int exp=1; max/exp > 0; exp *= 10){
            countingSortForRadix(arr, exp);
        }
    }

    



    public static void main(String[] args) {

        // System.out.println(4);

        int arr[] = { 5, 3, 2, 4, 1 };
        int n = arr.length;

        // bubble Sort ------------------------------------
        // for(int i=0; i<=n-2; i++){
        // for(int j=i+1; j<=n-1; j++){
        // if(arr[j] < arr[i]){
        // // swap
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }

        // selection sort ----------------------------------
        // for (int i = 0; i < n; i++) {
        //     int min = i;
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[j] < arr[min]) {
        //             min = j;
        //         }
        //     }

        //     int temp = arr[i];
        //     arr[i] = arr[min];
        //     arr[min] = temp;
        // }


        // insertion sort ----------------------
        // for(int i=0; i<n; i++){

        //     while(i >0 && arr[i] < arr[i-1]){
        //         int temp = arr[i];
        //         arr[i] = arr[i-1];
        //         arr[i-1] = temp;
        //         i--;
        //     }
        // }


        // merge sort --------------------------------
        // mergeSort(arr, 0, n - 1);


        // quick sort --------------------------------
        // quickSort(arr, 0, n-1);


        // counting sort -----------------------------
        countingSort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
