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
import java.util.Scanner;

public class Word_Search 
{
   public static void main(String[] args) throws IOException 
   {
	  File f1=new File("C:/Users/Paul/Desktop/test.txt"); //Input file
      String[] elements=null;  //Array to keep the words/elements in
      
      FileReader file = new FileReader(f1);  //File Reader object
      BufferedReader reader = new BufferedReader(file); // BufferedReader object
      
      String space; //String for Spaces
      Scanner scan = new Scanner(System.in); //Scanner to scan user's word to search
      System.out.println("Enter a term to search:"); 
      String input = scan.next();   // input word that is searched in text file
      
      
      int count=0;   //Intialize the word to zero
      
      while((space=reader.readLine())!=null)   //Reads file line by line
      {
         elements=space.split(" ");  //Splits spaces from the elements
          for (String word : elements) 
          {
                 if (word.equals(input))   //Search for the given word
                 {
                   count++;    //If Present count is incremented
                 }
          }
      }
      if(count!=0)  //Check for count not equal to zero
      {
    	  System.out.println("The word: "+input+", comes up a total of "+count+ " Times in the file");
      }
      else
      {
         System.out.println("The given word is not present in the file");
      }
      
         file.close(); //Closing the file
   }


}