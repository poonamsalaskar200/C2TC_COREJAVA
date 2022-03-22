/*HOMEWORK print 123
                 45
                 6
                 78
                 9101112*/

package ArrayDemo;

public class JaggedArr 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int arr[][]=new int[5][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[1];
        arr[3]=new int[2];
        arr[4]=new int[4];
       
        //inserting values
        int count=1;
        for(int i=0; i<5; i++)
        {
        	for(int j=0; j<arr[i].length; j++)
        	{
        		
        		arr[i][j]=count++;
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        
        //displaying values
       // for(int i=0; i<5; i++)
        //{
     	 // for(int j=0; j<arr[i].length; j++)
     	  //{
     		//  System.out.print(arr[i][j]);
     	  //}
     	  //System.out.println();
        }
        
	}


