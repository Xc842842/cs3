//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class VowelWord implements Comparable<VowelWord>
{
	//add a string instance variable
	private String word;
   
   
	//add a constructor

   public VowelWord(String test)
   {
      word = test;

   }


	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
      for(int j = 0;  j < word.length(); j++)
      {
      if(vowels.indexOf(word.charAt(j)) != -1)
      {
         vowelCount++;
      
      }
      }
		return vowelCount;
	}
   private int getLength()
   {
      return word.length();
   
   }

	public int compareTo(VowelWord other)
	{
      if(this.numVowels() > other.numVowels())
      {
         return 1;
      }
      if(this.numVowels() < other.numVowels())
      {
		return -1;
	   }
      return this.word.compareTo(other.word);
}
	public String toString()
	{
		return word;
	}
}

