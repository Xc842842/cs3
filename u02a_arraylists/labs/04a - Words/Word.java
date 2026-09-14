//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
      word = new String();
	}

	public Word(String wrd)
	{
      word = new String();
      setWord(wrd);
	}

	public void setWord(String wrd)
	{
      word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
      String p = "";
      String q = "";
      for(int s = 0; s < word.length(); s++)
         {
            p = word.substring(s, s+1);
            for(int t = 0; t < vowels.length(); t++)
            {
               q = vowels.substring(t, t+1);
               if(p.equals(q))
               {
                  count++;
               }
            }
            
         }

		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}
