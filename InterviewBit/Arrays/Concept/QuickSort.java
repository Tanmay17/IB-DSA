class QuickSort{

    int partition(int arr[], int low, int high){
        int i = low - 1;

        for (int j=low; j<high; j++){
            if( arr[j]<arr[high] ){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high){
        if( low < high ){
            int pivotIndex = partition(arr, low, high);

            sort(arr, low, pivotIndex-1);
            sort(arr, pivotIndex+1, high);
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

        QuickSort obj = new QuickSort();
        obj.sort(arr, 0, arrSize-1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}