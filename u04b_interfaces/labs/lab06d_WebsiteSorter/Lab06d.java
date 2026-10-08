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

public class Lab06d
{
	public static void main ( String[] args ) throws IOException
	{
   ArrayList<SiteName> siteList = new ArrayList<SiteName>();
   File data = new File("Lab06d.dat");
   Scanner scan = new Scanner(data);
   int numSites = scan.nextInt();
   
   for(int j = 0; j < numSites; j++)
   {
      siteList.add(new SiteName(scan.next()));
   }

   Collections.sort(siteList);
   for(SiteName s : siteList)
   {
      out.println(s);
   
   
   
   }




	}
}


