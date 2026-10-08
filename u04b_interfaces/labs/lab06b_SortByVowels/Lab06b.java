//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06b
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
     ArrayList<VowelWord> words = new ArrayList<VowelWord>();

     File data = new File("lab06b.dat");
      Scanner scan = new Scanner(data);
      
      while(scan.hasNext())
      {
         words.add(new VowelWord(scan.nextLine()));

      }
      
      Collections.sort(words);
      for(VowelWord w : words)
      {
      out.println(w);
      

      }
		
	}
}

