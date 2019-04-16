/*
 * Author: Paul Lanigan 
 * Date: 1/4/2019
 * Description: Class that reads in a file then searches through it to find
 * 
 * 
 */
package search_engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word_Search 
{

	static int count = 0;

	public static String Search(String query) throws IOException
	{
		String space;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = query;
		File f1 = new File("C:/Users/Paul/Desktop/Test.txt");

		String[] line=null;

		
			FileReader file = new FileReader(f1);
			 BufferedReader f = new BufferedReader(file);

		//  While loop which will run for as long as BufferedReader object can find content
		count =0;
			while((space=f.readLine())!=null)
			{
				line=space.split(" ");  //Split the word using space
				for (String word : line) 
				{
					if (word.equals(input))   //Search for the given word
					{
						count++;    //Increments count if word is present
					}
				}
			}
			if(count!=0)  //Check for count not equal to zero
		      {
		    	String return1 = "The word: "+input+", comes up a total of "+count+ " Times in the file";
		    	file.close();
		    	 return return1;
		      }
		      else
		      {
		         String return1 = "The given word is not present in the file";
		         file.close();
		    	 return return1;
		      }
		      
		         
		   }
		} 	
