//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class Lab05b
{
	public static void main ( String[] args )
	{
      ListIteratorTest test;

      test = new ListIteratorTest("a b c d e");
      out.println(test);

      test.setTest("c");
      out.println(test);

      test.replace("b", "B");
      out.println(test);

      test.replace("d", "D");
      out.println(test);


      test = new ListIteratorTest("1 2 3 4 5 6 a b c a b c");
      out.println(test);



      test.replace("b", "#");
      out.println(test);





	}
}
