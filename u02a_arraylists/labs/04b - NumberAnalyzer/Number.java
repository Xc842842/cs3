//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Number
{
	private Integer number;

	public Number()
	{


	}

	public Number(int num)
	{
      setNumber(num);

	}
	
	public void setNumber(int num)
	{
      number = num;

	}
	
	public int getNumber()
	{
		return number;
	}	
	
	public boolean isOdd()
	{
		return ( number % 2 == 1);
	}
	
	public boolean isPerfect()
	{
		int total=0;
      for(int x = 1; x < number; x++)
      {
         if(number%x == 0)
         {
            total+=x;         
         }

      }

		return (number==total);
	}	
	
	public String toString( )
	{
		return "" + number;
	}
}
