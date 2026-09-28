//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private boolean[][] checker;

   
	public AtCounter() {
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	   checker = new boolean[atMat.length][atMat[0].length];
      atCount = 0;
   
   
   }

	public void countAts(int r, int c) {

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
      int row = r;
      int col = c;
      
      if((r < atMat.length && r >= 0) && (c >= 0 && c < atMat[0].length) )
      {
         if( atMat[r][c] == '@' && checker[r][c] == false)
         {
            checker[row][col] = true;
            atCount++;;
            countAts(row +1, col);
            countAts(row, col+ 1);
            countAts(row-1, col);
            countAts(row, col-1);         
         
         }      

	}
}
	public String toString() {
		String output="";
		output+=atCount+" @s connected.";
		return output;
	}
}
