package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetFindIntersection {

	public static void main(String[] args) {
		Integer []a= {3,2,11,4,6,7};
		Integer[]b= {1,2,8,4,9,7};
		List<Integer> inter =new ArrayList<Integer>(Arrays.asList(a));		
		List<Integer> inter1 =new ArrayList<Integer>(Arrays.asList(b));		
		for (int i = 0; i < inter.size(); i++) 
		{
			for (int j = 0; j < inter1.size(); j++) 
			{
				if( inter.get(i)==inter1.get(j))
				{
					System.out.println("The number is " +inter.get(i));
				}
				
			}
		}
	}

}
