package com.jap.marksevaluation;

public class OakBridgeSchool 
{
    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
		if(math.length==0||science.length==0||english.length==0)
		{
			return null;
		}
		int len=math.length;
		int[]totalMarks= new int[len];

		for(int i=0;i<len;i++)
		{
			totalMarks[i]=math[i]+science[i]+english[i];
		}
        return totalMarks;
    }
    // Write the logic to calculate the average marks using recursion
   public double calculateAverageScienceMarks (int[] science,int len)
    {
		if(len==1)
		{
			return science[0];
		}
		else
		{
            double mark = science[len-1];   
			double Average=calculateAverageScienceMarks(science,len-1);
			return(Average*(len-1)+mark)/len;
		}
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageEnglishMarks (int[] english,int len)
    {
		if(len==1)
		{
			return english[0];
		}
		else
		{
			double mark = english[len-1];
			double Average=calculateAverageEnglishMarks(english,len-1);
			return(Average*(len-1)+mark)/len;
		}
         
	}
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageMathMarks (int[] math,int len)    
	{
		if(len==1)
		{
			return math[0];
		}
		else
		{
			double mark =math[len-1];
			double Average=calculateAverageMathMarks(math,len-1);
			return(Average*(len-1)+mark)/len;
		}
		 
	 }

    //Write the logic to find the top score in the class using recursion
    public int findTopScore(int [] totalMarks,int len)
	{
		if(len==1)
		{
        return totalMarks[0];
		}
		else
		{
		  int score=totalMarks[len-1];
          int topscore =findTopScore(totalMarks,len-1);
		  return Math.max(score,topscore);
		}
        
    }

    public static void main(String[] args) 
	{

        // Initialize the OakBridgeSchool class object
		OakBridgeSchool OBS = new OakBridgeSchool();

		int[] math={88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
       int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};

        // Call the appropriate methods and display the output
        int[] totalMarks=OBS.calculateTotalMarks(math,science,english);

		double averagesciencemarks=OBS.calculateAverageScienceMarks(science,science.length);

		double averageenglishmarks=OBS.calculateAverageEnglishMarks(english,english.length);

		double averagemathmarks=OBS.calculateAverageMathMarks(math,math.length);


		System.out.println("average science marks:" +averagesciencemarks);
		System.out.println("average english marks:" +averageenglishmarks);
		System.out.println("average math marks:" +averagemathmarks);

		int totalscore=OBS.findTopScore(totalMarks,totalMarks.length);
		System.out.println("top score:" +totalscore);
    }
}
