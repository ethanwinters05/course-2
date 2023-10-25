package com.jap;

public class ReverseStringDemo 
{
    public static void main(String[] args) 
	{
         //Create a String object.
		 String inputstring="Technology";

        //Create an object of the class ReverseStringDemo
        ReverseStringDemo RSD=new ReverseStringDemo();
        //Call the method getReverseString() and pass the parameter
         String reversedString=RSD.getReverseString(inputstring);
		 System.out.println("Reversed String:" +reversedString);

    }
//Write the logic to reverse the String  inside the below method and return the reverse String.
public String getReverseString(String string)
{
    String reversedString= "";
	for(int i=string.length()-1;i>=0;i--)
	{
		reversedString+=string.charAt(i);
	}
        return reversedString;
    }
}
