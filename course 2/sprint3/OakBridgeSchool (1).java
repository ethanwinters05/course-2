package com.jap.marksevaluation;
public class OakBridgeSchool 
{

    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
		int[] totalMark = new int[math.length];
		if(math.length==0||science.length==0||english.length==0)
		{
			return null;
		}
        else
		{
			for(int i=0;i<math.length;i++)
			{
				totalMark[i]=math[i]+english[i]+science[i];
            }
			return totalMark;
		}
	}
    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMark, int noOfSubjects)
	{
		if(noOfSubjects==0||totalMark.length==0)
		{
			return null;

		}
		else
		{
         int[] averageMark=new int[totalMark.length];

		 for(int i=0;i<totalMark.length;i++)
		 {
			 averageMark[i]=totalMark[i]/noOfSubjects;
		 }
		
        return averageMark;
		}
    }

   // Write the logic inside the method to calculate the grade based on the math mark of the student
    public char findGradeInMath(int math)
	{
        char mathGrade;

		if(math>=90)
		{
			mathGrade='A';
		}
		else if(math>=80)
		{
			mathGrade='B';
		}
        else if(math>=70)
		{
			mathGrade='C';
		}
		else if(math>=60)
		{
			mathGrade='D';
		}
		else
		{
			mathGrade='F';
		}
        return mathGrade;
    }
    // Write the logic inside the method to calculate the grade based on the science mark of the student
    public char findGradeInScience(int science){
        char scienceGrade;

		if(science>=90)
		{
		   scienceGrade='A';	
		}
		else if(science>=80)
		{
			scienceGrade='B';
		}
        else if(science>=70)
		{
			scienceGrade='C';
		}
		else if(science>=60)
		{
			scienceGrade='D';
		}
		else
		{
			scienceGrade='F';
		}

        return scienceGrade;
    }
    // Write the logic inside the method to calculate the grade based on the english mark of the student
    public char findGradeInEnglish(int english){
        char englishGrade;

		if(english>=90)
		{
		   englishGrade='A';	
		}
		else if(english>=80)
		{
			englishGrade='B';
		}
        else if(english>=70)
		{
			englishGrade='C';
		}
		else if(english>=60)
		{
			englishGrade='D';
		}
		else
		{
			englishGrade='F';
		}

		return englishGrade;
    }

    // Write the logic to sort the total marks of the students of the class, use insertion-sort

    public int[] sortByTotalMarks(int[] totalMark) {
    if (totalMark.length == 0) 
	{
        return new int[0];
    } else 
	{
        for (int i = 1; i < totalMark.length; i++)
		{
            int temp = totalMark[i];
            int j = i - 1;

            while ((j >= 0) && (totalMark[j] > temp)) 
			{
                totalMark[j + 1] = totalMark[j];
                j = j - 1;
            }
            totalMark[j + 1] = temp;
        }
        return totalMark;
    }
}

        

    //Display the details of the student
    public void displayDetails(int totalMark, int averageMark, char mathGrade, char scienceGrade, char englishGrade,String studentName, int rollNo )
		{
		System.out.println("Student Name" +studentName);
		System.out.println("rollno" +rollNo);
		System.out.println("totalMark" +totalMark);
		System.out.println("averageMark" +averageMark);
		System.out.println("mathGrade" +mathGrade);
		System.out.println("scienceGrade" +scienceGrade);
		System.out.println("englishGrade" +englishGrade);
		}

    public static void main(String[] args) 
	{

        // Declare and Initialize the object of OakBridgeSchool
		OakBridgeSchool school= new OakBridgeSchool();

        // Declare and Initialize values to the arrays to store marks of math, science, english
        int[] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        
        
        // Declare and Initialize a string array for storing student names
        String[] studentName = {"Michelle", "Kate", "Ann", "Tina", "Tom", "San", "Ria","gim","tim","arnav"};
        // Declare and Initialize an int array for storing roll numbers
        int[] rollNo = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
        // Call the appropriate methods and display the results
		int[] totalMarks = school.calculateTotalMarks(math, science, english);
        int[] averageMarks = school.calculateTotalAverageMarksForEachStudent(totalMarks, 3);
        char[] mathGrades = new char[totalMarks.length];
        char[] scienceGrades = new char[totalMarks.length];
        char[] englishGrades = new char[totalMarks.length];

        for (int i = 0; i < totalMarks.length; i++) 
        {
            mathGrades[i] = school.findGradeInMath(math[i]);
            scienceGrades[i] = school.findGradeInScience(science[i]);
            englishGrades[i] = school.findGradeInEnglish(english[i]);
            school.displayDetails(totalMarks[i], averageMarks[i], mathGrades[i], scienceGrades[i], englishGrades[i],
                    studentName[i], rollNo[i]);
        }
    }
}

