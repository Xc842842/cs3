//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{

	}

	public NumberAnalyzer(String numbers)
	{
      setList(numbers);
	}
	
	public void setList(String numbers)
	{
      String[] test = numbers.split(" ");
      Number n = new Number();
      list = new ArrayList<Number>();
      out.println(list);
      for(String s : test)
      {
         int k = Integer.parseInt(s);
         Number j = new Number(k);
         list.add(j);
      
      }
	
	}

	public int countOdds()
	{
      int oddCount=0;
      for(Number n : list)
      {
         if(n.isOdd())
         {
            oddCount++;
         }
      }
      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;
      for(Number S : list)
      {
         if(S.isOdd() == false)
         {
            evenCount++;
         
         }
      }

      return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;
      for(Number V : list)
      {
         if(V.isPerfect())
         {
            perfectCount++;
         }
      
      
      }
      return perfectCount;
	}
	
	public String toString( )
	{
      String total = "";
      for(Number n : list)
      {
         total = total + " " + n;
      }      
		return total;
	}
}
