//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Lab05a
{
	public static void main ( String[] args )
	{
      ArrayList<String> list = new ArrayList<String>();

      IteratorTest.populateListFromString(list, "A B C D E");
      out.println("Original List: " + list);

      IteratorTest.addToListFromString(list, "F G H");
      out.println("After Adding: " + list);

      IteratorTest.remove(list, "C");
      out.println("After Removing C: " + list);

      IteratorTest.replace(list, "F", "Z");
      out.println("After Replacing F with Z: " + list);

	}
}

