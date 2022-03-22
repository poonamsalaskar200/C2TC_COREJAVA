/*Print 111
        11
        1
        11
        1111     */

package ArrayDemo;

public class ArrayJagged {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		        int arr[][]=new int[5][];
		        arr[0]=new int[3];
		        arr[1]=new int[2];
		        arr[2]=new int[1];
		        arr[3]=new int[2];
		        arr[4]=new int[4];
		//        System.out.println(arr);
		       
		        //inserting values
		        
		        for(int i=0; i<5; i++)
		        {
		        	for(int j=0; j<arr[i].length; j++)
		        	{
		        		int count=1;
		        		arr[i][j]=count;
		        	}
		        }
		        
		        //displaying values
		        for(int i=0; i<5; i++)
		        {
		     	  for(int j=0; j<arr[i].length; j++)
		     	  {
		     		  System.out.print(arr[i][j]);
		     	  }
		     	  System.out.println();
		        }
		        
			}

		

	}

