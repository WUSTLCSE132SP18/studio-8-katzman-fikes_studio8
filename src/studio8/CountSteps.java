package studio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
public class CountSteps
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File f = new File("/Users/ikatzman/git/studio-8-katzman-fikes_studio8/data/studio8.csv");
		Scanner in = new Scanner(f);
		String[] zArray = new String[401];
		for(int i = 0; i < 401; i++)
		{
			String line = in.nextLine();
//			String [] array = new String[3];
			String[] array = line.split(",");
			System.out.println(array[2]);
			zArray[j] = 
			System.out.println();	
		}
	}
}