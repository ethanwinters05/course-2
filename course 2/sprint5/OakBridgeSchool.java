package com.jap.marksevaluation;

public class OakBridgeSchool 
{

    // Convert the given string name to upper case
    public String convertToUpperCase(String name) 
	{
        return name.toUpperCase();
    }

    // Find the shortest word in the list of surnames
    public String shortestSurname(String[] surnames) 
	{
        String shortestSurname = surnames[0];
        for (int i = 1; i < surnames.length; i++) 
		{
            if (surnames[i].length() < shortestSurname.length()) 
			{
                shortestSurname = surnames[i];
            }
        }
        return shortestSurname;
    }

    // Check if any of the names in the array is repeated, if yes return true else false
    public boolean checkIfNamesAreRepeated(String[] names) 
	{
        for (int i = 0; i < names.length - 1; i++) 
		{
            for (int j = i + 1; j < names.length; j++) 
			{
                if (names[i].equals(names[j])) //jack,john vishnu vijay
				{
                    return true;
                }
            }
        }
        return false;
    }

    // Concatenate the name and surname of the students
    public String[] concatenateNameAndSurname(String[] names, String[] surnames) 
	{
        String[] fullNames = new String[names.length];
        for (int i = 0; i < names.length; i++) 
		{
            //fullNames[i] = names[i] + " " + surnames[i];  nagendra prasad

			fullNames[i]=(names[i].concat(" ")).concat(surnames[i]);
        }
        return fullNames;
    }

    // Display the names
    public void displayStudentNames(String[] studentNames) 
	{
        for (int i = 0; i < studentNames.length; i++) 
		{
            System.out.println(studentNames[i]);
        }
    }

    public static void main(String[] args) 
	{
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Declare and Initialize values to the arrays
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
        String[] studentSurnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};

        // Call the method to convert all the student names to upper case and display results
        String[] uppercaseNames = new String[studentNames.length];
        for (int i = 0; i < studentNames.length; i++) 
		{
            uppercaseNames[i] = oakBridgeSchool.convertToUpperCase(studentNames[i]);
        }
        System.out.println("Uppercase Names:");
        oakBridgeSchool.displayStudentNames(uppercaseNames);

        // Call the method to find the shortest surname and display results
        String shortestSurname = oakBridgeSchool.shortestSurname(studentSurnames);
        System.out.println("Shortest Surname: " + shortestSurname);

        // Call the method to check if two names in the array are the same and display results
        boolean namesRepeated = oakBridgeSchool.checkIfNamesAreRepeated(studentNames);
        System.out.println("Names Repeated: " + namesRepeated);

        // Call the method to concatenate name and surname with a space in between and display results
        String[] concatenatedNames = oakBridgeSchool.concatenateNameAndSurname(studentNames, studentSurnames);
        System.out.println("Concatenated Names:");
        oakBridgeSchool.displayStudentNames(concatenatedNames);
    }
}
