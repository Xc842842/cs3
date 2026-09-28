//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab09c
{
	public static void main( String args[] ) throws IOException
	{
   String[] c = {"A","E","I", "O"};
   Grid g = new Grid(12,12, c);
   g.setGrid(12,12,c);
   
   g.toString();
   out.println(g);
   out.println(g.findMax("A"));
   
	}
}

