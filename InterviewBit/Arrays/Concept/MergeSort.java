class MergeSort{
    int merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start + 1];

        int i = start, j = mid+1, k = 0;
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k += 1; i += 1;
            }
            else {
                temp[k] = arr[j];
                k += 1; j += 1;
            }
        }

        while(i <= mid) {
            temp[k] = arr[i];
            k += 1; i += 1;
        }
    
        while(j <= end) {
            temp[k] = arr[j];
            k += 1; j += 1;
        }

        for(i = start; i <= end; i += 1) {
            arr[i] = temp[i - start];
        }

        return arr;
    }

    void sort(int arr[], int start, int end){
        if(start<end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid);
            sort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
    } 

    public static void main(String[] args) {
        int arr[] = {2,5,1,6,4,7,3};
        int arrSize = arr.length;
        
        System.out.println("Actual Array:");
        printArray(arr);

        MergeSort obj = new MergeSort();
        obj.sort(arr, 0, arrSize);

        System.out.println("Sorted Array:");
        printArray(arr);    
    }
}