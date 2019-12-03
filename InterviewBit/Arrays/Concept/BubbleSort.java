class BubbleSort {
    
    void sort(int arr[], int size) {
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[j]<arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
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

        BubbleSort obj = new BubbleSort();
        obj.sort(arr, arrSize);

        System.out.println("Sorted Array:");
        printArray(arr);    
    }
}