//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
	//add instance variables
	private String name; 
   private String category;
	
	//add a constructor
   public SiteName(String site)
   {
      name = site.substring(0, site.indexOf("."));
      category = site.substring(site.indexOf(".") + 1);
      
   }

	//add a compareTo
   public int compareTo(SiteName other)
   {
      if(!category.equals(other.category))
         {
         return category.compareTo(other.category);
         }
   
   return name.compareTo(other.name);
   
   }

	//add a toString
   
   public String toString()
   {
   
   return name + "." + category;
   
   }
   
   
}

