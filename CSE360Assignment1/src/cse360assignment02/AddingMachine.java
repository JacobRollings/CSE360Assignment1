/*
 *Author: Jacob Rollings
 *File name: AddingMachine.java
 *Description: Performs addition and subtraction, keeps a running total, and prints
 *             out the operations done to the total.
 */

package cse360assignment02;	//Includes this file in the cse360assignment02

public class AddingMachine {	//beginning of the AddingMachine Class
	private int total;	//Create a private variable named total
	private String stringOfOps;	//Create a private variable stringOfOps to hold operations
	
	public AddingMachine()	//Start of the AddingMachine Constructor
	{
		total = 0;	//Set total to 0 initially
		stringOfOps = String.valueOf(total);	//Initialize the value of stringOfOps to the value of total to start
	}
	
	public int getTotal()	//Start of the getTotal method
	{
		return total;	//Return the current total
	}
	
	public void add(int value)	//Start of the add method that takes an int value as a parameter
	{
		total += value;	//Add the parameter value to the current total
		stringOfOps = stringOfOps + " + " + String.valueOf(value);	//Append " + value" to the stringOfOps variable
	}
	
	public void subtract(int value)	//Start of the subtract method that takes an int value as a parameter
	{
		total -= value;	//Subtract the parameter value to the current total
		stringOfOps = stringOfOps + " - " + String.valueOf(value);	//Append " - value" to the stringOfOps variable
	}
	
	public String toString()	//Start of the toString method that returns the string of the manipulations to total
	{
		return stringOfOps;	//return the running operations inputted
	}
	
	public void clear()	//Start of the clear method
	{
		total = 0;	//return total to it's original value
		stringOfOps = String.valueOf(total);	//Return stringOfOps to it's original value
	}
}
