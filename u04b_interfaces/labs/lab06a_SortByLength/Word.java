//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Collections;
import java.util.ArrayList;

public class Word implements Comparable<Word>
{
	//add an instance variable and a constructor
   private String v;


   public Word(String s)
   {
   v = s;
   }

	//add a compareTo

   public int lengthGet()
   {
   return v.length();
   
   }

   public int compareTo(Word other)
   {
      int vLength = v.length();
      int otherL = other.lengthGet();
      if(vLength < otherL)
      {
         return -1;
      }
      if(vLength > otherL)
      {
         return 1;
      
      }
      String temp = other.toString();
      return v.compareTo(temp);
   
   }


	//add a toString
   
   public String toString()
   {
      return v;
   }
   
   
   
}

