

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException;


public class Word_Search 
{

	static int count = 0;
	private static BufferedReader reader;

	public static String Search(String query) throws IOException
	{
		String space;
		setReader(new BufferedReader(new InputStreamReader(System.in)));
		/*System.out.println("Enter Word to Search");
		String input = reader.readLine();*/
		String input = query;
		File f1 = new File("C:/Users/Paul/Desktop/txt.txt");

		String[] line=null;

		
			FileReader file = new FileReader(f1);
			 BufferedReader f = new BufferedReader(file);

		//  While loop which will run for as long as BufferedReader object can find content
		count =0;
			while((space=f.readLine())!=null)
			{
				line=space.split(" ");  //Splits the space from he elements in the array
				for (String word : line) 
				{
					if (word.equals(input))   //Search for the given word
					{
						count++;    //If Present count is incremented
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

	public static BufferedReader getReader() {
		return reader;
	}

	public static void setReader(BufferedReader reader) {
		Word_Search.reader = reader;
	}
		} 	
