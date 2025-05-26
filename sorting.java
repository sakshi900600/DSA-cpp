
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
        quickSort(arr, 0, n-1);




        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
