package interview;

//careers2@persistent.com
public class ReplaceTheZero {

	public static void main(String[] args) {
		
		int []  numbers ={0,1,3,5,0,6,2,0,6,9,0};
		int [] newArray= new int[numbers.length];
		int count=0;
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]==0)
			{
				newArray[i]=numbers[i];// all zero
				count++;
				
			}
			
		}
	
		
		
		
	}
}
