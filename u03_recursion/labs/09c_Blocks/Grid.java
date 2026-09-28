//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Grid
{
   private String[][] grid;
   private int total;
   private int current;
   private boolean[][] visited;
   

	public Grid()
   {

	}

	public Grid(int rows, int cols, String[] vals)
	{
   
   grid = new String[rows][cols];
   current = 0;
   total = 0;

	}
	
	public void setGrid(int rows, int cols, String[] vals)
	{
      visited = new boolean[rows][cols];
      grid = new String[rows][cols];
      
      for(int j = 0; j < grid.length; j++)
         {

         for(int k = 0; k < grid[j].length; k++)
            {
               double random = Math.random() * vals.length;

               grid[j][k] = vals[(int)random];      
         
            }
   
         }

   
	}

	public int findMax(String val)
	{
      int t = 0;
      int c = 0;
      
      for(int x = 0; x < grid.length; x++)
         {
         for(int y = 0; y < grid.length; y++)
            {
            if(grid[x][y].equals(val) && visited[x][y] == false)
               {
                  t = findMax(x, y, val);
                  if(t > c)
                     {
                        c = t;
                        out.println(c);
                     }
               
               }
                total = 0;
           
            
            }
         
         
         
         }
  
      
		return c;
	}

	/*private*/ public int findMax(int r, int c, String search)
	{
      int row = r;
      int col = c;
      
      if((r < grid.length && r >= 0) && (c >= 0 && c < grid[0].length) )
      {
         if( grid[r][c] == search && visited[r][c] == false)
         {
            visited[row][col] = true;
            total++;
            findMax(row +1, col, search);
            findMax(row, col+ 1, search);
            findMax(row -1, col, search);
            findMax(row, col- 1, search);         
         
         }   
         
            

	}

      
		return total;
      
	}

	public String toString()
	{
		String output="";
      for(String[] s : grid)
      {
         for(String m : s)
         {
            output+= m + " ";
         
         }
         output+="\n";
      
      }
      
      
      
		return output;
	}
}

