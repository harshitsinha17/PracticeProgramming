package algoDS;
import java.util.*;

class MissingElementFromArray 
{
	
	public static void print(int []arr) {
	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
    public static List<Integer> findDisappearedNumbers(int[] array) 
    {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<array.length; i++)
        {
            int index = array[i];
            if(array[Math.abs(index) - 1] > 0)
            {
                array[Math.abs(index)-1] = -array[Math.abs(index) - 1];
            }
            System.out.println("After "+i+" iteration ");
            print(array);
        }
        
        for(int j=0; j<array.length; j++)
        {
            if(array[j] > 0)
            {
                list.add(j+1);
            }
        }
        return list;
    }
    
    public static void main(String args[]) {
    	int arr[] = {1,2,3,5,5};
    	System.out.println( findDisappearedNumbers(arr) );;
    }
}