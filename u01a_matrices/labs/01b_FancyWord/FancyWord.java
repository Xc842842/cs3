//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;
   private int d;
	public FancyWord()
	{
		mat=new char[0][0];
      
	}

   public FancyWord(String word)
	{
   mat = new char[word.length()][word.length()];
	d = 1;
   for(int i = 0; i < mat.length; i++)
   {
      mat[0][i] = word.charAt(i);
      mat[i][i] = word.charAt(i);
      mat[word.length() - 1 - i][i] = word.charAt(i);
      mat[word.length() - 1][i] =word.charAt(i);

   }
}



	public String toString()
	{
		String output="";

      for (int i = 0; i < mat.length; i++ )
      {
         for(int j = 0; j < mat[i].length; j++ )
         {
            output += mat[i][j] + " ";
         }
         output += "\n";
      }   
		return output + d;
	}
}

