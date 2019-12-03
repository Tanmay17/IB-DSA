class SelectionSort {

    void sort(int arr[], int arrSize){
        for (int i=0; i<arrSize-1; i++) {
            int smallIndex = i;
            for(int j=i+1; j<arrSize; j++){
                if (arr[smallIndex]>arr[j]) {
                    smallIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallIndex];
            arr[smallIndex] = temp; 
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

        SelectionSort obj = new SelectionSort();
        obj.sort(arr, arrSize);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}