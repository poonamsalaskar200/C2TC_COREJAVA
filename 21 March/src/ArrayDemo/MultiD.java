// Multidimensional array
package ArrayDemo;

public class MultiD
{
   public static void main(String[] args) 
   {
   int x[][]=new int[3][3];
   int x1[][]={{2,7,9},{3,6,1},{7,4,2}};
   x[0]=new int[3];
   x[1]=new int[3];
   x[2]=new int[3];
   for(int i=0; i<3; i++)
   {
	  for(int j=0; j<3; j++)
	  {
		  System.out.print(x1[i][j]);
	  }
	  System.out.println();
   }
   
   }
		   
}
