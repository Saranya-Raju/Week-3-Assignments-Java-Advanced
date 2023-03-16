package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String S="We learn java basics as part of java sessions in java week1";
		String[] sp=S.split(" ");
		int count=0;
		for (int i = 0; i < sp.length; i++)
		{
			for (int j = i+1; j < sp.length; j++) 
			{
			if(sp[i].equalsIgnoreCase(sp[j]))	
			{
				sp[j]="";
				count++;
			
			}
			}
			}
		if(count>1)
			for (int k = 0; k < sp.length; k++) 
			{
				System.out.print(sp[k]+" ");	
			}
		
		
	}

}
