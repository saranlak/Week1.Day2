package Week1.Day2;

import java.util.Arrays;

public class MissingElementArray {
	
	
	public static void main(String[] args)
	{
	int[] set = {1,2,3,4,7,6,8};
	   
	Arrays.sort(set);
	
	for (int i= set[0]; i<set.length; i++)
	{
		if(i!= set[i-1])
		{
			System.out.println(i);
			
			break;
		}
	}

}
}