//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{
   
	}

	public PascalsTriangle(int size)
	{
   mat = new int[size][size];
	}

	public void createTriangle()
	{
      int size = mat.length;
      for(int i = 0; i < size; i++)
         {
            for(int j = 0; j <= i; j++)
               {
                  if(j == 0 || j == i)
                   {
                     mat[i][j] = 1;
                   }
                   else
                   {
                     mat[i][j] = mat[i-1][j] + mat[i - 1][j - 1];
                   }
                  
                  
               }
         
         } 
   
  
	}
   
   public String toString()
	{
		String output= "";
      for(int r = 0; r < mat.length; r++)
      {
         for(int s = 0; s < mat.length; s++)
         {   
            output += mat[r][s] + " ";            
         }
      output += "\n";

      }
		return output;
	}
}

