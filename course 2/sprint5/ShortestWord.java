package com.jap;


public class ShortestWord 
{
    public static void main(String[] args) 
	{

        //Declare and initialize a String array.
        String word[]= {"Java","Programming","Language"};
        // Create an object of the class ShortestWord
         ShortestWord SW=new ShortestWord();
        //Call the method findShortestWord() and pass the array.
		String shortest=SW.findShortestWord(word);
		System.out.println("Shortest word:" +shortest);
    }

    //Write the logic to find the shortest word from the String array inside
    // the below method and return the shortest word.
    public String findShortestWord(String[] word) 
	{
		if(word.length==0)
		{
			return "Cannot find shortest word as array is empty";
		}
           
	    String shortestword = word[0];

        for (int i = 1; i < word.length; i++) 
		{
            if (word[i].length() < shortestword.length()) 
			{
                shortestword = word[i];
            }
        }
        return shortestword;
    }
}
