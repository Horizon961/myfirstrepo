package testingProject_console;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorldTest {

	public static void main(String[] args) throws FileNotFoundException
	{
		
		System.out.println("What shape do you  want?");
		String answer = "";
		Scanner scanner = new Scanner(System.in);
		answer = scanner.nextLine();
		if(answer.equalsIgnoreCase("Square"))
		{
			System.out.println("Please provide a length");
			answer = scanner.nextLine();
			String length = answer;			
			System.out.println("Please provide a breadth");
			answer = scanner.nextLine();
			String breadth = answer;
			int lengthArea = Integer.parseInt(length);
			int breadthArea = Integer.parseInt(breadth);
			int area = lengthArea*breadthArea;
			System.out.println(area);
		}
		else if(answer.equalsIgnoreCase("Rectangle"))
		{
//			System.out.println("Please provide a length");
//			int  length = scanner.nextInt();
//			System.out.println("Please provide a breadth");
//			int breadth = scanner.nextInt();
//			int area = length*breadth;
//			System.out.println(area);
			int area = 0;
			System.out.println("Please provide a length");
			area = scanner.nextInt();
			System.out.println("Please provide a breadth");
			area = area*scanner.nextInt();
			
			System.out.println(area);
		}
		else if(answer.equalsIgnoreCase("file")) 
		{
			Scanner fileReader = new Scanner(new File("C:\\\\Users\\\\User\\\\Documents\\\\lines.txt"));
			while(fileReader.hasNextLine())
			{
				System.out.println(fileReader.nextLine());
			}
		}
		else if(answer.equalsIgnoreCase("planes"))
		{
			Scanner fileReader = new Scanner(new File("C:\\\\Users\\\\User\\\\Documents\\\\lines.txt"));
			plane[] planes = new plane[3];
			int  counter = 0;
			String plannees = "";
			while(fileReader.hasNextLine())
			{
				plannees = fileReader.nextLine();
				if(plannees.contains(":"))
				{
//					planes[counter].model = plannees;
//					planes[counter].price = plannees;
//					planes[counter].range = plannees;
					if(plannees.contains("model"))
					{
						planes[counter].model = plannees;
					}
					if(plannees.contains("price"))
					{
						planes[counter].price = plannees;
					}
					if(plannees.contains("range"))
					{
						
						planes[counter].range = plannees;
					}
					
				}
				else
				{
					if(plannees.length() == 0)
					{
						
						counter++;
					}
					else
					{
						planes[counter] = new plane();
					}
				}
			}
			
		}
		else
		{
			System.out.println("Sorry shape is unknown");
		}
		
		
		
//		System.out.println("What is your name?");
//		String answer = "";
//		Scanner scanner = new Scanner(System.in);
//		answer = scanner.nextLine();
//		
//		classroom newClassroom = new classroom(answer);
//		System.out.println(newClassroom.teacher);
//		newClassroom.teacher = "dede";
//		System.out.println(newClassroom.teacher);
//		System.out.println("How many students do you have?");
//		answer = scanner.nextLine();
//		int amntOfStudents = Integer.parseInt(answer);
//		for(int counter = 0; counter < amntOfStudents; counter++)
//		{
//			System.out.println("What is the students name?");
//			answer = scanner.nextLine();
//			newClassroom.students[counter] = answer;
//		}
//		for(int counter2 = 0; counter2 < amntOfStudents; counter2++)
//		{
//			System.out.println(newClassroom.students[counter2]);
//		}
		
//		int[]  numbers = new int[5];
//		for(int counter = 0; counter < 5; counter++)
//		{
//			numbers[counter] = 23;
//			
//		}
		
//		for(int counter2 = 0; counter2 < 5; counter2++)
//		{
//			System.out.println(counter2 + " " + numbers[counter2]);
//		}
//		
//		for(int counter3 = 4; counter3 > -1; counter3--)
//		{
//			System.out.println(counter3 + " " + numbers[counter3]);
//		}
		
//		boolean run = true;
//		int counter = 0;
//		while(run ==  true)
//		{
//			System.out.println(counter + " " + numbers[counter]);
//			counter++;
//			
//			if(counter >= 5)
//			{
//				run = false;
//			}
//		}
		
	}
	
	

}
