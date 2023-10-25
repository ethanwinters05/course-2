package com.jap;

public class SortingAge 
{

    //Write the logic to sort the array containing the age in descending order
    // inside the below method and return the sorted array
    public int[] getSortedAge(int[] ageArray)
	{
		for (int i=0;i<ageArray.length-1;i++)
		{
			for(int j=0;j<ageArray.length-i-1;j++)
			{
				if(ageArray[j]<ageArray[j+1])
				{
					int temp=ageArray[j];
					ageArray[j]=ageArray[j+1];
					ageArray[j+1]=temp;
				}
			}
		}

        return ageArray;

    }

    public static void main(String[] args) 
	{
		int ageArray[]={22,34,33,32,36,27,28};
        //Declare and initialize an integer array containing age
		SortingAge sortingage=new SortingAge();
        //Create an object of the class SortingAge
        int sortedArray[]=sortingage.getSortedAge(ageArray);
        //Call the method getSortedAge and pass the parameter

		System.out.println("Sorted Age array:");
		for(int age:sortedArray)
		{
			System.out.println(age+" ");
		}
		
	}
}
