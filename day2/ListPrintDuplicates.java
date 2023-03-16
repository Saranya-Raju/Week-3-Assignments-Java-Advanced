package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListPrintDuplicates {

	public static void main(String[] args) 
	
	{
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer>dup=new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(dup);
		System.out.println(dup);			
		for (int i = 0; i < dup.size(); i++) 
		{
		for (int j = i+1; j < dup.size(); j++) 
		{
			if (dup.get(i).equals(dup.get(j))) 
			{
				System.out.println(dup.get(i));
			}
		}
			
		}
	}

}
