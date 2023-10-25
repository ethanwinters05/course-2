package com.jap.marksevaluation;
public class OakBridgeSchool 
{
    public int[] calculateTotalMarks(int[] math, int[] science, int[] english) 
	{
        int[] totalMarks = new int[math.length];

        for (int i = 0; i < math.length; i++) 
		{
            totalMarks[i] = math[i] + science[i] + english[i];
        }

        return totalMarks;
    }

   public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects) 
   {
    int[] averageMarks = new int[totalMarks.length];

    
        for (int i = 0; i < totalMarks.length; i++) 
		{
            averageMarks[i] = totalMarks[i] / noOfSubjects;
        }
    

    return averageMarks;
}


   public int calculateAverageScienceMarks(int[] science) 
   {
    int sum = 0;
    int length = science.length;

    
	
        for (int i=0;i<science.length;i++) 
		{
            sum += science[i];
        }

        return sum / length;
    

   }


   public int calculateAverageEnglishMarks(int[] english) 
   {
    int sum = 0;
    int length = english.length;

    
        for (int i=0;i<english.length;i++) 
		{
            sum +=english[i];
        }

        return sum / length;
   }
    

   


    public int calculateAverageMathMarks(int[] math) 
	{
    int sum = 0;
    int length = math.length;

        for (int i=0;i<math.length;i++) 
		{
            sum += math[i];
        }

        return sum / length;
    
	}



    public static void main(String[] args) 
	{
        int[] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "San", "Ria"};
        int[] rollNos = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};

        OakBridgeSchool obs = new OakBridgeSchool();

        int[] totalMarks = obs.calculateTotalMarks(math, science, english);
        int[] averageMarks = obs.calculateTotalAverageMarksForEachStudent(totalMarks, 3);

        for (int i = 0; i < studentNames.length; i++) 
		{
            System.out.println("Student Name: " + studentNames[i] + "  Roll Number: " + rollNos[i]);
            System.out.println("Total Marks: " + totalMarks[i]);
            System.out.println("Average Marks: " + averageMarks[i]);
            System.out.println();
        }

        int averageScience = obs.calculateAverageScienceMarks(science);
        int averageMath = obs.calculateAverageMathMarks(math);
        int averageEnglish = obs.calculateAverageEnglishMarks(english);

        System.out.println("Average Science marks scored by the class is: " + averageScience);
        System.out.println("Average Math marks scored by the class is: " + averageMath);
        System.out.println("Average English marks scored by the class is: " + averageEnglish);
    }
}
