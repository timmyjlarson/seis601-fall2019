
public class BubbleSort 
{
	public static void main(String[] args)
	{
		BubbleSort bubbleSort = new BubbleSort();
		int array[] = {12, 43, 56, 74, 92};
		System.out.println("Unsorted array: ");
		bubbleSort.printArray(array);
		bubbleSort.bubbleSort(array);
		System.out.println("Sorted array: ");
		bubbleSort.printArray(array);		
	}
	
    public void printArray(int arr[]) 
    { 
        int length = arr.length; 
        for (int i=0; i<length; ++i)
        {
            System.out.print(arr[i] + " "); 
        }
        System.out.println(); 
    } 
    
    public void bubbleSort(int array[])
    {
    	int length = array.length;
    	for(int i = 0; i <length; i++)
    	{
    		for(int j = 0; j <(length - i -1); j++)
    		{
    			if(array[j]> array[j+1])
    			{
    				int temp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = temp;
    			}
    		}
    	}
    }
}
