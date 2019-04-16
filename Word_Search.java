import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word_Search 
{

	static int count = 0;

	public static String Search(String term) throws IOException
	{
		String[] line=null;
		String space;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = term;
		File f1 = new File("C:/Users/Paul/Desktop/Test.txt");


		FileReader file = new FileReader(f1);
		BufferedReader f = new BufferedReader(file);

		count =0;
			while((space=f.readLine())!=null)
			{
				line=space.split(" ");  //Splits the space from the word
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
