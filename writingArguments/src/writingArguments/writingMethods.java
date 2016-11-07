package writingArguments;

import java.util.Scanner;

public class writingMethods
	{

		public static void main(String[] args)
			{
				int feet = inputFeet();
				double inches = inputInches();
				double heightInInches = totalHeightInInches(feet,inches);
				print("  \nYour height in inches is " + heightInInches);
				double heightInCent =  totalHeightInCent(heightInInches);
				print("  \nYou are " + heightInCent + " centimeters tall");
				double heightInMeters =  totalHeightInMeters(heightInCent);
				print("  \nYou are " + heightInMeters + " meters tall");
				double heightBackToFeet =  totalHeightInFeet(heightInMeters);
				print("  \nYou are " + heightBackToFeet + " feet tall");
				double heightBackToInches =  totalHeightInInches1(heightBackToFeet);
				print("  \nYou are " + heightBackToInches + " inches tall");
			}
		
		public static void print(String s)  
			{
				for(int i = 0; i < s.length(); i++)
					{
						System.out.print(s.substring(i, i+1));
						try
							{
								Thread.sleep(5);
							}
								catch (InterruptedException e)
							{
								e.printStackTrace();
							}
					}
			}
		
	public static int inputFeet()
			{
				print("What is your height in feet?");
				@SuppressWarnings("resource")
				Scanner userInput = new Scanner(System.in);
				int feet = userInput.nextInt();
				return feet;
			}
	public static double inputInches()
			{
				print("What is your height in inches?");
				@SuppressWarnings("resource")
				Scanner userInput = new Scanner(System.in);
				int inches = userInput.nextInt();
				return inches;
			}
	public static double totalHeightInInches
	(int feet, double inches)
		{
			print("\nYou are " + feet + "'" + inches);
			return (feet * 12) + inches;	
		}
	public static double totalHeightInCent 
	(double heightInInches)
		{
			return (heightInInches * 2.54);
		}
	public static double  totalHeightInMeters 
	(double heightInCent)
		{
			return (heightInCent / 100);
		}
	public static double  totalHeightInFeet
	(double heightInMeters)
		{
			return (heightInMeters * 3.28084);
		}
	public static double  totalHeightInInches1
	(double heightInFeet)
		{
			return (heightInFeet * 12);
		}
	}
