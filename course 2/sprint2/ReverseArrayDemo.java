public class ReverseArrayDemo
 {
    public int[] getReverseArray(int[] array) 
	{
        int length = array.length;
        int[] reverseArray = new int[length];
        
        for (int i = 0; i < length; i++)
		{
            reverseArray[i] = array[length - 1 - i];
        }
        
        return reverseArray;
    }
    
    public static void main(String[] args) 
	{
        int[] array = {23, 34, 43, 56, 67, 78, 43, 35};
        
        ReverseArrayDemo reverseArrayDemo = new ReverseArrayDemo();
        int[] reversedArray = reverseArrayDemo.getReverseArray(array);
        
        // Print the reversed array
        for (int i = 0; i < reversedArray.length; i++) 
		{
            System.out.print(reversedArray[i] + " ");
        }
    }
}
