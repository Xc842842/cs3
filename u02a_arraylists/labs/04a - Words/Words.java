//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class Words
{
	private ArrayList<Word> words;

	public Words()
	{  
		setWords("");
	}

	public Words(String wordList)
	{
      setWords(wordList);
	}

	public void setWords(String wordList)
	{
      words = new ArrayList<Word>();

      Scanner s = new Scanner(wordList);
      s.useDelimiter(" ");
      
      while(s.hasNext())
         {
         Word t = new Word(s.next());
         words.add(t);
        // out.println(t);
         }


	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
      Word current = new Word();
      for(int x = 0; x < words.size(); x++)
      {  
         current = words.get(x);
         if(current.getLength() == size)
         {
            count++;
         }

      }


		return count;
	}
	
	public void removeWordsWithXChars(int size)
	{
    Word u = new Word();
    for(int x = 0; x < words.size(); x++)
    {
      u = words.get(x);
      if(u.getLength() == size)
         {
            words.remove(x);
            x--;
         }





	}
   }
	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
      Word current = new Word();
      int number = 0; 

      for(int x = 0; x < words.size(); x++)
      {
         current = words.get(x);
         number = current.getNumVowels();
         if(number == numVowels)
         {
         count++;
         
         }
      }



		return count;
	}
	
	public String toString()
	{
      String total = "";
      for(int x = 0; x < words.size(); x++)
         total = total + words.get(x) + " ";
      
	   return total;
	}
}
