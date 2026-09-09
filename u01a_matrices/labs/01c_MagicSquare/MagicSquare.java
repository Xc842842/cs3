//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] magicSquare;

	public MagicSquare()
	{
		setSize(0);
	}

	public MagicSquare(int size)
	{
     magicSquare = new int[size][size];

   
   
	}
	
	public void setSize(int size)
	{
      magicSquare = new int[size][size];
      
	}

	public void createMagic()
	{
      int value = 1;
      int row = 0;
      int size = magicSquare.length;
      int col = size/2;
      
      magicSquare[row][col] = value;
      
      for(int count = 2; count <= size * size; count++)
      {
         int oldRow = row;
         int oldCol = col;
         row--;
         col++;
         if(row < 0)
         {
            row = size - 1;
         }
         if(col == size)
         {
            col = 0;
         }
         if(row > 2)
         {
            row = size - row;
         
         }
         if(magicSquare[row][col] != 0)
         {
            row = oldRow;
            col = oldCol;
            row++;
            if(row == size)
            {
            row = 0;
            }
         }
             value++;
         magicSquare[row][col] = value;
      
      }
  
         
         
	}

	public String toString( )
	{
		String output="";
      for(int j = 0; j < magicSquare.length; j++)
         {
         for(int k = 0; k < magicSquare.length; k++)
            {
               output+= magicSquare[j][k] + " ";
            }
         output+= "\n";
         }
      
		return output;
	}
}

