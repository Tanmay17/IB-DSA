class InsertionSort {

    void sort(int arr[], int arrSize) {
        for(int i=1; i<arrSize; i++) {
            int pickedValue = arr[i];
            int hole = i;
            
            while(hole>0 && arr[hole-1]>pickedValue) {
                arr[hole] = arr[hole-1];
                hole--;
            }

            arr[hole] = pickedValue;
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

        InsertionSort obj = new InsertionSort();
        obj.sort(arr, arrSize);

        System.out.println("Sorted Array:");
        printArray(arr);    
    }
}