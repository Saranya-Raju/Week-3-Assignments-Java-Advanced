package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
public class SetRemoveDuplictates {

	public static void main(String[] args) {
		String S="We learn java basics as part of java sessions in java week1";
		String[] sp=S.split(" ");
		Set<String> set1 = new LinkedHashSet<String>();
		for (int i = 0; i < sp.length; i++)
		{
		set1.add(sp[i]);		
		}
		for (String str : set1) 
		{
		System.out.print(str+" ");	
		}
					
  }

}
